package com.company.chapter1;

import com.company.chapter1.aquarium.*;
//import com.company.chapter1.aquarium.Water;

/**
 * Created by bv on 5/31/2016.
 */
public class Chapter1EndQuestions {

   static double aDouble;
    static float aFloat;
    public static final void main(String... $) {


        double bDouble = 1_20;

        long ad = 1L;

        float  a = 0x1111;

        System.out.println("arg print : "+$[0]);
        System.out.println("arg print : "+$[1]);
        System.out.println("aDouble "+aDouble);
        System.out.println("aFloat  "+aFloat);
    }
}


//question 7

class  WaterFiller{
    Water water;
}

class Rabbit{

    public static void main(String[] args) {

        Rabbit one = new Rabbit();
        Rabbit two = new Rabbit();
        Rabbit three = one;
        one = null;
        Rabbit four = one;
        three = null;
        two = null;
        two = new Rabbit();
        System.gc();
    }
}

class Salmon {
    int count;
    public void Salmon() {
        count = 4;
    }
    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.count);
    }

 }


