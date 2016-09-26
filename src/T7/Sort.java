package T7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sort {

	public static void start() {

		int size = (int) (Math.random() * 10 + 1);

		double[] arr = new double[size];

		for (int i = 0; i < size; i++) {
			double newDouble = new BigDecimal(Math.random() * 11 - 5).setScale(3, RoundingMode.UP).doubleValue();
			arr[i] = newDouble;
		}
		
		System.out.println("Исходный массив");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("mas["+i+"]="+arr[i]+";");
		}
		
		for (int i=arr.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(arr[j]>arr[j+1]){
					double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Отсортированный массив");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("mas["+i+"]="+arr[i]+";");
		}
	}
}
