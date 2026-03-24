import java.util.Scanner;

public class exSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.println(power(base, exp));
        sc.close();
    }

    public static int power(int base, int exp) {
        if (exp == 0) {return 1;}
        else {return base * power(base, exp - 1);}
    }
}