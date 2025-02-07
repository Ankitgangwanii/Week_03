package com.tit.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class LinePrint {
    public static void main(String[] args) {
        String filepath = "D:\\Project Final\\Practise\\untitled\\src\\sample.txt\\";
        try(BufferedReader bf = new BufferedReader(new FileReader(filepath))){
            String line;
                while((line = bf.readLine()) !=null){
                    System.out.println(line);
                }
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
