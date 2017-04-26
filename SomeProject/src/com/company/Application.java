package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import model.Person;

/**
 * Created by Paweł Paszkowski on 2017-04-26.
 */
public class Application {
    public static void chceckSinger(Singer singer){

    }
    public static void main(String[] args) {
        Person firstPerson = new Person(21, "jan", 80.5, 180);
        System.out.println(firstPerson);

        firstPerson.setAge(22);
        System.out.println(firstPerson.getAge());
        System.out.println(firstPerson.calculateOnBMI());

        System.out.println(firstPerson.singSomething());
    }
}
