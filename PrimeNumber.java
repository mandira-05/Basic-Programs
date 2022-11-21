import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if its prime");
        int n = scanner.nextInt();
        int flag = 0;

        for (int i = 2; i<= n/2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag!=1) {
            System.out.println(n+ " number is prime");
        } else {
            System.out.println(n+ " number is not prime");
        }

    }
}
