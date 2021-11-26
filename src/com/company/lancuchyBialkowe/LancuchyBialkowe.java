package com.company.lancuchyBialkowe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class LancuchyBialkowe {

    public static void main(String[] args) throws Exception {
        BufferedReader plikW = new BufferedReader(new FileReader("dane.txt"));
        while (true) {
            String str = plikW.readLine();
            if (str == null) {
                break;
            }
            System.out.println(changePossible(str, plikW.readLine()));
        }
    }


    public static boolean changePossible(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] tab1 = s1.toCharArray();
        char[] tab2 = s2.toCharArray();

        Arrays.sort(tab1);
        Arrays.sort(tab2);
        return Arrays.equals(tab1, tab2);
    }
}
