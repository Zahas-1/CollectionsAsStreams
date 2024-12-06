import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedOdds {
    public static int[] sortArray(int[] array){
        //Collect and sort the odd numbers from the array
        List<Integer> sortedOdds = Arrays.stream(array)
                .filter(i -> i % 2 != 0) //Filter only odd numbers
                .sorted()                //Sort the odd numbers
                .boxed()                 //Box the ints into Integers for easier list manipulation
                .collect(Collectors.toList());

        //Use IntStreams to build a new array, replacing the odd numbers with sorted ones
        return IntStream.range(0, array.length)
                .map(i -> array[i] % 2 == 0 ? array[i] : sortedOdds.remove(0))
                //Keen even numbers as they are, and for the odd numbers, replace with the sorted ones
                .toArray(); //Convert back to an int[] array to meet the return requirements

    }

    //Test the code
    public static void main(String[] args) {
        int[] arra = {9,7,5,3,1,8,6,2,4};
        int[] sortedArr = sortArray(arra);
        //Print the result
        System.out.println(Arrays.toString(sortedArr));
    }
}
