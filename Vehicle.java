public class Vehicle {
    private String serialNumber;
    private double baseCost;
    private int year;
    private String name;
    private String model;
    private String manufacturer;

    public Vehicle(String serialNumber, double baseCost, int year, String name, String model, String manufacturer) {
        this.serialNumber = serialNumber;
        this.baseCost = baseCost;
        this.year = year;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() { 
        return serialNumber; 
    }
    public double getBaseCost() { 
        return baseCost; 
    }
    public int getYear() { 
        return year; 
    }
    public String getName() { 
        return name; 
    }
    public String getModel() { 
        return model; 
    }
    public String getManufacturer() { 
        return manufacturer; 
    }

    @Override
    public String toString() {
        return "Vehicle [Serial=" + serialNumber + ", BaseCost=" + baseCost +
               ", Year=" + year + ", Name=" + name +
               ", Model=" + model + ", Manufacturer=" + manufacturer + "]";
    }
}

