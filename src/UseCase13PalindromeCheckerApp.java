public class UseCase13PalindromeCheckerApp {

    // Method 1: Palindrome using reverse string
    public static boolean checkUsingReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return str.equals(reversed);
    }

    // Method 2: Palindrome using two pointer technique
    public static boolean checkUsingTwoPointer(String str) {
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

    public static void main(String[] args) {

        String input = "madam";

        // Algorithm 1 timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Algorithm 2 timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingTwoPointer(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("Input String: " + input);
        System.out.println();

        System.out.println("Using Reverse Method: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println();

        System.out.println("Using Two Pointer Method: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");
    }
}