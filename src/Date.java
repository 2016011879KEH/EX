
public class Date {
	private int year;
	private String month;
	private int day;
	
	Date(){
		
	}
	
	Date(int year){
		this.year=year;
	}
	
	Date(String month){
		this.month = month;
	}
	
	Date(int year, int day){
		this.year = year;
		this.day = day;
	}
	
	Date(int year,String month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

}
