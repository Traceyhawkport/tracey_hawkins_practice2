package Product;

public class MainHomeWork {
    public static void main(String[] args) {

        Product1 productNew1 = new Product1("Legos", 60.99);
        Product1 productNew2 = new Product1("Robots", 30.99);

        Customer CustomerNew1 = new Customer("Leo", "32 Lego Lane", "leoh@gmail.com",
                new Product1[]{productNew1, productNew2});
        Customer CustomerNew2 = new Customer("Tracey",)

        CustomerNew1.getCustomerInfo();
    }
}

