package HashMapExcercise;


public class ItemCollection {
    private String name;
    private String description;
    private double price;
    private int availableQuantity;

    public ItemCollection(String name, String Description, double price, int availableQuanity) {


        this.name = name;
        this.description = description;
        this.price = price;
        this.availableQuantity = availableQuantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}


