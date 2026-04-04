package test;


import java.util.*;

public class Divisors {

    public static ArrayList<Integer> printDivisors(int n) {

        ArrayList<Integer> divisors = new ArrayList<>();

        // Iterate from 1 to n and check divisibility
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

                // If 'i' divides 'n' evenly, it's a divisor
                divisors.add(i);
            }
        }

        // Return the list of divisors
        return divisors;
    }

    public static void main(String[] args) {
        int number = 10;

        ArrayList<Integer> divisors = printDivisors(number);

        for (int div : divisors) {
            System.out.print(div + " ");
        }
    }
}