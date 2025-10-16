package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

      /*  String Text = "ababbababa";
        String Pattern1 = "abab";
        String Pattern2 = "aba";
        String Pattern3 = "aab";

        System.out.println(kmp(Text,Pattern1));
        System.out.println(kmp(Text,Pattern2));
        System.out.println(kmp(Text,Pattern3));

        System.out.println();

        System.out.println("Pattern 1");
        System.out.println(Arrays.toString(kmpWithPositions(Text, Pattern1)));
        System.out.println();
        System.out.println("Pattern 2");
        System.out.println(Arrays.toString(kmpWithPositions(Text, Pattern2)));
        System.out.println();
        System.out.println("Pattern 3");
        System.out.println(Arrays.toString(kmpWithPositions(Text, Pattern3)));

    }

    public static boolean kmp(String text, String pattern){

            int i = 0;
            int j = 0;

            while (text.length() > i) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    if (j == pattern.length() - 1) {
                        return true;
                    } else {
                        i++;
                        j++;
                    }
                } else {
                    i++;
                    j = 0;
                }
            }
            return false;
    }

    public static int[] kmpWithPositions(String text, String pattern){

        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[10];

        while (text.length() > i) {
            if (text.charAt(i) == pattern.charAt(j)) {
                if (j == pattern.length() - 1) {
                    result[k] = (i - j);
                    k++;
                    i++;
                    j = 0;
                } else {
                    i++;
                    j++;
                }
            } else {
                i++;
                j = 0;
            }
        }
        return result;
    }

    }
*/

    }
}