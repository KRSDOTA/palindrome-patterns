package org.example.palindromes.operations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinearPalindrome implements PalindromicOperations {

    /**
     * Takes a list of strings, returns a filtered list containing only palindromes
     *
     * @param subStrings A List of strings to test, will extract out any non-palindromes
     * @return Largest palindromic substring extracted
     */
    @Override
    public List<String> filterPalindromicStrings(List<String> subStrings) {
        final List<String> palindromeSubStrings = new ArrayList<>(subStrings.stream().filter(this::isPalindrome).toList());

        palindromeSubStrings.sort(Comparator.comparingInt(String::length).reversed());

        return palindromeSubStrings;
    }

    public boolean isPalindrome(String inputString) {
        boolean isPalindrome = true;

        int startPosition = 0;
        int endPosition = inputString.length();

        while(endPosition > startPosition) {
            String characterUnderFirstCounter = inputString.substring(startPosition, startPosition + 1);
            String characterUnderSecondCounter = inputString.substring(endPosition - 1, endPosition);

            if(!characterUnderFirstCounter.equals(characterUnderSecondCounter)){
               isPalindrome = false;
               break;
            }
            endPosition--;
            startPosition++;
        }

        return isPalindrome;
    }
}
