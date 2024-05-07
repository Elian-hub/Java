import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) throws Exception {
        Integer[] numbers = {5,7,8,9,14,99};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("descending order:"+ Arrays.toString(numbers));
    }
}
