public class Book{
	private String title;
	private String issn;
	private Date publicationDate;
	private Person author;


	Book (String title,String issn,Date publicationDate,Person author){
		this.title=title;
		this.issn=issn;
		this.publicationDate=publicationDate;
		this.author=author;
	}
	Book(Book other){
		//copy constructor
		this.title=other.title;
		this.issn=other.issn;
		this.publicationDate=new Date(other.publicationDate);
		this.author=new Person(other.author);
	}

	public void showBookDetails(){

		System.out.println("Title: "+title);
		System.out.println("issn: "+issn);
		System.out.println("Publication Date: ");
		publicationDate.showDate();
		System.out.println("Author: ");
		author.showPersonDetails();
	}

	public boolean equals(Object obj){
		Book book=(Book)obj;
		return (this == obj)? true:false;
	}

	public String getTitle(){
		return this.title;
	}

	public void setTitle(String title){
		this.title=title;
	}
	public String getIssn(){
		return this.issn;
	}
	public void setIssn(String issn){
		this.issn=issn;
	}
	public Date getPublicationDate() {
    		return this.publicationDate;
	}
	public Person getAuthor() {
   		 return this.author;
	}
	public void setPublicationDate(Date publicationDate){
		this.publicationDate=publicationDate;
	}
	public void setAuthor(Person author){
		this.author=author;
	}

	
}