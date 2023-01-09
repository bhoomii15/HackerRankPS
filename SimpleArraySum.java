package com.problemsolving;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

public class SimpleArraySum {
    static int SumArr(int []arr){
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar = new int[n];

        for(int i = 0; i<ar.length; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println(SumArr(ar));
    }

}
