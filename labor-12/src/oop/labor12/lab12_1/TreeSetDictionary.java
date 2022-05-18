package oop.labor12.lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static oop.labor12.lab12_1.IDictionary.DICTIONARY_FILE;

public class TreeSetDictionary implements IDictionary{
    private Set<String> words;
    private static TreeSetDictionary instance = null;

    public TreeSetDictionary() {
        words = new TreeSet<>();
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

    public static IDictionary newIstance()
    {
        if(instance==null)
        {
            instance=new TreeSetDictionary();
        }
        return instance;
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
            return true;
        }
        return false;
    }
    public boolean find(String item)
    {
        return words.contains(item);
    }
}
