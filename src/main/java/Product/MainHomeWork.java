package Product;

import Product.Address.Address;

public class MainHomeWork {
    public static void main(String[] args) {

        Product1 productNew1 = new Product1("Legos", 60.99);
        Product1 productNew2 = new Product1("Robots", 30.99);


        Customer CustomerNew1 = new Customer("Leo",  "leoh@gmail.com",
                new Product1[]{productNew1, productNew2});

        //Customer CustomerNew2 = new Customer("Tracey", "tnh@gmail.com",
                //new Product1[]{productNew1, productNew2});

    Address address = new Address(true, 1234, "Main Drive",
            "Random City", "MA");



        CustomerNew1.getCustomerInfo();
    }
}

