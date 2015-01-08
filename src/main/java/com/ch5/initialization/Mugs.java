package com.ch5.initialization;

/**
 * Created by Igor on 02.01.2015.
 */

import static com.common.Print.*;

class Mug{
    Mug(int maker){
        print("Mug("+maker+")");
    }
    void f(int maker){
        print("f("+maker+")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1=new Mug(1);
        mug2=new Mug(2);
        print("mug1 & mug2 initialized");
    }
    Mugs(){
        print("Mugs()");
    }

    Mugs(int i){
        print("Mugs(int)");
    }

    public static void main(String [] a){
        print("In method main()");
        new Mugs();
        print("new Mugs() completed");
        new Mugs(1);
        print("new Mugs(1) completed");
    }
}
