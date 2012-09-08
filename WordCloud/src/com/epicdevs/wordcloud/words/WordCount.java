package com.epicdevs.wordcloud.words;

public class WordCount implements Comparable<WordCount> {
    public String word;
    public int n;
    
    public WordCount(String word, int n) {
        this.word = word;
        this.n = n;
    }

    @Override
    public int compareTo(WordCount another) {
        return another.n - n;
    }
    
    @Override
    public String toString() {
        return word + "(" + n + ")";
    }
}