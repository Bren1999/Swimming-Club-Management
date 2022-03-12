import java.time.LocalDate;
import java.time.Month;

public class Date {
    
    // instance fields
    private int day, year;
    private Month month;

    //constructor
    public Date(int day, Month month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
    }

    // set methods
    public void setDay(int d) {
	day = d;
    }
    public void setMonth(Month m) {
	month = m;
    }
    public void setYear(int y) {
	year = y;
    }

    // get methods
    public int getDay() {
	return day;
    }
    public Month getMonth() {
	return month;
    }
    public int getYear() {
	return year;
    }

    //method to get the month after a period of time(months)
    public Date incrementMonths(int months){
        LocalDate newDate = LocalDate.of(getYear(), getMonth(), getDay()).plusMonths(months);
        return new Date(newDate.getDayOfMonth(),newDate.getMonth(),newDate.getYear());
    }
    
    // toString method
    @Override
    public String toString() {
	return (day + "/" + month.getValue() + "/" + year);
    }
}
