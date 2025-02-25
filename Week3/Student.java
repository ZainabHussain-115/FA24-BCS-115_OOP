public class Student{
	static String id;
	private static int count=0;
	private String name;
	private double gpa;
	private String address;

	public Student(String name1, double gpa1, String address1){
	this.name=name1;
	this.gpa=gpa1;
	this.address=address1;
	id=String.format("FA24-BCS-%03d",++count);
	
	
	} 
//name
	public void setName(String var1){
	this.name=var1;
	}
	public String getName(){
	return this.name;
	}
//gpa
	public void setGpa(double var2){
	this.gpa=var2;
	}

	public double getGpa(){
	return this.gpa;
	}
//address
	public void setAddress(String var3){
	this.address=var3;
	}
	public String getAddress(){
	return this.address;
	} 
//display function
	public void display(){
	System.out.printf ("Student id: %s \n",id);
	System.out.printf ("Student name: %s \n", name);
	System.out.printf ("Student GPA: %f \n" , gpa);
	System.out.printf ("Student address: %s \n", address);
	}
}