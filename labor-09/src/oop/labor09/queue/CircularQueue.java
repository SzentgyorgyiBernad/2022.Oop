package oop.labor09.queue;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class CircularQueue  {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        int i=that.front,j=((CircularQueue) o).front;
        while(i!=that.rear && j!=((CircularQueue) o).rear)
        {
            if(!Arrays.equals(items,that.items))
            {
                return false;
            }
            if(i==this.capacity-1)
            {
                i=0;
            }
            else i++;
            if(j==((CircularQueue) o).capacity-1)
            {
                j=0;
            }
            else j++;
        }
        return true;
    }
}
