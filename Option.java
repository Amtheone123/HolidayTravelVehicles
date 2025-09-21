public class Option {
    private double price;
    private String description;
    private String optionCode;

    public Option(double price, String description, String optionCode) {
        this.price = price;
        this.description = description;
        this.optionCode = optionCode;
    }

    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getOptionCode() { return optionCode; }

    @Override
    public String toString() {
        return "Option [Code=" + optionCode + ", Description=" + description + ", Price=" + price + "]";
    }
}
