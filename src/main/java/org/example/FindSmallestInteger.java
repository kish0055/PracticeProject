package org.example;

import java.util.Arrays;

public class FindSmallestInteger {

    static int findSmallestInterger(int[] input) {
        Arrays.sort(input);
        System.out.println("input:::" + Arrays.toString(input));

        int index = 0;

        // Skip negatives
        while (index < input.length && input[index] < 1)
            index++;

        int expected = 1;
        while (index < input.length) {
            if (input[index] > expected)
                return expected;

            // Skip number and all duplicates
            while (index < input.length && input[index] == expected)
                index++;

            expected++;
        }

        return expected;
    }
}
