package PatikaStore;

public class MobilePhones {
    private int phoneID;
    private String brand;
    private String name;
    private double price;
    private int stock;
    private double discountRate;
    private int ram;
    private int storage;
    private double screenSize;
    private double cameraMegapixel;
    private int batteryCapacity;
    private String color;

    public MobilePhones(int phoneID, String brand, String name, double price, int stock,
                        double discountRate, int ram, int storage, double screenSize,
                        double cameraMegapixel, int batteryCapacity, String color) {
        this.phoneID = phoneID;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.discountRate = discountRate;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.cameraMegapixel = cameraMegapixel;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getCameraMegapixel() {
        return cameraMegapixel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getColor() {
        return color;
    }
}
