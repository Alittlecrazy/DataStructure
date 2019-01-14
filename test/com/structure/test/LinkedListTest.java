package com.structure.test;

import com.structure.linkedList.LinkedList;

/**
 * @author JHM
 * @create 2019-01-14 21:28
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0;i < 10;i++){
            linkedList.addFirst(i);
        }
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);

    }
}
