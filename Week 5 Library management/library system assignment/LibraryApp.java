public class LibraryApp{
	public static void main (String[] args){

		Library library=new Library("COMSATS library",new Book("Harry Potter", "123", new Date(1,5,1996), new Person("Zainab Hussain","Writer",new Address("120 street","Lahore."))),new Person ("Bismah","Manager",new Address("115 Street","Karachi")),new Person ("Asna","Librarian",new Address("009 Street","Multan")));
		library.showLibraryDetails();

	}


}