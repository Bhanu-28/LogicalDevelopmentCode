package test.interview.day7;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("Hello I am Bhanu  "));
    }

    static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }
}
