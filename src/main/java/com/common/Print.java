package com.common;

/**
 * Created by Igor on 02.01.2015.
 */
public class Print {

    public static void print(Object ... args){
        for(Object a : args){
            System.out.print(a);
        }
        System.out.println();
    }
}
