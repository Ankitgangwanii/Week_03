package com.tit.filereader;

import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String file_Path = "D:\\Project Final\\Practise\\untitled\\src\\sample.txt\\"; //file_Path
        String target_Word = "aditya";

        int wordCount = countWordOccurrences(file_Path, target_Word);
        System.out.println("The word '" + target_Word + "' appears " + wordCount + " times in the file.");
    }

    public static int countWordOccurrences(String file_Path, String target_Word) {
        int count = 0;
        try (FileReader fr = new FileReader(file_Path);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+"); // Split using non-word characters
                for (String word : words) {
                    if (word.equalsIgnoreCase(target_Word)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return count;
    }
}

