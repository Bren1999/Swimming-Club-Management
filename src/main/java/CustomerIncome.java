/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//this class will keep the fee details of each customer which will be used to calc the income generated
public class CustomerIncome {
    private String uID;
    private Date registeredDate;
    private double fees;

    //constructor for CustomerIncome class
    public CustomerIncome(String uID, Date registeredDate, double fees) {
        this.uID = uID;
        this.registeredDate = registeredDate;
        this.fees = fees;
    }
    
    //getters and setters for the variable
    public String getuID() {
        return uID;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public double getFees() {
        return fees;
    }
}
