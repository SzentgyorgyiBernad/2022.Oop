package oop.labor10.lab11_4;

import oop.labor10.lab11_5.InvalidSizeException;

import java.util.ArrayList;

public class Stack {
    ArrayList<Object> items=new ArrayList<>();
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull()
    {
        return items.size()==capacity;
    }

    public void push(Object newObj) throws StackException
    {
        if(isFull())
        {
            throw new StackException("STACK IS FULL");
        }
        else items.add(newObj);
    }

    public void pop() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("STACK IS EMPTY");
        }
        else items.remove(items.size()-1);
    }


    public boolean isEmpty()
    {
        return items.size()==0;
    }

    public Object top() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("STACK IS EMPTY");
        }
        else return items.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
