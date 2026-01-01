package leetcode;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int input = sc.nextInt();
        System.out.println(checkPalindrome(input));
    }

    static boolean checkPalindrome(int x){
        int rev = 0;
        int digit = 0;
        int original = x;
        while(x>0){
            digit = x%10;
            rev = rev*10 + digit;
            x = x/10;
        }


        return original == rev;
    }
}
