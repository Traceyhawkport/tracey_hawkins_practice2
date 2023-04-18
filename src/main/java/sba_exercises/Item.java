package sba_exercises;

public class Item {
    private String itemName;
    private String itemDescriptiion;
    private double price;
    private int quanity;
    private int availableQuantity;


    //default constructor

    public Item() {
        this.quanity = 1;
    }

    //Constructor with parameters
    public Item(String itemName, String itemDescriptiion, double price, Integer availableQuantity) {

        this.itemName = itemName;
        this.itemDescriptiion = itemDescriptiion;
        this.price = price;
        //this.quanity = quantity;
        this.availableQuantity = availableQuantity;
       // this.quanity = 1;

    }


    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescriptiion;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescriptiion = itemDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quanity;
    }

    public void setQuantity(Integer quantity) {
        this.quanity = quantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}




