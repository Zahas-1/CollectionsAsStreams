public class CountingBits {
    public static int countBits(int n){
        // Convert the integer to a binary string
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary representation: " + binary);

        // Use a stream to count the occurrences of '1' in the binary string
        long count = binary.chars()  // Get the stream of characters
                .filter(ch -> ch == '1')  // Filter only '1' characters
                .count();  // Count the number of '1's

        return (int) count;   // Return the count
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));  // Should output 5 (since 1234 in binary is 10011010010)
    }
}
