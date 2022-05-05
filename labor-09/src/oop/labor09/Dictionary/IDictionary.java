package oop.labor09.Dictionary;

public interface IDictionary {
    static final String DICTIONARY_FILE;

    boolean add(String item);
    boolean find(String item);
    int size();

}
