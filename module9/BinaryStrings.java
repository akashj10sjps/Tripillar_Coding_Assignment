package com.tripillar_coding_assignment.module9;

public class BinaryStrings {
    public static void main(String[] args) {
        int n=4;
        System.out.println("Binary String of "+n+" is :");
        generateBinaryString(n,"");
    }
    public static void generateBinaryString(int n,String current){
        if(n==0){
            System.out.print(current+" ");
            return;
        }
        generateBinaryString(n-1,current+"0");
        generateBinaryString(n-1,current+"1");
    }
}
