package oop.labor12.lab12_1;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(IDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public  boolean find(String item)
    {
        return dictionary.find(item);
    }


}
