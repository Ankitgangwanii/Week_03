package com.tit.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static String removeDuplicate(String s){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        System.out.println(removeDuplicate(string));
    }
}
