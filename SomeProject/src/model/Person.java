package model;

/**
 * Created by Paweł Paszkowski on 2017-04-26.
 */
public class Person implements Singer{
    private int age;
    private String name;
    private double weight;
    private double height;

    public Person() {
        System.out.println("Person constructor");

    }

    public Person(int age, String name, double weight, double height) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Uzytkownik " + name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public double calculateOnBMI(){
        return height/weight;
    }

    @Override
    public void singSomething() {
        System.out.println("SInger");
    }
}
