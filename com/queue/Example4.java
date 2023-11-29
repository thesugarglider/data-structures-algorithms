package com.queue;

import com.queue.library.ArrayQueue;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(2);

        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);



        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.peek());
    }
}
