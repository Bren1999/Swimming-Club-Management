
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public abstract class Customer {
    private Date dob;
    private String cID;
    private String firstName, lastName, gender;

    //cunstructor for the class Customer
    public Customer(String cID, String firstName, String lastName, Date dob ,String gender) {
        this.dob = dob;
        this.cID = cID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
//getters and setts for the variable name
    public Date getDob() {
        return dob;
    }

    public String getcID() {
        return cID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    //calculates the age of the customer 
    public int calculateAge(){
        LocalDate onSept21 = LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 1); //date as on 1st sept of the current year
        LocalDate birthday = LocalDate.of(dob.getYear(), dob.getMonth(), dob.getDay());  //Birth date of customer
        Period p = Period.between(birthday, onSept21);
        return p.getYears();
    }
     //abstract methods that will be implemented by the subclasses
    public abstract boolean verifyAge();
    public abstract double totalFees();
}
