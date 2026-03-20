package com.tripillar_coding_assignment.module10;

import java.util.Locale;

public class NumberOfVowelsConsonant {
    public static void main(String[] args) {
        int vowelCount=0;
        int consonantCount=0;
        String s="Hello Akash";
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelCount++;
            }else if(c>='a'&&c<='z'){
                consonantCount++;
            }
        }
        System.out.println("Number of Vowels are: "+vowelCount);
        System.out.println("Number of Consonant are: "+consonantCount);
    }
}
