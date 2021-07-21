package com.agro.lk.corejava;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestStudent {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person s1=new Person(); //created by an new object using "new" keyword
        s1.st_id=12;

        System.out.println(s1.st_id);

        //create a object newInstance method of class
        //load your class  (2 ways to load your class )

        //1st method "Class.forname"
        //Person s2=(Person)Class.forName("com.agro.lk.corejava.Person").newInstance();
        Person s2=Person.class.newInstance();
        System.out.println(s2);
        s2.st_id=24;
        System.out.println(s2.st_id);


        Constructor<Person> constr= Person.class.getConstructor();
        Person s3=constr.newInstance();
        s3.st_id=48;
        System.out.println("Constructor object  " + s3.st_id);




    }
}
