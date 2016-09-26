package T4;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
	
	// test on empty array
		@Test
		public void NegativeTest() {
			int[] mas = {  };
			ArrayList<Integer> result = Calculation.findSimpleNumbers(mas);
			Assert.assertTrue(result.isEmpty());
		}
  
}
