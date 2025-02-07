package com.tit.linearsearch;

public class SearchSpecificWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Aadarsh is good in Web Development.",
                "Ankit is good in JAVA.",
                "Aditya is not good in AWS."
        };
        String word = "JAVA";

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);
    }
}
