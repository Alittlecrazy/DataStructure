package com.structure.test;

import com.structure.queue.LinkedQueue;

/**
 * @author JHM
 * @create 2019-01-15 21:42
 */
public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        for (int i = 0;i < 10 ; i++){
            linkedQueue.enqueue(i);
        }
        System.out.println(linkedQueue);

        linkedQueue.dequeue();
        System.out.println(linkedQueue);
        System.out.println(linkedQueue.getSize());
        System.out.println(linkedQueue.getFront());
    }
}
