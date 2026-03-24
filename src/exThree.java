import java.util.Scanner;

public class exThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number, 2)) {
            System.out.println("Prime");
        }
        else {System.out.println("Composite");}
        sc.close();
    }

    public static boolean isPrime(int n, int d) {
        if (n <= 1) {return false;}
        else if (d * d > n) {
            return true;
        }
        else if (n % d == 0) {
            return false;
        }
        else {
            return isPrime(n, d + 1);
        }
    }
}