package com.problemsolving;


import java.util.Arrays;
import java.util.Scanner;

public class MaxMinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(int i =0; i<5; i++){
            long n = sc.nextLong();
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
