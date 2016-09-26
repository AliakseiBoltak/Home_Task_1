package T6;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {

	@Test
	public void PositiveTest() {
		ArrayList<Double> numbers = Calculation.generateArray();
		ArrayList<Double> result = Calculation.start(numbers);
		for(int i=1; i< result.size()-1; i++){
			//check result 
			Assert.assertEquals(result.get(i) , numbers.get(i-1));
		}
	}
}
