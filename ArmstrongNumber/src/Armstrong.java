import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();
        int originalNumber, remainder, result=0, n = 0;
        originalNumber = number;
        for(originalNumber=number;originalNumber!=0;originalNumber/=10){
            n++;
        }
        originalNumber = number;
        while(originalNumber!=0){
            remainder=originalNumber%10;
            result+= Math.pow(remainder,n);
            originalNumber/=10;
        }
        if (result==number)
        System.out.println(number +" is an armstrong number");
        else
        System.out.println(number + " is not an armstrong number");
    }
}
