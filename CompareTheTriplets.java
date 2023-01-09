package com.problemsolving;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//    	int N = scan.nextInt();
        int[] alice = new int[3];
        int[] bob = new int[3];
        int a=0, b=0;
        for(int i=0;i<3;i++)
            alice[i]=scan.nextInt();
        for(int i=0;i<3;i++)
            bob[i]=scan.nextInt();
        for(int i=0;i<3;i++)
            if(alice[i]>bob[i])
                a++;
            else if(alice[i]<bob[i])
                b++;
        System.out.println(a+" "+b);
        scan.close();
    }
}

//for hackerrank platform
//public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
//
//    int alice = 0;
//    int bob = 0;
//
//    ArrayList<Integer> res  = new ArrayList<>();
//    for(int i =0; i<3; i++){
//
//        if(a.get(i) > b.get(i)){
//            alice ++ ;
//        }
//
//        if(a.get(i) < b.get(i)){
//            bob++ ;
//        }
//    }
//
//    res.add(0, alice);
//    res.add(1, bob);
//    return res;
//
//}
//
//}
