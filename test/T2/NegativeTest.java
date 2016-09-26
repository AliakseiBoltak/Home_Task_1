package T2;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class NegativeTest {
	
	//check on big numbers
	@Test(dataProvider = "dataProvider")
	public void test(double x, double y, boolean result) {
		boolean resultActual = Calculation.calculatePresence(x, y);
		Assert.assertEquals(result, resultActual);
	}
    
	@DataProvider(name = "dataProvider")
	public Object[][] createNumbers() {
		return new Object[][] { { Double.MAX_VALUE, Double.MAX_VALUE, false},
			    {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, false },
			    {Double.POSITIVE_INFINITY, Double.MAX_VALUE, false  },
			    {Double.NEGATIVE_INFINITY, Double.MIN_VALUE, false },
			    {Double.MAX_VALUE, Double.NEGATIVE_INFINITY, false },
			    {Double.MIN_VALUE, Double.POSITIVE_INFINITY, false },};
	}
    
	  
		//check on NumberFormatException if arguments are not parsed to double
		@Test(expectedExceptions=NumberFormatException.class, dataProvider = "dataString" )
		public void testIllegalArguments(ArrayList<String> str)  {
			String[] arr= new String [10];
			arr[0]=str.get(0);
			arr[1]=str.get(1);
			Main.main(arr);
		}
		
		
		@DataProvider(name = "dataString")
		public Object[][] createString() {
			return new Object[][] { { new ArrayList<Object>(Arrays.asList(""," " )) },
				    { new ArrayList<Object>(Arrays.asList("someString", "")) },
					{ new ArrayList<Object>(Arrays.asList("", "test"))},};
		}
}
