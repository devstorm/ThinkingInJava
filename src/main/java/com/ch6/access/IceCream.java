package com.ch6.access;

/**
 * Created by Igor on 03.01.2015.
 */

class Sundae {
    private Sundae(){}
    static Sundae makeASundae(){
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args){
        //!Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}
