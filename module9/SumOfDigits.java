package com.tripillar_coding_assignment.module9;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=25;
        System.out.println("Sum of digits is:"+sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+ sum(n/10);
    }
}
