public class Person{
	private String name;
	private String role;
	private Address address;

	Person(String name, String role, Address address){

		this.name=name;
		this.role=role;
		this.address=address;

	}
	Person(Person other){
	//copy constructor	
		this.name=other.name;
		this.role=other.role;
		this.address=new Address(other.address);
	}
	public void showPersonDetails(){
		System.out.println("Name: "+name);
		System.out.println("Role: "+role);
		System.out.print("Address: ");
		address.showAddress();
		
	}

	public boolean equals(Object obj){
		Person person =(Person)obj;
		return (this == obj)? true:false;
	}

	public String getName(){

		return this.name;

	}
	public void setName(String name){
		this.name=name;
	}
	public String getRole(){
		return this.role;
	}
	public void setRole(String role){
		this.role=role;
	}





}