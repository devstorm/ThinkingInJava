package com.ch5.initialization;

/**
 * Created by Igor on 02.01.2015.
 */
import static com.common.Print.*;

class Cup{
    Cup(int maker){
        print("Cup("+maker+")");
    }
    void f(int maker){
        print("f("+maker+")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1=new Cup(1);
        cup2=new Cup(2);
    }
    Cups(){
        print("Cups()");
    }
}

public class ExplicitStatic {

    public static void main(String[] a){
        print("Inside main()");
        Cups.cup1.f(99);
    }
    //static Cups cups1=new Cups();
    //static Cups cups2=new Cups();
}
