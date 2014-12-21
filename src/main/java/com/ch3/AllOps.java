package com.ch3;

/**
 * Created by Igor on 21.12.2014.
 */
public class AllOps {
    public static void main(String[] args){
        System.out.println("Git!");

        AllOps ops = new AllOps();

        ops.boolTest(true,false);
        ops.charTest('a','b');
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

    void charTest(char x, char y){
        x=(char)(x*y);


    }
}
