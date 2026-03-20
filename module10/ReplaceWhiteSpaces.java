package com.tripillar_coding_assignment.module10;

public class ReplaceWhiteSpaces {
    public static void main(String[] args) {
        //InBuilt function
        String s="Hello Akash";
        String result=s.replace(" ","%20");
        System.out.println(result);
        //Manual Method
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        System.out.println("replaced String: "+sb);
    }
}
