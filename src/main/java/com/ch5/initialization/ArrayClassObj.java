package com.ch5.initialization;

/**
 * Created by Igor on 02.01.2015.
 */

import java.util.Arrays;
import java.util.Random;

import static com.common.Print.*;

public class ArrayClassObj {
    public static void main(String [] args){
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("length a = "+a.length);
        for(int i=0; i<a.length;i++){
            a[i]=rand.nextInt(500);
        }
        print(Arrays.toString(a));
    }
}
