package com.company.chapter3.string.builder;

/**
 * Created by bv on 9/2/2016.
 */
public class StringBuilderPractice {

    public static void stringBuilderQuestion12(){
        StringBuilder numbers = new StringBuilder("0123456789");
        System.out.println(numbers);
        numbers.delete(2, 8);
        System.out.println(numbers);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);
    }

    public static void abcdef(){
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.delete(1, 2); // sb = adef
        System.out.println(sb);
        sb.deleteCharAt(4); // throws an exception
        System.out.println(sb);
    }

    public static void stringVoidQestion(){
        StringBuilder b  = new StringBuilder("");
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);
    }

    public static void puzzleQuestion14(){

    }

    public static void main(String[] args) {

        //stringBuilderQuestion12();
        abcdef();

    }
}
