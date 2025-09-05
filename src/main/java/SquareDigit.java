/*
square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out,
because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36,
and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.
 */
import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(

                // Convert number to String → e.g., 9119 → "9119"
                String.valueOf(n)

                        // Get an IntStream of characters ('9','1','1','9')
                        .chars()

                        // Convert each char to its digit (9,1,1,9)
                        .map(Character::getNumericValue)

                        // Square each digit (81,1,1,81)
                        .mapToObj(d -> String.valueOf(d * d))

                        // Join them all into one String ("811181")
                        .collect(Collectors.joining())
        );
    }
}


