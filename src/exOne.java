import  java.util.Scanner;

public class exOne {
    public static void printDigits(int n) {
        if (n < 10) {System.out.println(n);}
        else {
            printDigits(n / 10);
            System.out.println(n % 10);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        printDigits(number);
        sc.close();
    }
}