package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheMaxVowels {

    static List<String> findWordsWithMaxVowelOccurrence(String str) {
        final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Function<String, Integer> myFunction = (st -> (int) st.chars().mapToObj(c -> (char) c).filter(vowels::contains).count());
        Map<Integer, List<String>> res = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(myFunction));
        //List<String> output = res.entrySet().stream().max(Map.Entry.comparingByKey(Comparator.reverseOrder())).get().getValue();

        Function<String, Integer> myFunction2 = (word -> (int) word.chars().mapToObj(c -> (char) c).filter(vowels::contains).count());
        return Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(myFunction2, TreeMap::new, Collectors.toList()))
                .lastEntry().getValue();
        //return output;
    }
}
