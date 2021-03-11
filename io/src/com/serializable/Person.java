package com.serializable;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2021-03-12 00:36:00
 */
public class Person implements Serializable {

    public int age;

    public String name;

    public Date date;


    public Person(int age,String name,Date date){
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
