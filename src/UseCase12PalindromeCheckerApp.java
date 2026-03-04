public class UseCase12PalindromeCheckerApp {
    
    public boolean check(String input) {
        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        UseCase12PalindromeCheckerApp app = new UseCase12PalindromeCheckerApp();
        System.out.println(app.check("racecar"));
    }
}
