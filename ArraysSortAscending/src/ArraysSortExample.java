import java.util.Arrays;
public class ArraysSortExample {
    public static void main(String[] args) throws Exception {
        // Declare and Initialize an array
        int [] numbers = {5,2,8,1,7};
        System.out.println("original array:"+Arrays.toString(numbers));
        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("sorted array:"+Arrays.toString(numbers));

    }
}
