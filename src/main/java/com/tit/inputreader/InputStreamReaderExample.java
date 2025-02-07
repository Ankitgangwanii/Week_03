package com.tit.inputreader;

import java.io.*;

class InputStreamReaderExample {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter writer = new FileWriter("D:\\Project Final\\Practise\\untitled\\src\\sample.txt")) {

            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Input written to output.txt");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

