package com.tit.stringbuilder;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder();//initializing the String Builder
        sb.append(s);//appending the string to String Builder
        sb.reverse(); //Reversing the String


        return sb.toString(); //Returning the string after TypeCasting
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        System.out.println(reverseString(string));
    }
}
