package com;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private static Dictionary dictionary=new Dictionary();

    // tempDictionary right now mock but can make calls on put online dictionary here.
    private List<String> tempDictionary=new ArrayList<String>();

    private Dictionary(){

        tempDictionary.add("WORK");
        tempDictionary.add("KING");
        tempDictionary.add("ROW");
        tempDictionary.add("GOAL");
        tempDictionary.add("KNOW");
        tempDictionary.add("RONT");
        tempDictionary.add("TEST");
        tempDictionary.add("YOU");
    }

    public static Dictionary getInstance (){
        return dictionary;

    }

    public   boolean IsEnglishWord(String word) {

        if (tempDictionary.contains(word)){
            return true;
        }
        return false;

    }
}
