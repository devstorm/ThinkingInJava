package com.ch5.initialization;

/**
 * Created by Igor on 02.01.2015.
 */

import static com.common.Print.*;

public class ArraysOfPrimitives {
    public static void main(String[] a){
        int[] a1={1,2,3,4,5};
        int[] a2;
        a2=a1;
        for(int i=0;i<a2.length; i++){
            a2[i]=a2[i]+1;
        }
        for(int i=0; i<a1.length;i++){
            print("a1["+i+"] = "+a1[i]);
        }
    }
}
