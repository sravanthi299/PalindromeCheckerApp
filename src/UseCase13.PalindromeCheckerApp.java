/**
 * MAIN CLASS : UseCase13PalindromeCheckerApp
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";   // Example input

        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    // Method to check palindrome
    public static boolean checkPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
