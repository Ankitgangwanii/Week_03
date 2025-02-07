package com.tit.inputreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteToCharacter {
    public static void main(String[] args) {
        String filePath = "D:\\Project Final\\Practise\\untitled\\src\\sample.txt\\";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

