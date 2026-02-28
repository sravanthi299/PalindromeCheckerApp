import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        String reverse = "";

        // reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // check palindrome
        if (input.equals(reverse))
            System.out.println("Is it a Palindrome? : true");
        else
            System.out.println("Is it a Palindrome? : false");
    }
}