package T1;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import static java.lang.Double.NaN;
import T1.Calculation;
import T1.Main;

public class NegativeTest {
	
	//check on big numbers
	@Test(dataProvider = "dataProvider")
	public void test(ArrayList<Double> num) {
		Double x = (Double) num.get(0);
		Double y = (Double) num.get(1);
		Double resultExpected = (Double) num.get(2);
		double resultActual = Calculation.calculate(x, y);
		Assert.assertEquals(resultExpected, resultActual);
	}
    
	@DataProvider(name = "dataProvider")
	public Object[][] createNumbers() {
		return new Object[][] { { new ArrayList<Double>(Arrays.asList(Double.MAX_VALUE, Double.MAX_VALUE, NaN )) },
			    { new ArrayList<Double>(Arrays.asList(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, NaN)) },
			    { new ArrayList<Double>(Arrays.asList(Double.POSITIVE_INFINITY, Double.MAX_VALUE, NaN )) },
			    { new ArrayList<Double>(Arrays.asList(Double.NEGATIVE_INFINITY, Double.MIN_VALUE, NaN)) },
			    { new ArrayList<Double>(Arrays.asList(Double.MAX_VALUE, Double.NEGATIVE_INFINITY, NaN)) },
			    { new ArrayList<Double>(Arrays.asList(Double.MIN_VALUE, Double.POSITIVE_INFINITY, NaN)) },
				{ new ArrayList<Double>(Arrays.asList(Double.MIN_VALUE, Double.MIN_VALUE, 0.5))},};
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
