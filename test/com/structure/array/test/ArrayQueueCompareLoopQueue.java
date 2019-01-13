package com.structure.array.test;

import com.structure.queue.ArrayQueue;
import com.structure.queue.LoopQueue;
import com.structure.queue.Queue;

/**
 * @author JHM
 * @create 2019-01-13 21:16
 */
public class ArrayQueueCompareLoopQueue {

    public static double getTime(Queue<Integer> queue,long frequency){
        long start = System.nanoTime();
        for (int i = 0; i < frequency;i++){
            queue.enqueue(i);
        }
        for (int i = 0; i < frequency;i++){
            queue.dequeue();
        }

        long end = System.nanoTime();
        return (end - start) / 1000000000.0;
    }


    public static void main(String[] args) {
        long frequency = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        System.out.println("ArrayQueue : "+getTime(arrayQueue,frequency) +"s");
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        System.out.println("ArrayQueue : "+getTime(loopQueue,frequency) +"s");
    }
}
