
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book ("philosophy", "nitzshe", 20, 100);
		
		Book cl = (Book) book.clone();
		
		System.out.println(book);
		System.out.println(cl);
		
		cl.setAuthor("diogen");
		
		System.out.println(book);
		System.out.println(cl);
	}
}
