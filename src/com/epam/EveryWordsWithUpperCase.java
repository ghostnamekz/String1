package com.epam;

public class EveryWordsWithUpperCase {
    public static void main(String[] args) {
        String input = "this is test sentence with lot of words";//line
        String output = "";//All words with uppercase
        String[] words = input.split(" ");
        for(String word:words){
            String first = word.substring(0,1).toUpperCase();
            String all = word.substring(1);
            output+=first+all+" ";
        }
        System.out.println(output + " ");
    }
}