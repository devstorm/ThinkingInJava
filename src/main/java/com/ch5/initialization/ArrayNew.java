package com.ch5.initialization;

/**
 * Created by Igor on 02.01.2015.
 */
import java.util.Arrays;
import java.util.Random;

import static com.common.Print.*;

public class ArrayNew {
    public static void main(String[] args){
        int[] a;
        Random rand = new Random(47);
        a=new int[rand.nextInt(20)];
        print("Length a = "+a.length);
        print(Arrays.toString(a));
    }
}
