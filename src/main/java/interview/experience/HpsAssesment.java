package interview.experience;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class HpsAssesment{
	
	private static final long KIB = 1024L;
	private static final long MIB = 1024L * 1024L;
	private static final String KiB = "KiB";
	private static final String MiB = "MiB";
	
	public static void main(String[] args) {
		
		
		int[] inputs = {0, 512, 1024, 1_048_576, 1_572_864, 2_097_152};
		
		for(int input : inputs) {
			System.out.println("input Bytes: "+input+" ,After conversion : "+bytesOfQuantity(input));
		}
		
		for(int input : inputs) {
			System.out.println("input Bytes: "+input+" ,After conversion : "+bytesOfQuantityDecimal(input));
		}
		
		
		assertEquals("0.00KiB", bytesOfQuantityDecimal(0));
		assertEquals("2.00MiB", bytesOfQuantityDecimal(2097152));
		System.out.println("All main() assertions passed.");
	}
	
	
	
	
	public static void assertEquals(String expected, String actual) {
		if(!expected.equals(actual)) {
			throw new AssertionError("Expected : "+expected+" , but got : "+actual);
		}
	}
	
	
	public static String bytesOfQuantity(int byteOfQuantity) {
		
		if(byteOfQuantity<0) {
			throw new IllegalArgumentException("bytesOfQuantity must be greater than 0");
		}
		
		
		if(byteOfQuantity>=MIB) {
			long Mib= Math.round(byteOfQuantity/(double)MIB);
			return Mib + MiB;
	}
		
		else{
			long kib = Math.round(byteOfQuantity/(double)KIB);
			return kib + KiB;
	}	
		
	}
	
	
	public static String bytesOfQuantityDecimal(int byteOfQuantity) {
		String unit;
		double value;
		
		if(byteOfQuantity<0) {
			throw new IllegalArgumentException("bytesOfQuantity must be greater than 0");
		}
		
		
		if(byteOfQuantity>=MIB) {
			 value=byteOfQuantity/(double)MIB ;
			 unit = MiB;
	}
		
		else{
			value = byteOfQuantity/(double)KIB;
			unit = KiB;
	}
		
		
		BigDecimal rounded = BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP);
		
		return rounded.toString()  + unit;
		
}
		
	
}