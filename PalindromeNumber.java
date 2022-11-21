import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number  = scanner.nextInt() ;
        int remainder,reverse=0;
        int temp = number;

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse*10 + remainder;
            number = number/10;
        }

        if (temp == reverse) {
            System.out.println(temp+ " is a pallidrome");
        }else {
            System.out.println(temp+ " is not a pallidrome");
        }

    }
}
