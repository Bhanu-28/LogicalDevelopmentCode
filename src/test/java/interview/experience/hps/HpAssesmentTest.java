package interview.experience.hps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import interview.experience.hps.HpsAssesment;

public class HpAssesmentTest {

	
	@Test
    public void testKiBCases() {
        assertEquals("0.00KiB", HpsAssesment.bytesOfQuantityDecimal(0));
        assertEquals("0.50KiB", HpsAssesment.bytesOfQuantityDecimal(512));
        assertEquals("1.00KiB", HpsAssesment.bytesOfQuantityDecimal(1024));
        assertEquals("1.00MiB", HpsAssesment.bytesOfQuantityDecimal(1_048_576));
    }

    @Test
    public void testMiBCases() {
        assertEquals("1MiB", HpsAssesment.bytesOfQuantity(1_048_577));
        assertEquals("2MiB", HpsAssesment.bytesOfQuantity(1_572_864));
        assertEquals("2MiB", HpsAssesment.bytesOfQuantity(2_097_152));
    }
}
