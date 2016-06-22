import static org.junit.Assert.*;

import org.junit.Test;

public class NumberFormatTester {

	@Test
	public void toPercentTest() {
		//System.out.println(NumberFormatUtility.toPercentage(0.06));
		assertTrue(NumberFormatUtility.toPercentage(0.06).equals("6%"));
	}
	@Test
	public void toDecimalTest() {
		//System.out.println(NumberFormatUtility.toDecimal(16.3298097097, 3) );
		assertTrue(NumberFormatUtility.toDecimal(16.3298097097, 3).equals("16.33"));
	}
	@Test
	public void toCurrencyTest() {
		//System.out.println(NumberFormatUtility.toPercentage(50.0));
		assertTrue(NumberFormatUtility.toPercentage(50.0).equals("5,000%"));
	}
	@Test
	public void randomNumTest() {
		assertTrue(NumberFormatUtility.randNum()>0);
	}
	
	@Test
	public void getMinTest() {
		assertTrue(NumberFormatUtility.minNum(2, 1)==1);
	}
	@Test
	public void getMaxTest() {
		assertTrue(NumberFormatUtility.maxNum(2,1)==2);
	}
}
