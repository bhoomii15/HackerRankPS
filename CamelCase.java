package com.problemsolving;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String p = s.toUpperCase();
        int l = s.length();
        int ans = 1;
        for (int i = 0; i < l; i++) {
            if (p.charAt(i) == s.charAt(i)) ans++;
        }

        System.out.println(ans);
    }
}
