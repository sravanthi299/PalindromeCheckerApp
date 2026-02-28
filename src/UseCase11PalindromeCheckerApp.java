public boolean checkPalindrome(String input) {

    // Initialize pointers
    int start = 0;
    int end = input.length() - 1;

    // Compare characters moving inward
    while (start < end) {
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }

    return true;
}
