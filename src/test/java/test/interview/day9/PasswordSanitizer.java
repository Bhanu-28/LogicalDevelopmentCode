package test.interview.day9;

import java.util.*;

class PasswordSanitizer {

    public static String filter(List<String> passwords) {

        StringBuilder ans = new StringBuilder();

        for (String password : passwords) {

            if (password == null) {
                continue;
            }

            password = password.trim();

            // Minimum length check
            if (password.length() < 5) {
                continue;
            }

            boolean onlyLetters = true;
            boolean onlyDigits = true;
            boolean hasAlphaNumeric = false;

            for (char ch : password.toCharArray()) {

                if (!Character.isLetter(ch)) {
                    onlyLetters = false;
                }

                if (!Character.isDigit(ch)) {
                    onlyDigits = false;
                }

                if (Character.isLetterOrDigit(ch)) {
                    hasAlphaNumeric = true;
                }
            }

            // Reject:
            // only letters
            // only digits
            // only special chars
            if (!onlyLetters && !onlyDigits && hasAlphaNumeric) {

                if (ans.length() > 0) {
                    ans.append(" ");
                }

                ans.append(password);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            return;
        }

        String input = sc.nextLine();

        // Handles multiple spaces/tabs
        String[] arr = input.trim().split("\\s+");

        List<String> passwords = Arrays.asList(arr);

        System.out.print(filter(passwords));
    }
}