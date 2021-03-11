package com.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName SerializableTest.java
 * @Description TODO
 * @createTime 2021-03-12 00:35:00
 */
public class SerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("-----序列化过程-----");
        Person person1 = new Person(23,"Josh关华钦",new Date());
        Person person2 = new Person(23,"Josh关华钦",new Date());
        Person person3 = new Person(23,"Josh关华钦", new Date());
        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        File file = new File("serializable.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();

        System.out.println("-----反序列化过程-----");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Person> unserialized = (ArrayList<Person>)objectInputStream.readObject();
        for (Person p : unserialized){
            System.out.println(p.toString());
        }
        objectInputStream.close();

    }
}
