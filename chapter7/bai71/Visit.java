import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date){
        this(new Customer(name), date);
    }

    public Visit(Customer customer, Date date) {
    this.customer = customer;
    this.date = date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense(){
        return serviceExpense;
    }

    public void setServiceExpense(double ex){
        this.serviceExpense = ex;
    }

    public double getProductExpense(){
        return productExpense;
    }

    public void setProductExpense(double ex){
        this.productExpense = ex;
    }

    public double getTotalExpense(){
         if (!customer.isMember()) {
            return serviceExpense + productExpense;
        }

        double serviceRate =
                DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productRate =
                DiscountRate.getProductDiscountRate(customer.getMemberType());

        double serviceAfterDiscount = serviceExpense * (1 - serviceRate);
        double productAfterDiscount = productExpense * (1 - productRate);

        return serviceAfterDiscount + productAfterDiscount;
    }

    @Override
    public String toString() {
    return "Visit[customer=" + customer
            + ",date=" + date
            + ",serviceExpense=" + serviceExpense
            + ",productExpense=" + productExpense
            + ",totalExpense=" + getTotalExpense() + "]";
}


}
