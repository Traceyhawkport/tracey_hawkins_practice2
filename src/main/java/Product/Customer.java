package Product;

import Product.Address.Address;

public class Customer {
    private String customerName;

    private String email;
    private Product1[] purchasedProducts;
    private Address[] addresses;
    private int nextAvailableAddressSlot;//??

    public Customer(String customerName, String email, Product1[] purchasedProducts) {
        this.customerName = customerName;

        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName() {
        this.customerName = customerName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public Product1[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts() {
        this.purchasedProducts = purchasedProducts;

    }

    public void addAddress(Address address) {

        }



    public void getCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        for (Address address : addresses) {
            System.out.println(address.getStreetNumber() + " " + address.getStreetName() + ""
                    + address.getCity() + "" + address.getState() + "");
        }
        System.out.println("Email: " + email);
        System.out.println("Purchased Products:");
        for (Product1 product : purchasedProducts) {
            System.out.println(product.getProductName() + " $" + product.getProductPrice());
        }//tried to use For loop and it is  not working
    }
}


