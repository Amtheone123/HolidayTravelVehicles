public class Salesperson {
    private String salespersonID;
    private String name;
    private String hireDate;

    public Salesperson(String salespersonID, String name, String hireDate) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getSalespersonID() { 
        return salespersonID; 
    }
    public String getName() { 
        return name; 
    }
    public String getHireDate() { 
        return hireDate; 
    }

    @Override
    public String toString() {
        return "Salesperson [ID=" + salespersonID + ", Name=" + name + ", HireDate=" + hireDate + "]";
    }
}

