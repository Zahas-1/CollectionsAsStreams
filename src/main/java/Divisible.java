import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        // Call the divisible method to filter the numbers
        ArrayList<Integer> divisible = divisible(numbers);

        // Print the numbers that are divisible by 2, 3, or 5
        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    // Method to filter numbers that are divisible by 2, 3, or 5
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(i -> (i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
