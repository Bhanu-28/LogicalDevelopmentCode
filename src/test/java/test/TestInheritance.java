package test;

public class TestInheritance {

    public static void main(String[] args) {
        Parent parent =  new Student();

        parent.show();


        Student student = new Student();

        student.show();

        Parent parent1 = new Parent();
        parent1.show();
    }
}


class Parent {

    public void show(){
        System.out.println("Inside Parent class show");

    }
}


class Student extends Parent {
    public void show() {
        System.out.println("Inside Student class show");
    }
}


