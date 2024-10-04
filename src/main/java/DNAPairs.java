import java.util.stream.Collectors;

public class DNAPairs {

    // This method takes a DNA string and returns its complement.
    // For each character in the input string, it finds the complementary base
    // and constructs a new string of complements.
    public static String makeComplement(String dna) {
        // Convert the DNA string to a stream of characters (as ASCII values)
        return dna.chars()
                // For each character, map it to its corresponding complement
                .mapToObj(c -> {
                    // Use a switch statement to find the complementary base
                    switch (c) {
                        case 'A' : return "T";  // 'A' pairs with 'T'
                        case 'T' : return "A";  // 'T' pairs with 'A'
                        case 'G' : return "C";  // 'G' pairs with 'C'
                        case 'C' : return "G";  // 'C' pairs with 'G'
                        default : throw new IllegalArgumentException("Invalid DNA Character");
                            // If an invalid character is found, throw an exception
                    }
                })
                // Collect the mapped characters into a single string using joining()
                .collect(Collectors.joining());
    }

    // Main method to test the makeComplement function
    public static void main(String[] args) {
        // Test with a sample DNA string "ATCG"
        String DNA = "ATCG";
        // Print the complement of "ATCG", which should be "TAGC"
        System.out.println(makeComplement(DNA));  // Output: TAGC
    }
}
