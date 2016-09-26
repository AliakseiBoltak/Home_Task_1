package T4;

import java.util.ArrayList;
import java.util.Random;

public class Calculation {

	//generate Array
	public static int[] createArray() {

		Random ran = new Random();

		int size = ran.nextInt(10) + 1;

		int[] arr;
		arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			int number = ran.nextInt(20);
			arr[i] = number;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;

	}
    
	//find simple elements
	public static ArrayList<Integer> findSimpleNumbers(int[] array) {

		ArrayList<Integer> arr= new ArrayList <Integer> ();

		for (int i = 0; i < array.length; i++) {

			int count = 0;

			if (array[i] <= 1) {
				continue;
			}

			for (int d = 1; d <= array[i]; d++) {

				if (array[i] % d == 0) {
					count++;
				}
			}

			if (count == 2) {
				arr.add(i);
				System.out.println("Номер простого элемента-" + i);
			}

		}
		return arr;
	}
}
