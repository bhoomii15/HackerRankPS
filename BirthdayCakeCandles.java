package com.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inputs
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        int max = nums[n-1];
        int count = 0;

        for(int candles : nums){
            if(candles == max){
                count++;
            }
        }
        System.out.println(count);
    }
}
