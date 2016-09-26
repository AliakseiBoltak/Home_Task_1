package T9;

import java.util.ArrayList;

public class Ball {

	private String color;
	private double weight;
	private static ArrayList <Ball> listOfBalls=new ArrayList <Ball> ();
	
	
	

	public Ball(String color, double weight){
		this.setColor(color);
		this.setWeight(weight);
		listOfBalls.add(this);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public static ArrayList<Ball> getListOfBalls() {
		return listOfBalls;
	}

	public void setListOfBalls(ArrayList<Ball> listOfBalls) {
		this.listOfBalls = listOfBalls;
	}

	
}
