import java.util.stream.IntStream;

public class MultiplesOf3or5 {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int number) {
            // Use IntStream to iterate through numbers below the input number
            return IntStream.range(0, number) // Generates a range of integers from 0 to number-1
                    .filter(i -> i % 3 == 0 || i % 5 == 0) // Keep only multiples of 3 or 5
                    .sum(); // Sum up the filtered numbers
    }


}
