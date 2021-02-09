package com;

import java.util.HashSet;
import java.util.Set;

public class Words {

    StringBuilder outWords = new StringBuilder();
    public String inputString;
    Set<String> words = new HashSet<String>();

    //find all the possible English words for the given string
    public Set<String> findWords(String strInput) {
        Set<String> output = new HashSet<String>();

        // check input string is valid or not
        if (strInput == null || strInput.length() == 0 || !isValidString(strInput)) {
            return output;
        }

        System.out.println("Valid English words are:");
        inputString = strInput;
        Set<String> temp = generateWords(outWords);

        for (String word : temp) {
            if (Dictionary.getInstance().IsEnglishWord(word)) {
                output.add(word);
                System.out.println(word);
            }
        }

        return output;
    }


    // function to generate all the possible  words from the given  string.
    private Set<String> generateWords(StringBuilder outWords) {

        if (outWords.length() >= inputString.length()) {
            return words;
        }
        for (int i = 0; i < inputString.length(); i++) {
            StringBuilder tempString = new StringBuilder(outWords);
            tempString.append(inputString.charAt(i));
            words.add(tempString.toString());
            generateWords(tempString);
        }
        return words;
    }


    // function to check string has only Alphabet or not
    public boolean isValidString(String name) {
        return name.matches("[a-zA-Z]+");
    }


}