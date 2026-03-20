package com.tripillar_coding_assignment.module9;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Power of a number"+n+"is :"+findPower(n,3));
    }
    public static int findPower(int n,int power){
        if(power==0){
            return 1;
        }
        return n*findPower(n,power-1);
    }
}
