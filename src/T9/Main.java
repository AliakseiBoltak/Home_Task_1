package T9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean enter = true;
		double weight = 0;
		while (enter) {
			System.out.println("Enter color of the ball");
			String color = sc.nextLine();
			System.out.println("Enter weight of the ball");
			try {
				weight = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Incorrect enter of weight");
			}
			Ball ball = new Ball(color, weight);
			System.out.println("Continue? y/n");
			if (sc.nextLine().equals("n")) {
				enter = false;
				break;
			} else {
				continue;
			}
		}

		Basket basket = new Basket(10);
		basket.setBalls(Ball.getListOfBalls());

		int counter = 0;
		double totalWeight = 0;
		for (int i = 0; i < basket.getBalls().size(); i++) {
			totalWeight += basket.getBalls().get(i).getWeight();
			if (basket.getBalls().get(i).getColor().equalsIgnoreCase("blue")) {
				counter++;
			}
		}

		System.out.println("number of blue balls in the basket = " + counter);
		System.out.println("total weight of the balls in the basket = " + totalWeight);
	}
}
