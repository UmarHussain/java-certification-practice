package com.company.chapter3.equality;

/**
 * Created by bv on 8/10/2016.
 */
public class EqualityTest {

    public static void main(String[] args) {
        Tiger t1 = new Tiger();

        t1.setName("T1");
        t1.setAge("25");

        Tiger t2 = new Tiger();
        Tiger t3 = t1;




        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
        System.out.println(t3.equals(t1) ); // false
        t1.setName("T4");
        System.out.println(t3.getName().equals(t1.getName()));

        //System.out.println("hash T3 : "+t3.hashCode()+" hash T2 : "+t2.hashCode());



    }
}
