package collections.list.arraylist;

public class WrapperClass {
	
	
	public static void main(String[] args) {

        byte b = 1;
        Byte byteObj = Byte.valueOf(b);

        int i = 10;
        Integer intObj = Integer.valueOf(i);

        float f = 18.6f;
        Float floatObj = Float.valueOf(f);

        double d = 250.5;
        Double doubleObj = Double.valueOf(d);

        char c = 'a';
        Character charObj = c; // autoboxing

        System.out.println("Wrapper Objects:");
        System.out.println(byteObj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);

        // Unboxing
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("\nUnwrapped values:");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(cv);
        
        // Converts a String into its corresponding primitive type
        int a = Integer.parseInt("100");
        
//        Converts a String into a wrapper object
        Integer b1 = Integer.valueOf("100");
        
//        Converts a primitive value into a wrapper object
        Integer c1 = Integer.valueOf(10);
        
//        Converts a wrapper object into its primitive type
        int d1 = c1.intValue();
        
        // Compares two wrapper objects
        b1.compareTo(c1);
        
        // Compares values, not references
        b1.equals(c1);
        
        // Returns minimum of two values
        Integer.min(10, 20);
        
        // Compares two primitive values
        Integer.compare(10, 20);
        
        //Converts string to boolean
        Boolean.parseBoolean("true");
        
        
        Integer a3 = 100;
        Integer b3 = 100;
        Integer c3 = 200;
        Integer d3 = 200;

        System.out.println(a3 == b3);
        System.out.println(c3 == d3);
        
        // Integer values from -128 to 127 are cached, so a==b is true, but 200 is outside cache so c==d is false.

    }

}
