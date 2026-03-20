package com.tripillar_coding_assignment.module10;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s="Hello Akash";
        String result=reverseEachWord(s);
        System.out.println("Original String :"+s);
        System.out.println("Reversed String :"+result);

    }
    public static String reverseEachWord(String sentence){
        String[] words=sentence.split(" ");
        StringBuilder reversedSentence=new StringBuilder();
        for(String word:words){
            StringBuilder reverseWord=new StringBuilder(word);
            reverseWord.reverse();
            reversedSentence.append(reverseWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
