package com.ch3;

/**
 * Created by Igor on 21.12.2014.
 */
public class AllOps {
    public static void main(String[] args){
        System.out.println("Git!");
    }

    void f(boolean b){}
    void boolTest(boolean x, boolean y){
        // Arithm oper
        //!x=x*y;
        //!x=x/y;
        f(x==y);
        f(x!=y);
        f(!y);
        x=x&&y;
    }
}
