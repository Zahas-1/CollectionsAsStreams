import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        // Convert array b to a Set for faster lookups
        Set<Integer> bSet = Arrays.stream(b).boxed().collect(Collectors.toSet());

        // Filter array a, keeping only elements not in bSet
        return Arrays.stream(a)
                .filter(n -> !bSet.contains(n))
                .toArray();
    }

}
