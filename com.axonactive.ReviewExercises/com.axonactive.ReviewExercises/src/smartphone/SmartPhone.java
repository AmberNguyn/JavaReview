package smartphone;

public class SmartPhone implements Comparable<SmartPhone> {
    private String phoneID;
    private String manufacturer;
    private double price;
    private String createdDate;
    private String description;

    public SmartPhone(String phoneID, String manufacturer, int price, String createdDate, String description) {
        this.phoneID = phoneID;
        this.manufacturer = manufacturer;
        this.price = price;
        this.createdDate = createdDate;
        this.description = description;
    }

    public SmartPhone(){};

    public String getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(String phoneID) {
        this.phoneID = phoneID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        String str = "Phone ID: " + phoneID + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Price: " + price + "\n" +
                "Created date: " + createdDate + "\n" +
                "Description: " + description + "\n";
        return str;
    }


    @Override
    public int compareTo(SmartPhone smartPhone) {
        return (int)(this.price - smartPhone.price);
    }
}
