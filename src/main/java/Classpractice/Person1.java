package Classpractice;

public class Person1 {
    private String name;
    private int age;


    public Person1(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }// end of name

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }// end of age


    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    public static String displayHeight(double height){
        return  Double.toString(height);
    }
}

