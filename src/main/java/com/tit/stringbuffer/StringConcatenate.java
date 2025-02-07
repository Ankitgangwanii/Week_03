package com.tit.stringbuffer;


public class StringConcatenate {
    public static String concatenateString(String[] s){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String [] strings = {"Ankit","Aadarsh","Aditya"};
        System.out.println(concatenateString(strings));
    }

}
