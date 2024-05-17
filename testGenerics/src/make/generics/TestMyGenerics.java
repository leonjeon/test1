package make.generics;

public class TestMyGenerics {

	public static void main(String[] args) {
		// MyGenerics<T> 사용 테스트
		// String[] 배열을 다루는 
		MyGenerics<String> my1 = new MyGenerics<String>(5);
		
		try {
			my1.add("java");
			my1.add("linux");
			my1.add("oracle");
			
			for(int i = 0; i < my1.getCount(); i++) {
				System.out.println(my1.get(i));
			}
		} catch (SizeOverflowException e) {
			// TODO: handle exception
		}

	
		//Book[] 을 취급하는 MyGenerics
		MyGenerics<Book> my2 = new MyGenerics<Book>(5);
	
		try {
			my2.add(new Book("java", "김길동"));
			my2.add(new Book("linux", "이길동"));
			my2.add(new Book("oracle", "한길동"));
		
			for(int i = 0; i < my2.getCount(); i++) {
				System.out.println(my2.get(i));
			}
		} catch (SizeOverflowException e) {
			// TODO: handle exception
		}	

	}

}

class Book {
	private String title;
	private String author;
	
	
	public Book () {}
	
	
	public Book (String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArthor() {
		return author;
	}

	public void setArthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

}





















































