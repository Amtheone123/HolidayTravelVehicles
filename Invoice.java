import java.util.List;

public class Invoice {
    private String invoiceID;
    private String date;
    private double negotiatePrice;
    private double totalPrice;
    private double tax;
    private double licenseFee;
    private String signature;

    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private List<Option> options;

    public Invoice(String invoiceID, String date, double negotiatePrice, double totalPrice,
                   double tax, double licenseFee, String signature,
                   Customer customer, Salesperson salesperson,
                   Vehicle vehicle, List<Option> options) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.negotiatePrice = negotiatePrice;
        this.totalPrice = totalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.signature = signature;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.options = options;
    }

    @Override
    public String toString() {
        return "Invoice [ID=" + invoiceID + ", Date=" + date +
               ", Total=" + totalPrice + ", Customer=" + customer.getName() +
               ", Salesperson=" + salesperson.getName() +
               ", Vehicle=" + vehicle.getModel() + "]";
    }
}
