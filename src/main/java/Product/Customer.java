package Product;

public class Customer {
    private String CustomerName;
    private String address;
    private String Email;
    private String PurchasedProdcuts;

    public Customer(String CustomerName, String address, String Email, String PurchasedProdcuts) {
        this.CustomerName = CustomerName;
        this.address = address;
        this.Email = Email;
        this.PurchasedProdcuts = PurchasedProdcuts;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName() {
        this.CustomerName = CustomerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail() {
        this.Email = Email;
    }
    public String getPurchasedProdcuts() {
        return PurchasedProdcuts;
    }

    public void setPurchasedProdcuts() {
        this.PurchasedProdcuts = PurchasedProdcuts;

    }

        public void getCustomerInfo() {
            System.out.println("Customer Name: " + CustomerName);
            System.out.println("Address: " + address);
            System.out.println("Email: " + Email);
            System.out.println("Purchased Products:");
            for (Product1 product : PurchasedProdcuts) {
                System.out.println(product.getProductName() + " $" + product.getProductPrice();
            }//tried to use For loop and it is  not working
        }
        }


