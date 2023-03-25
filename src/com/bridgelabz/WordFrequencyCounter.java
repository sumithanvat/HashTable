package com.bridgelabz;

import java.util.LinkedList;

public class WordFrequencyCounter {
    private final LinkedList<MyMapNode>[] myBucketArray;
    private static final int NUM_BUCKETS = 10;

    // Constructor
    public WordFrequencyCounter() {
        myBucketArray = new LinkedList[NUM_BUCKETS];
        for (int i = 0; i < NUM_BUCKETS; i++) {
            myBucketArray[i] = new LinkedList<>();
        }
    }

    // Method to find the index of a word using hash code
    private int getBucketIndex(String word) {
        int hashCode = Math.abs(word.hashCode());
        return hashCode % NUM_BUCKETS;
    }

    // Method to add a word to the hash table or increment its frequency if it already exists
    public void addWord(String word) {
        int bucketIndex = getBucketIndex(word);
        LinkedList<MyMapNode> myList = myBucketArray[bucketIndex];
        MyMapNode myNode = null;
        for (MyMapNode node : myList) {
            if (node.getKey().equals(word)) {
                myNode = node;
                break;
            }
        }
        if (myNode != null) {
            myNode.setValue(myNode.getValue() + 1);
        } else {
            myNode = new MyMapNode(word, 1);
            myList.addLast(myNode);
        }
    }

    // Method to print the frequency of each word
    public void displayWordFrequency() {
        for (LinkedList<MyMapNode> list : myBucketArray) {
            for (MyMapNode node : list) {
                System.out.println(node.getKey() + ": " + node.getValue());
            }
        }
    }
}
