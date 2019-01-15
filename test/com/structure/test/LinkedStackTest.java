package com.structure.test;

import com.structure.stack.LinkedStack;

/**
 * @author JHM
 * @create 2019-01-15 20:35
 */
public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        for (int i = 0;i < 10;i++)
            linkedStack.push(i);

        System.out.println(linkedStack);

        linkedStack.pop();
        System.out.println(linkedStack);
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.getSize());
        System.out.println(linkedStack.isEmpty());
    }
}
