public class Library{
	private String name;
	private Book book;
	private Person incharge;
	private Person staff;

	Library(String name, Book book, Person incharge, Person staff){
		this.name=name;
		this.book=book;
		this.incharge=incharge;
		this.staff=staff;


	}
	Library (Library other){
		// copy constructor
		this.name=other.name;
		this.book=new Book(other.book);
		this.incharge=new Person(other.incharge);
		this.staff=new Person(other.staff);
	}
	public void showLibraryDetails(){
		System.out.println(name);
		System.out.println("Book: ");
		book.showBookDetails();
		System.out.println("Incharge: ");
		incharge.showPersonDetails();
		System.out.println("Staff: ");
		staff.showPersonDetails();

	}

	public boolean equals(Object obj){
		Library library=(Library)obj;
		return (this == obj)? true:false;
	
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}



}