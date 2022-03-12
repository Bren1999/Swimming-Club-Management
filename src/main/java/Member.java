public abstract class Member extends Customer{
    
    //instance fields
    private String address;
    private String allergiesDescription, healthDescription, mobileNo;
    Membership membership;

    //constructor
    public Member(String cID, String FirstName, String LastName, Date dob, String Gender, String address, String allergiesDescription, String healthDescription, String mobileNo,
            Membership membership) {
        super(cID, FirstName, LastName, dob, Gender);
        this.address = address;
        this.allergiesDescription = allergiesDescription;
        this.healthDescription = healthDescription;
        this.mobileNo = mobileNo;
        this.membership = membership;
    }

    //getters and setters
    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Membership getMembership() {
        return membership;
    }

    public String getAddress() {
        return address;
    }

    public String getAllergiesDescription() {
        return allergiesDescription;
    }

    public String getHealthDescription() {
        return healthDescription;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAllergiesDescription(String allergiesDescription) {
        this.allergiesDescription = allergiesDescription;
    }

    public void setHealthDescription(String healthDescription) {
        this.healthDescription = healthDescription;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
