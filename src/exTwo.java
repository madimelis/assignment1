import java.util.Scanner;

public class exTwo {

    public static double sumRecursive(Scanner sc, int n) {
        if (n == 0) {return 0;}
        else {
            int number = sc.nextInt();
            return number + sumRecursive(sc, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double sum = sumRecursive(sc, number);
        double avg = sum / number;
        System.out.println(avg);
        sc.close();
    }
}