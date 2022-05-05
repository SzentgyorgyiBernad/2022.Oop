package oop.labor09.Dictionary;

import java.util.ArrayList;

public class ArrayListDictionary {
    ArrayList<String> words=new ArrayList<>();
    private static ArrayListDictionary instance;

    public ArrayListDictionary(ArrayList<String> words) {
        this.words = words;
    }

    IDictionary newInstance()
    {

    }
    int size()
    {
        return words.size();
    }
    boolean add(String item)
    {
        words.add(item);
        return true;
    }
    boolean find(String item)
    {
        for(int i=0;i<words.size();i++)
        {
            if(words.get(i)==item){return true;}
        }
        return false;
    }
}
