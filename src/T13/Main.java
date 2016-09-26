package T13;

public class Main {

	public static void main(String[] args) {

		ProgrammerBook progBook= new ProgrammerBook("java", "eckel", 20, 2, "russian", 1);
		
		ProgrammerBook progBook2= new ProgrammerBook("java", "eckel", 20, 2, "russian", 1);
		
		ProgrammerBook progBook3= new ProgrammerBook("java", "shildt", 10, 3, "russian", 1);
		
		
		System.out.println(progBook.hashCode()==progBook2.hashCode());
		System.out.println(progBook2.hashCode()==progBook3.hashCode());
		System.out.println(progBook3.hashCode()==progBook.hashCode());
		
		System.out.println(progBook);
		System.out.println(progBook2);
		System.out.println(progBook3);
		
		
		System.out.println(progBook.equals(progBook2));
		System.out.println(progBook2.equals(progBook3));
		System.out.println(progBook3.equals(progBook));
		
		
	}
}
