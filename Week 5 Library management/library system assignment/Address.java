public class Address{
	private String street;
	private String city;

	Address(String street, String city){
		this.street=street;
		this.city=city;
	}
	Address(Address address){

		//copy constructor

		this.street=address.street;
		this.city=address.city;
	}

	public void showAddress(){
		System.out.printf("%s,%s \n",street,city);
			}

	public boolean equals(Object obj){
		Address add =(Address)obj;
		return (this == obj)? true:false;
	} 


	public String getStreet(){

		return this.street;

	}
	public void setStreet(String street){
		this.street=street;
	}
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city=city;
	}


}