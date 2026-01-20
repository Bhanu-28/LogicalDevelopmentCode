package test.oops;

public class Polymorphism {


    public static void main(String[] args) {


        Parent parent = new Student();

        parent.print();


    }
}


class Parent{

    void print(){
        System.out.println("Hello I am Ram");
    }
}

class Student extends Parent{

    void print(){

        System.out.println("Hello I am Hanuman");
    }

}


