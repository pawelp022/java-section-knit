package model;

/**
 * Created by Paweł Paszkowski on 2017-04-26.
 */
public class Dog implements Singer{
    @Override
    public void singSomething() {
        System.out.println("Dog");
    }
}
