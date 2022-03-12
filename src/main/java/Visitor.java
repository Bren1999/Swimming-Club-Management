import java.util.HashMap;

public class Visitor extends Customer{
    
    //static field
    public static final int MIN_AGE = 12; 

    //instance fields
    private HashMap<String,Facility> facilities;
    private Date entryDate;
    
    //constructor
    public Visitor(String cID, String FirstName, String LastName, Date dob, String Gender,HashMap<String,Facility> facilities,Date entryDate) {
        super(cID, FirstName, LastName, dob, Gender);
        this.facilities = facilities;
        this.entryDate = entryDate;
    }

    //verifies the age based on the min age
    @Override
    public boolean verifyAge(){
        return calculateAge() >= MIN_AGE;
    }

    //getter
    public Date getEntryDate() {
        return entryDate;
    }
    
    
//    calculates total fees for visitor
    @Override
    public double totalFees(){
        if(verifyAge()){
            double total = 0.0;
            for (Facility facility : facilities.values()) {
                total += facility.getFees();
            }
            return total;
        }else{
            return 0;
        }
    }  
}
