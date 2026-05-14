package test.oops;

public class TestInheritance {

    public static void main(String[] args) {
    	
		/*
		 * Inner must instantiate from outer class. inner classes require outer class
		 * object Alternative better approach: Make inner classes static if they don't
		 * need outer class data.
		 */    	
    	
        Parent parent =  new TestInheritance().new Student() ;

        parent.show();


        Student student = new TestInheritance().new Student();

        student.show();

        Parent parent1 = new TestInheritance().new Parent();
        parent1.show();
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
}





