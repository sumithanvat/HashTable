package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        WordFrequencyCounter counter = new WordFrequencyCounter();
        String[] words = paragraph.split(" ");
        for (String word : words) {
            counter.addWord(word);
        }
        counter.displayWordFrequency();
    }

}
