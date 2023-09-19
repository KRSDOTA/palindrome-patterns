package org.example.palindromes.substring;

import java.util.ArrayList;
import java.util.List;

public class LinearSubStringing implements SubStringingExtractor {

    /**
     * Less easy to read, more efficient
     */
    @Override
    public List<String> extractContiguousSubStrings(String inputString) {
        final List<String> subStrings = new ArrayList<>();

        int windowSize = 1;
        int currentPosition = 0;
        int maxPosition = inputString.length() + 1;

        while(windowSize < maxPosition) {

            while(isEndElementInWindow(currentPosition, windowSize, maxPosition)) {
                final String subString = inputString.substring(currentPosition, currentPosition + windowSize);
                subStrings.add(subString);
                currentPosition++;
            }

            windowSize++;
            currentPosition = 0;
        }

        return subStrings;
    }

    private boolean isEndElementInWindow(int currentPosition, int windowSize, int lengthOfString) {
        return currentPosition + windowSize < lengthOfString;
    }
}
