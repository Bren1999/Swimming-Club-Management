
import java.time.Month;
import java.util.HashMap;

public class Income {
    
    //instance fields
    private HashMap<String,CustomerIncome> customerIncome;

    //constructor
    public Income(HashMap<String, CustomerIncome> customerIncome) {
        this.customerIncome = customerIncome;
    }
    
    //method to get the yearly income based on the year
    public double getYearlyIncome(int year){
        double totalIncome = 0;
        //iterates through all the income from customers for that year
        for(CustomerIncome c : customerIncome.values()){
            if(c.getRegisteredDate().getYear() == year){
                totalIncome += c.getFees(); //calculates total fees
            }
        }
        return totalIncome;
    }
    
    //method to get the monthly income of the specific year
    public double getMonthlyIncome(Month month,int year){
        double totalIncome = 0;
        for(CustomerIncome c : customerIncome.values()){
            if(c.getRegisteredDate().getYear() == year && c.getRegisteredDate().getMonth() == month){
                totalIncome += c.getFees();
            }
        }
        return totalIncome;
    }
}
