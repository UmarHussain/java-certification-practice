package com.company.chapter2;

/**
 * Created by bv on 7/26/2016.
 */
public interface InterfaceB {

    default void foo(){
        System.out.println("Interface B");
    }
}
