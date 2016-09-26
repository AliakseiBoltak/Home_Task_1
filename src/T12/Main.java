package T12;

public class Main {

	public static void main(String[] args) {
		
		Book one = new Book ("java", "eckel", 100, 6);
		Book two = new Book ("java", "eckel", 100, 6);
		Book three = new Book ("java", "shildt", 50, 8);
		Book four= one;
		
		
		System.out.println(one.equals(two));
		System.out.println(three.equals(one));
		System.out.println(four.equals(one));
		System.out.println(two.equals(four));
		System.out.println("////////////////////////////");
		System.out.println(one.hashCode()==two.hashCode());
		System.out.println(three.hashCode()==one.hashCode());
		System.out.println(four.hashCode()==one.hashCode());
		System.out.println(two.hashCode()==four.hashCode());
		System.out.println("////////////////////////////");
		System.out.println(one);
	}

}
