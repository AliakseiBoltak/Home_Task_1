package T8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculation {
	
	public static void start(){
		
		int sizeOne = (int) (Math.random() * 5 + 1);
		
		int sizeTwo = (int) (Math.random() * 5 + 1);
		

		double[] arrOne = new double[sizeOne];
		
		double[] arrTwo = new double[sizeTwo];

		for (int i = 0; i < sizeOne; i++) {
			double newDouble = new BigDecimal(Math.random() * 11 - 5).setScale(3, RoundingMode.UP).doubleValue();
			arrOne[i] = newDouble;
		}
		
		for (int i=arrOne.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(arrOne[j]>arrOne[j+1]){
					double temp = arrOne[j];
                    arrOne[j] = arrOne[j + 1];
                    arrOne[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Исходный первый массив");
		for (int i = 0; i < arrOne.length; i++) {
			System.out.println("mas["+i+"]= "+arrOne[i]+";");
		}
		
		
		
		for (int i = 0; i < sizeTwo; i++) {
			double newDouble = new BigDecimal(Math.random() * 11 - 5).setScale(3, RoundingMode.UP).doubleValue();
			arrTwo[i] = newDouble;
		}
		
		for (int i=arrTwo.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(arrTwo[j]>arrTwo[j+1]){
					double temp = arrTwo[j];
                    arrTwo[j] = arrTwo[j + 1];
                    arrTwo[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Исходный второй массив");
		for (int i = 0; i < arrTwo.length; i++) {
			System.out.println("mas2["+i+"]= "+arrTwo[i]+";");
		}
		
		
		ArrayList <Double> result = new ArrayList <Double>();
		
		
		for(int i=0; i<arrOne.length-1; i++){
			
			if(arrOne[i+1]>arrOne[i]){
				for(int j=0; j<arrTwo.length-1;j++){
					if(arrTwo[j]>arrOne[i] && arrTwo[j]<arrOne[i+1]){
						System.out.println("можно вставить элемент "+arrTwo[j]+ " между mas["+i+"] и mas["+(i+1)+"]" );
					}
				}
			}
			
				
		}
	}
}
