package leetcode.week1.pointers;

import java.util.LinkedList;

public class D20250807_LinkedListClass {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();

        cars.add("JLR");
        cars.add("Renault");

        System.out.println("Linked list elements :" + cars);

        cars.addFirst("BMW");

        cars.addLast("Audi");

        cars.remove("ford");

        System.out.println("After adding few and removing few cars" + cars);

        for (String car : cars) {
            System.out.println("car :" + car);
        }

        System.out.println();

    }

}
