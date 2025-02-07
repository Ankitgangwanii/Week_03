package com.tit.challengeproblem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PerformanceComparison {
    public static void compareStringBuilderAndBuffer() {
        String text = "hello";
        int iterations = 1_000_000;

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime)+ " ns");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");
    }

    public static void compareFileReaderAndInputStreamReader(String filePath) {
        long startTime, endTime;
        int wordCount = 0;

        startTime = System.nanoTime();
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
          e.getStackTrace();
        }
        endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount + ", Time: " + (endTime - startTime)  + " ns");

        wordCount = 0;

        startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount + ", Time: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReaderAndInputStreamReader("D:\\Project Final\\Practise\\untitled\\src\\sample.txt\\");
    }
}
