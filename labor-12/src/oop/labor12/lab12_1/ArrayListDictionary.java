package oop.labor12.lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{
    ArrayList<String> words;
    private static ArrayListDictionary instance=null;

    public ArrayListDictionary(ArrayList<String> words) {
        this.words = words;
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int size()
    {
        return words.size();
    }

    public boolean add(String item)
    {
        if(find(item)==false)
        {
            words.add(item);
            Collections.sort(words);
            return true;
        }
        return false;
    }
    public boolean find(String item)
    {
        for(int i=0;i<words.size();i++)
        {
            if(words.get(i).equals(item))
            {
                return true;
            }
        }
        return false;
    }
}
