package Classpractice;

public class Main {
    public static void main(String[] args){

        Person1 personOne = new Person1(9, "Leo");
        Person1 personTwo = new Person1(32, "Tracey");

        personOne.sayHello();
        personTwo.sayHello();
        String height = Person1.displayHeight(5.3);
        System.out.println(height);

    }
}
