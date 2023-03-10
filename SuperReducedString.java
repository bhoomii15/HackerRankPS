package com.problemsolving;
import java.util.Scanner;


//https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true
public class SuperReducedString {

    static String super_reduced_string(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean passNeeded = true;

        while (passNeeded) {
            passNeeded = false;
            for (int i = 0; i < str.length() - 1; ++i) {

                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.delete(i, i + 2);
                    passNeeded = true;

                }
            }
        }

        if (str.length() == 0) {
            return "Empty String";
        } else {
            return str.toString();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
