import java.util.*;
public class Sorting1Problem4 {
	public static Book[] bookArr;

	public static void main(String[] args) {
		boolean active = true;
		
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("What would you like to do?");
			System.out.println("1 Enter books");
			System.out.println("2 See details of all books");
			System.out.println("3 Search for book based on book number");
			System.out.println("4 Search for a book based on name" );
			
			int choice = input.nextInt();
			
			selectedMenuChoice(choice,input);
			
			System.out.println("Would you like to exit? y/n");
			active = input.next().equals("n");
		}while(active);
		
	}
	
	public static void selectedMenuChoice(int choice,Scanner input) {
		if(choice != 1 && bookArr == null) {
			System.out.println("No books entered. Please enter books.");
			return;
		}
		
		switch(choice) {
		case 1:
			System.out.println("Enter number of books");
			int size = input.nextInt();
			bookArr = new Book[size];
			
			for(int i = 0; i < size; i++) {
				Book newBook = new Book();
				newBook.Enter();
				bookArr[i] = newBook;
			}
			
			System.out.println("Books Entered");
			break;
		case 2:
			for(Book book : bookArr) {
				book.Display();
			}
			break;
		case 3:
			System.out.println("Enter book id to search");
			int id = input.nextInt();
			for(int i = 0; i <  bookArr.length;i++) {
				if(bookArr[i].RBno() == id) {
					bookArr[i].Display();
				}
			}
			
			break;
		case 4:
			System.out.println("Enter book name to search");
			String name = input.next();
			for(int i = 0; i <  bookArr.length;i++) {
				if(bookArr[i].RBname().equals(name)) {
					bookArr[i].Display();
				}
			}
		}
	}

}
