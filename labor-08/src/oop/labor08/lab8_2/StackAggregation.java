package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackAggregation {
    ArrayList<Object> items=new ArrayList<>();
    private int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull()
    {
        return items.size()==capacity;
    }

    public void push(Object newObj)
    {
        if(!isFull())
        {
            items.add(newObj);
        }
    }

    public void pop()
    {
        if(!isEmpty())
        {
            items.remove(items.size()-1);
        }
    }


    public boolean isEmpty()
    {
        return items.size()==0;
    }

    public Object top()
    {
        return items.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
