package com.tripillar_coding_assignment.module10;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=8;
        if(((n&(n-1))==0)){
            System.out.println(n+" is a power of 2");
        }else{
            System.out.println(n+" is not a power of 2");
        }
    }
}
