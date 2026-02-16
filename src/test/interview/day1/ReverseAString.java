package test.interview.day1;

public class ReverseAString {
    public static void main(String[] args) {


        String str = "Bhanu";

        System.out.println(reverse(str));
    }

    static String reverse(String input){
        if(input == null){
            System.out.println("Please provide valid input");
        }

        StringBuilder out = new StringBuilder();

        char[] chars = input.toCharArray();

        for(int i = chars.length-1; i >=0; i --){
            out.append(chars[i]);
        }

        return out.toString();
    }
}
