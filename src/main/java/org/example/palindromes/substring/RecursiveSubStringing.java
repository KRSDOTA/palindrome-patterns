package org.example.palindromes.substring;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RecursiveSubStringing implements SubStringingExtractor {

    /**
     * Given some input string, recursively breakdown into contiguous substrings
     * @param inputString to be sub-stringed
     * @return List of substrings
     */
    @Override
    public List<String> extractContiguousSubStrings(String inputString) {
        return List.copyOf(Set.copyOf(breakdownString(inputString)));
    }

    /**
     * Easier to read, less efficient
     */
    private List<String> breakdownString(String inputString) {
        final List<String> subStrings = new ArrayList<>();

        for(int i = 1; i <= inputString.length(); i++) {
            final String extractedString = inputString.substring(0, i);
            subStrings.add(extractedString);
            subStrings.addAll(breakdownString(inputString.substring(i)));
        }

        return subStrings;
    }
}
