package org.example.palindromes.substring;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSubStringing implements SubStringingExtractor {

    /**
     * Given some input string, we want to recursively breakdown into contigeous substrings
     * @param inputString to be sub-stringed
     * @return List of substrings
     */
    @Override
    public List<String> extractSubStrings(String inputString) {
        final List<String> subStrings = new ArrayList<>();
        subStrings.add(breakdownString(inputString));
        return subStrings;
    }

    private String breakdownString(String string) {
        if(string.length() == 1){
            return string;
        }
        return breakdownString(string.substring(0, string.length() - 1));
    }

}
