import java.util.*;
import java.io.*;
class Book{
	private String title;
	private String author;
	private String isbn;
	private int year;
	public Book(String title, String author, String isbn, int year){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
	}
	public String getTitle(){return title;}
	public String getAuthor(){return author;}
	public String getIsbn(){return isbn;}
	public int getYear(){return year;}
	@Override
	public String toString(){
		return title + "|" + author + "|" + isbn + "|" + year;
	}
	public String toFileString(){
		return title + "|" + author + "|" + isbn + "|" + year;
	}		
}
class Library{
	private ArrayList<Book> books;
	private final String fileName = "books.txt";
	public Library(){
		books = new ArrayList<>();
		loadFromFile();
	}
	public void addBook(Book book){
		for(Book b: books){
			if(b.getIsbn().equals(book.getIsbn())){
				System.out.println("\nA book with this ISBN already exists.");
				return;
			}
		}
		books.add(book);
		System.out.println("\nBook added successfully!");
	}
	public void deleteBook(String isbn){
		Iterator<Book> iterator = books.iterator();
		while(iterator.hasNext()){
			Book b = iterator.next();
			if(b.getIsbn().equals(isbn)){
				iterator.remove();
				System.out.println("\nBook deleted successfully!");
				return;
			}
		}
		System.out.println("\nBook with given ISBN not found.");
	}
	public void searchBook(String keyword){
		boolean found = false;
		for(Book b: books){
			if(b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||  b.getIsbn().equals(keyword)){
				System.out.println(b);
				found = true;
			}
		}
		if(!found)System.out.println("\nNo book found matching the keyword.");
	}
	public void displayBooks(){
		if(books.isEmpty()){
			System.out.println("\nNo books available.");
			return;
		}
		for(Book b: books){
			System.out.println(b);
		}
	}
	public void loadFromFile(){
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			while((line = br.readLine()) != null){
				String[] parts = line.split("\\|");
				if(parts.length == 4){
					books.add(new Book(parts[0],parts[1],parts[2],Integer.parseInt(parts[3])));
				}
			}
		}catch(IOException e){
			// Ignore if file does not exist
		}
	}
	public void saveToFile(){
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){
			for(Book b: books){
				pw.println(b.toFileString());
			}
		}
		catch(IOException e){
			System.out.println("\nError saving books to file.");
		}
	}
}
public class LibraryManagementSystem{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Library library = new Library();
		int choice;
		do{
			System.out.println("\n==== Library Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			choice = in.nextInt();
			in.nextLine();
			switch(choice){
				case 1:
					System.out.print("Enter Title: ");
                    String title = in.nextLine();
                    System.out.print("Enter Author: ");
                    String author = in.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = in.nextLine();
                    System.out.print("Enter Year: ");
                    int year = in.nextInt();
                    in.nextLine();
					library.addBook(new Book(title,author,isbn, year));
					break;
				case 2:
					System.out.print("Enter title or ISBN to search: ");
                    String keyword = in.nextLine();
                    library.searchBook(keyword);
                    break;
				case 3:
					System.out.print("Enter ISBN to delete: ");
                    String delIsbn = in.nextLine();
                    library.deleteBook(delIsbn);
                    break;
				case 4:
					library.displayBooks();
                    break;
				case 5:
					library.saveToFile();
                    System.out.println("\nExiting... Data saved successfully.");
                    break;
				default:
					System.out.println("\nInvalid choice. Try again.");
			}
		}while(choice != 5);
		in.close();
	}
}
