package com.structure.array.test;

import com.structure.queue.LoopQueue;

/**
 * @author JHM
 * @create 2019-01-13 21:06
 */
public class LoopQueueTest {
    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);

            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
