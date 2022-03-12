//FamilyMember class which is a subclass of Memeber
public class FamilyMember extends Member {

    //static fields 
    public static final int MONTHLY_FEES = 60;
    public static final int MIN_AGE = 18;
    
    //instance variable
    private String familyMembers;
    
    //constructor
    public FamilyMember(String cID, String FirstName, String LastName, Date dob, String Gender, String address, String allergiesDescription, String healthDescription, String mobileNo, 
            Membership membership,String familyMembers) {
        super(cID, FirstName, LastName, dob, Gender, address, allergiesDescription, healthDescription, mobileNo, membership);
        this.familyMembers = familyMembers;
    }

    //method to check the age of the member and verify it
    @Override
    public boolean verifyAge() {
        return calculateAge() >= MIN_AGE; 
    }
    
    //method to calc the total fees of the member
    @Override
    public double totalFees(){
        //different fees based on the payment type
        switch (membership.getPaymentType()) {
            case "monthly" -> {
                return MONTHLY_FEES;
            }
            case "quaterly" -> {
                return MONTHLY_FEES*3;
            }
            case "yearly" -> {
                return MONTHLY_FEES*12;
            }
            default -> {
                return 0;
            }
        }
    } 

    //getters and setters
    public String getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(String familyMembers) {
        this.familyMembers = familyMembers;
    }
    
    
    
}
