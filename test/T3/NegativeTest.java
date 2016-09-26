package T3;


import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class NegativeTest {
	
	//check on NumberFormatException if arguments are not parsed to double
	@Test(expectedExceptions=NumberFormatException.class, dataProvider = "dataString" )
	public void testIllegalArguments(ArrayList<String> str)  {
		String[] arr= new String [10];
		arr[0]=str.get(0);
		arr[1]=str.get(1);
		arr[2]=str.get(2);
		Main.main(arr);
	}
	
	
	@DataProvider(name = "dataString")
	public Object[][] createString() {
		return new Object[][] { { new ArrayList<String>(Arrays.asList(""," ", "smth" )) },
			    { new ArrayList<String>(Arrays.asList("someString", "", " ")) },
				{ new ArrayList<String>(Arrays.asList(" ", "test", ""))},};
	}
}
