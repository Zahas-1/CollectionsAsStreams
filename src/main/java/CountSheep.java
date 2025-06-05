/*
Given a non-negative integer, 3 for example, return a string with a murmur:
"1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSheep {
    public static String countingSheep(int num) {
        String theseSheep = "";
        for(int i = 1; i <= num; i++){
            theseSheep += (i + " sheep...");
        }
        return theseSheep;
    }

    public static String countingSheepStream(int num) {
        return IntStream.rangeClosed(1, num)  // Stream of integers from 1 to num
            .mapToObj(i -> i + " sheep...")  // Map each number to "i sheep..."
            .collect(Collectors.joining());  // Join all strings together
        }
}
