package oop.labor08.lab8_2;

import java.util.ArrayList;

public class tackInheritance extends ArrayList<Object> {
    private int capacity;

    public tackInheritance(int capacity) {
        this.capacity = capacity;
    }

    //@Override
    //public boolean isEmpty() {
   //     return this.size()==0;
    //}

    public void pop()
    {
        if(!isEmpty())
        {
            this.remove(size()-1);
        }
    }
}
