import java.util.Scanner;

public class exEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkDigits(s));
        sc.close();
    }

    public static String checkDigits(String s) {
        if (s.isEmpty()) {return "Yes";}
        else if (!Character.isDigit(s.charAt(0))) {return "No";}
        else {
            return checkDigits(s.substring(1));
        }
    }
}