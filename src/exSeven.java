import java.util.Scanner;

public class exSeven {
    public static void reversePrint(int n, Scanner sc) {
        if (n <= 0) {return;}
        else {
            int current = sc.nextInt();
            reversePrint(n - 1, sc);
            System.out.print(current + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversePrint(n, sc);
        sc.close();
    }
}