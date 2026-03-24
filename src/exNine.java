import java.util.Scanner;

public class exNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println(countChars(input));
        sc.close();
    }

    public static int countChars(String s) {
        if (s.isEmpty()) {return 0;}
        else {
            return 1 + countChars(s.substring(1));
        }
    }
}