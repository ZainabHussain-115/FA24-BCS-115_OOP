public class Date{
	private int day;
	private int month;
	private int year;

	Date (int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;

	}
	Date (Date other){
	//copy constructor
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	
	}
	public void showDate(){
		System.out.printf("%d-%d-%d \n",day,month,year);

	}

	public boolean equals(Object obj){
		Date date=(Date)obj;
	 	return (this == obj)? true:false;
	}

	public int getDay(){
		return this.day;
	}
	public void setDay(int day){
		this.day=day;
	}
	public int getMonth(){
		return this.month;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public int getYear(){
		return this.year;

	}
	public void setYear(int year){
		this.year=year;
	}

	

}