package T9;

import java.util.ArrayList;

public class Basket {
	
	private int capacity;
	private ArrayList <Ball> balls= new ArrayList <Ball> ();
	
	public Basket(int capacity){
		this.setCapacity(capacity);
	}
	
	public void fillBasket(ArrayList <Ball> balls){
		if(balls.size()<=capacity){
			this.setBalls(balls);
		}else{
			System.out.println("Недостаточно места в корзине");
		}
	}
	
	
	public ArrayList<Ball> getBalls() {
		return balls;
	}

	public void setBalls(ArrayList<Ball> balls) {
		this.balls = balls;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
