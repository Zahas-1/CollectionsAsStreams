//Complete the solution so that it returns true if the first argument(string)
//passed in ends with the 2nd argument (also a string).
//
//Examples:
//
//solution('abc', 'bc') // returns true
//solution('abc', 'd') // returns false


import java.util.stream.IntStream;


public class StringEndsWith {

    //Solution using the Java  function
    public static boolean bestSolution(String str, String ending) {
            return str.endsWith(ending);

    }

    //Solution using the a stream function
    public static boolean streamSolution(String str, String ending) {
        if (ending.length() > str.length()) {
            return false; // `ending` can't be longer than `str`
        }

        return IntStream.range(0, ending.length())
                .allMatch(i -> str.charAt(str.length() - ending.length() + i) == ending.charAt(i));
    }

    //Test cases
    public static void main(String[] args) {

        System.out.println("Results using streams:" );
        System.out.println(streamSolution("abc", "bc"));  // true
        System.out.println(streamSolution("abc", "d"));   // false
        System.out.println(streamSolution("hello", "lo"));// true
        System.out.println(streamSolution("hello", ""));  // true

        System.out.println("\r\nResults using java endsWith function:");
        System.out.println(bestSolution("abc", "bc")); // true
        System.out.println(bestSolution("abc", "d"));  // false
        System.out.println(bestSolution("hello", "lo")); // true
        System.out.println(bestSolution("hello", ""));  // true
    }
}
