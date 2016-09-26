package T2;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveTest {
	
	@Test(dataProvider = "dataProvider")
	public void test(double x, double y , boolean result) {
		boolean resultActual=Calculation.calculatePresence(x, y);
		assertTrue(resultActual== result);
	}
    
	//check on usual numbers
		@DataProvider(name = "dataProvider")
		public Object[][] createNumbers() {
			return new Object[][] { { 0.0, 0.0, true },
					{ 6.0, 0.0, true },
					{-6.0, 0.0, true },
					{ 0.0, 5.0, true},
					{ 0.0, -3.0, true },
					{ -4.5, -2.0, true },
					{ 4.1, 1.0, false }, 
					{ 10.5, -2.0, false },
					{ 2.1, 6.0, false },
					{ 7.0, 5.0, false },
					{ -5.0, -5.0, false },
					{-10.0, 0.0, false}, };
		}
	
}
