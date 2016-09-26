package T3;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveTest {
	
	@Test(dataProvider = "dataProvider")
	public void test(ArrayList<Double> num) {
		Double x = (Double) num.get(0);
		Double resultExpected = (Double) num.get(1);
		double resultActual = Calculation.Calculate(x-2, x, 2.0 );
		Assert.assertEquals(resultExpected, resultActual);
	}
  
  
//check on usual numbers
	@DataProvider(name = "dataProvider")
	public Object[][] createNumbers() {
		return new Object[][] { { new ArrayList<Double>(Arrays.asList(10.0,  0.6483608274590866)) },
				{ new ArrayList<Double>(Arrays.asList(14.0, 7.2446066160948055)) },
				{ new ArrayList<Double>(Arrays.asList(16.0,  0.3006322420239034)) },
				{ new ArrayList<Double>(Arrays.asList(18.0,  -1.1373137123376869)) },
				{ new ArrayList<Double>(Arrays.asList(20.0, 2.237160944224742)) }, };
	}
}
