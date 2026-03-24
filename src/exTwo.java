import java.util.Scanner;

public class exTwo {

    public static double sumRecursive(Scanner sc, int n) {
        if (n == 0) {return 0;}
        else {
            int num = sc.nextInt();
            return num + sumRecursive(sc, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = sumRecursive(sc, n);
        double avg = sum / n;
        System.out.println(avg);
    }
}