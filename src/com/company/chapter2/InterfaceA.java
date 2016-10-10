package com.company.chapter2;

/**
 * Created by bv on 7/26/2016.
 */
public interface InterfaceA {

    default void  foo(){

        System.out.println("InterfaceA");
    };
}
