package oop.labor09.queue;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{
    private final int CAPACITY;
    private ArrayList<Object> items=new ArrayList<>();


    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    @Override
    public void enQueue(Object newObject) {
        if(!isFull())
        {
            this.items.add(newObject);
        }

    }

    @Override
    public Object deQueue() {
        if(!isEmpty())
        {
            Object item=items.get(0);
            items.remove(0);
            return item;
        }
        return null;
    }

    @Override
    public void printQueue() {
        System.out.println(items);
    }

    @Override
    public boolean isEmpty() {
        return this.items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return this.items.size() == CAPACITY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        if(this.items.size()!=that.items.size()) return false;
        for(int i=0;i<this.items.size();i++)
        {
            if(!this.items.get(i).equals(that.items.get(i)));
        }
        return true;
    }

}
