package com.tripillar_coding_assignment.module10;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String s="Hello Akash is Programming";
        String[] words=s.split(" ");
        String longest="";
        for(String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        System.out.println("Longest word is:"+longest);
    }
}
