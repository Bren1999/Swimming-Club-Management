public class Facility {
    
    //instance fields
    private String facilityType;
    private double fees;

    //constructor
    public Facility(String facilityType, double fees) {
        this.facilityType = facilityType;
        this.fees = fees;
    }

    //getters and setters
    public String getFacilityType() {
        return facilityType;
    }

    public double getFees() {
        return fees;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
