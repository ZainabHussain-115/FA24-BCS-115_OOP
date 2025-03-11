public class LibraryApp{
	public static void main (String[] args){

		Address addressauthor = new Address("120 Street", "Lahore");
		Address addressincharge = new Address("115 Street", "Karachi");
		Address addressstaff = new Address("009 Street", "Multan");
        	Person author = new Person("Zainab", "Writer", addressauthor);
        	Date publicationDate = new Date(1, 5, 1996);
       		Book book = new Book("Harry Potter", "123", publicationDate, author);
        	Person incharge = new Person("Bismah", "Manager", addressincharge);
        	Person staff = new Person("Asna", "Librarian", addressstaff);

		Library library=new Library("COMSATS library",book,incharge,staff);
		library.showLibraryDetails();

	}


}