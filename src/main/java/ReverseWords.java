import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(final String original) {
        // Splitting the string using regex that preserves spaces
        return Arrays.stream(original.split("(?<= )|(?= )"))
                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
                .collect(Collectors.joining("")); // Join them back into a single string
    }


    //Test cases
    public static void main(String[] args){
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("apple") );;
        System.out.println(reverseWords("a b c d"));
        System.out.println(reverseWords("  double  spaced  words  "));
        System.out.println(reverseWords(""));
        System.out.println(reverseWords("       "));
    }
}
