public class Membership {
    
    //instance fields
    private String paymentType;
    private Date startDate;
    
    //constructor
    public Membership(String paymentType, Date startDate) {
        this.paymentType = paymentType;
        this.startDate = startDate;
    }

    //getters and setters
    public String getPaymentType() {
        return paymentType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    //get the end date
    public Date endDate() {
        //based on payment type
        switch (paymentType) {
            case "monthly" -> {
                return startDate.incrementMonths(1);
            }
            case "quaterly" -> {
                return startDate.incrementMonths(3);
            }
            case "yearly" -> {
                return startDate.incrementMonths(12);
            }
            default -> {
                return startDate;
            }
        }
    }
    

    
}
