package T4;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {

	// test on simple array
	@Test
	public void PositiveTest() {
		int[] mas = { 20, 3, 5, 7, 100 };
		ArrayList<Integer> result = Calculation.findSimpleNumbers(mas);
		//check index of simple numbers
		Assert.assertTrue(1== result.get(0));
		Assert.assertTrue(2== result.get(1));
		Assert.assertTrue(3== result.get(2));
	}

}
