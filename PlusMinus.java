package com.problemsolving;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int p = 0;
        int neg = 0;
        int z = 0;

        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                neg++;
            } else if(arr[i] > 0){
                p++;
            }else{
                z++;
            }
        }

        System.out.printf("%.6f \n", (float)p/n);
        System.out.printf("%.6f \n", (float)neg/n);
        System.out.printf("%.6f \n", (float)z/n);

    }
}
