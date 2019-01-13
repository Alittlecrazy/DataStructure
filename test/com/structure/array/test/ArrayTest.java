package com.structure.array.test;

import com.structure.array.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JHM
 * @create 2019-01-12 13:17
 */
public class ArrayTest {
    public static void main(String[] args) {
        Array<Integer> arr = new Array();
        for (int i = 0;i < 10 ;i++)
            arr.addLast(i);
        System.out.println(arr);
        arr.addFirst(100);
        System.out.println(arr);

        arr.addByIndex(2,200);
        System.out.println(arr);
        arr.removeByIndex(2);
        System.out.println(arr);
        arr.removeElement(100);
        System.out.println(arr);
        arr.set(2,100);
        arr.addLast(1);
        arr.removeLast();
        arr.removeLast();
        System.out.println(arr);
    }
}
