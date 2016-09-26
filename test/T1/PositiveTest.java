package T1;

import org.testng.annotations.Test;
import T1.Calculation;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class PositiveTest {

	@Test(dataProvider = "dataProvider")
	public void test(ArrayList<Double> num) {
		Double x = (Double) num.get(0);
		Double y = (Double) num.get(1);
		Double resultExpected = (Double) num.get(2);
		double resultActual = Calculation.calculate(x, y);
		Assert.assertEquals(resultExpected, resultActual);
	}
    
	//check on usual numbers
	@DataProvider(name = "dataProvider")
	public Object[][] createNumbers() {
		return new Object[][] { { new ArrayList<Double>(Arrays.asList(5.0, -7.0, 5.261278994352472)) },
				{ new ArrayList<Double>(Arrays.asList(1.0, 1.0, 1.913410905215903)) },
				{ new ArrayList<Double>(Arrays.asList(2.0, 2.0, 2.4177617232402064)) },
				{ new ArrayList<Double>(Arrays.asList(-1.0, -1.0, -0.08658909478409704)) },
				{ new ArrayList<Double>(Arrays.asList(-1.0, -1.0, -0.08658909478409704)) },
				{ new ArrayList<Double>(Arrays.asList(-100.0, 100.0, -99.99019607823914)) },
				{ new ArrayList<Double>(Arrays.asList(0.0, 0.0, 0.5)) }, };
	}
}
