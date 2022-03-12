public class IndividualMember extends Member{
    
    //static fields
    public static final int MONTHLY_FEES = 36;
    public static final int MIN_AGE = 12; 

    //constructor
    public IndividualMember(String cID, String FirstName, String LastName, Date dob, String Gender, String address, 
            String allergiesDescription, String healthDescription, String mobileNo, Membership membership) {
        super(cID, FirstName, LastName, dob, Gender, address, allergiesDescription, healthDescription, mobileNo, membership);
    }
    
    //verifies the age of the member
    @Override
    public boolean verifyAge() {
        return calculateAge() >= MIN_AGE; 
    }
    
    //calculates the total fees
    @Override
    public double totalFees(){
        //based on the pay,ent type
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
}
