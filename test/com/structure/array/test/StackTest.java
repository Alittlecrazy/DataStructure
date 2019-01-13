package com.structure.array.test;

import com.structure.stack.ArrayStack;
import com.structure.stack.Stack;

/**
 * @author JHM
 * @create 2019-01-13 12:55
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 10 ;i++){
            stack.push(i);
        }

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
