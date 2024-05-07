public class EvenNumbers
 {
    public static void main(String[] args) throws Exception {
        int start = 20;
        int end = 30;
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i < end; i++){
            if (i%2 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
