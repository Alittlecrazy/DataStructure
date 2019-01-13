package com.structure.array.test;

import com.structure.queue.ArrayQueue;

/**
 * @author JHM
 * @create 2019-01-13 13:27
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0 ;i < 10 ; i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.getFront());

    }
}
