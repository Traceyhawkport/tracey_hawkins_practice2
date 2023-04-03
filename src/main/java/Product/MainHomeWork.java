package Product;

public class MainHomeWork {
    public static void main(String[] args) {

        Product1 productnew1 = new Product1("Legos", 60.99);
        Product1 productnew2 = new Product1("Robot", 30.99);

        Customer CustomerNew1 = new Customer("Leo", "32 Lego Lane", "leoh@gmail.com", "Legos");

        CustomerNew1.getCustomerInfo();
    }
}

