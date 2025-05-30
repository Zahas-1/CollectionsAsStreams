import java.util.Arrays;

public class CalculateAverage {
    public static double findAverage(int[] array) {
        //Return as an int stream
        return Arrays.stream(array)
                //Calculate the average
                .average()
                //Return 0 if array is empty
                .orElse(0);

    }
}
