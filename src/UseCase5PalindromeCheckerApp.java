import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "level";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        String reversed = "";

        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}