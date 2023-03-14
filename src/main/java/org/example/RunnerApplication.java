package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.FindSmallestInteger.findSmallestInterger;
import static org.example.FindTheMaxVowels.findWordsWithMaxVowelOccurrence;

public class RunnerApplication {
    public static void main(String[] args) {

        /* 1. To find the smallest integer in the given array */
        int[] arr = {-1, -3, -5, 0, 1};
        int result = 0;//= findSmallestInteger(arr);
        //System.out.println(result);

        /* 2. To find words with max. vowels in the given string */
        String inputString = "The quick brown fox jumps right over the little lazy dog";
        List<String> wordsWithMaxVowelOccurrence = findWordsWithMaxVowelOccurrence(inputString);
        System.out.println(wordsWithMaxVowelOccurrence);

    }


}