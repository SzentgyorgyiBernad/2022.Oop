package oop.labor09.queue;

import java.util.Random;

public class CircularQueue {
    private final int capacity;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.items=new Object[capacity];
        this.front=-1;
        this.rear=-1;
    }



}
