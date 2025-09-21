import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        Customer customer = new Customer("C001", "Alice", "123 Main St", "555-1234");
        Salesperson salesperson = new Salesperson("S001", "Bob", "2023-01-01");
        Vehicle vehicle = new Vehicle("SN12345", 25000, 2025, "Corolla", "XLE", "Toyota");

        List<Option> options = new ArrayList<>();
        options.add(new Option(500, "Leather Seats", "OPT01"));
        options.add(new Option(1200, "Premium Audio", "OPT02"));

        
        Invoice invoice = new Invoice("INV001", "2025-09-21", 26000, 27700,
                                      1200, 500, "Alice Signature",
                                      customer, salesperson, vehicle, options);

     
        System.out.println(invoice);
    }
}
