package lab4_1;

public class Date{
	public int day;
	public int month;
	public int year;

	public Date(int day, int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonh(int month) {
		if(month >=1 && month <=12) {
			this.month =month;
		}
	}
	
	public int getYear() {
		return year+543;
	}
	
	public void setYear( int year) {
		this.year = year;
	}
	
	
	
	
	
}

		

