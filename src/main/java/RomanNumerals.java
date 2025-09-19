/*
Write two functions that convert a roman numeral to and from an integer value.
Multiple roman numeral values will be tested for each function.

Modern Roman numerals are written by expressing each digit separately starting
with the left most digit and skipping any digit with a value of zero. In Roman numerals:

1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC
2008 is written as 2000=MM, 8=VIII; or MMVIII
1666 uses each Roman symbol in descending order: MDCLXVI.
Input range : 1 <= n < 4000

In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").

Examples
to roman:
2000 -> "MM"
1666 -> "MDCLXVI"
  86 -> "LXXXVI"
   1 -> "I"

from roman:
"MM"      -> 2000
"MDCLXVI" -> 1666
"LXXXVI"  ->   86
"I"       ->    1

+--------+-------+
| Symbol | Value |
+--------+-------+
|    M   |  1000 |
|   CM   |   900 |
|    D   |   500 |
|   CD   |   400 |
|    C   |   100 |
|   XC   |    90 |
|    L   |    50 |
|   XL   |    40 |
|    X   |    10 |
|   IX   |     9 |
|    V   |     5 |
|   IV   |     4 |
|    I   |     1 |
+--------+-------+

 */

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    // Use LinkedHashMap to preserve insertion order (important for "greedy" conversion)
    private static final LinkedHashMap<String, Integer> romanToInt = new LinkedHashMap<>();
    private static final LinkedHashMap<Integer, String> intToRoman = new LinkedHashMap<>();

    // Static block: initialize once
    static {
        // Put values from largest to smallest
        romanToInt.put("M", 1000);
        romanToInt.put("CM", 900);
        romanToInt.put("D", 500);
        romanToInt.put("CD", 400);
        romanToInt.put("C", 100);
        romanToInt.put("XC", 90);
        romanToInt.put("L", 50);
        romanToInt.put("XL", 40);
        romanToInt.put("X", 10);
        romanToInt.put("IX", 9);
        romanToInt.put("V", 5);
        romanToInt.put("IV", 4);
        romanToInt.put("I", 1);

        // Build reverse map (Integer → Roman)
        for (Map.Entry<String, Integer> entry : romanToInt.entrySet()) {
            intToRoman.put(entry.getValue(), entry.getKey());
        }
    }

    /**
     * Convert integer to Roman numeral (greedy method).
     * Example: 1990 → "MCMXC"
     */
    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();

        // Go through each Roman value in descending order
        for (Map.Entry<Integer, String> entry : intToRoman.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            // While we can subtract this value, append the symbol
            while (n >= value) {
                result.append(symbol);
                n -= value;
            }
        }

        return result.toString();
    }

    /**
     * Convert Roman numeral string to integer (subtractive method).
     * Example: "MCMXC" → 1990
     */
    public static int fromRoman(String romanNumeral) {
        int total = 0;
        int i = 0;

        while (i < romanNumeral.length()) {
            // Get value of current symbol
            int curr = romanToInt.get(String.valueOf(romanNumeral.charAt(i)));

            // Look ahead: if next symbol exists and is larger, do subtraction
            if (i + 1 < romanNumeral.length()) {
                int next = romanToInt.get(String.valueOf(romanNumeral.charAt(i + 1)));

                if (curr < next) {
                    // Example: IV → 4 (5 - 1)
                    total += (next - curr);
                    i += 2; // skip both characters
                    continue;
                }
            }

            // Otherwise, just add the current value
            total += curr;
            i++;
        }

        return total;
    }

    // Quick test cases
    public static void main(String[] args) {
        // fromRoman tests
        System.out.println(fromRoman("MM"));       // 2000
        System.out.println(fromRoman("MDCLXVI"));  // 1666
        System.out.println(fromRoman("LXXXVI"));   // 86
        System.out.println(fromRoman("I"));        // 1
        System.out.println(fromRoman("MCMXC"));    // 1990

        // toRoman tests
        System.out.println(toRoman(2000));  // "MM"
        System.out.println(toRoman(1666));  // "MDCLXVI"
        System.out.println(toRoman(86));    // "LXXXVI"
        System.out.println(toRoman(1));     // "I"
        System.out.println(toRoman(1990));  // "MCMXC"
    }
}
