package T6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculation {

	public static ArrayList<Double> generateArray() {

		ArrayList<Double> numbers = new ArrayList<Double>();

		int size = (int) (Math.random() * 5 + 5);

		for (int i = 0; i < size; i++) {
			double newDouble = new BigDecimal(Math.random() * 11 - 5).setScale(3, RoundingMode.UP).doubleValue();
			numbers.add(newDouble);
		}
		return numbers;
	}
    
	//return result
	public static ArrayList<Double> start(ArrayList<Double> numbers) {

		ArrayList<Double> res = new ArrayList<Double>();;

		for (int i = 0; i < numbers.size(); i++) {
            
			
			double tempFirts = numbers.get(0);

			numbers.add(tempFirts);
			numbers.remove(0);
			System.out.println(numbers);
		    
			if(i==numbers.size()-2){
				res.addAll(numbers);
			}
		}
		return res;
	}
}
