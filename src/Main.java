import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String getUsername = InputHelper.getNonZeroLenString(scan, "Enter your username:");
        System.out.print("Your username is: " + getUsername);
    }
}