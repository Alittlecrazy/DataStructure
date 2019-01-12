package com.structure.array.test;

import com.structure.array.Array;

/**
 * @author JHM
 * @create 2019-01-12 13:17
 */
public class ArrayTest {
    public static void main(String[] args) {
        Array arr = new Array();
        for (int i = 0;i < 5 ;i++)
            arr.add(i);
        System.out.println(arr);
        arr.addFirst(100);
        System.out.println(arr);

        arr.addByIndex(2,200);
        System.out.println(arr);

    }
}
