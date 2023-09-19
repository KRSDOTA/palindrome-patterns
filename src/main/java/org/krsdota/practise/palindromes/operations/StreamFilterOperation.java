package org.krsdota.practise.palindromes.operations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Use the "Stream" toolkit/lib to perform filtering
 */
public class StreamFilterOperation implements PalindromicOperations {

    @Override
    public List<String> filterPalindromicStrings(List<String> subStrings) {
        final List<String> palindromeSubStrings = new ArrayList<>(subStrings.stream().filter(this::isPalindrome).toList());

        palindromeSubStrings.sort(Comparator.comparingInt(String::length).reversed());

        return palindromeSubStrings;
    }

    public boolean isPalindrome(String inputString) {
        if(inputString.length() == 1) {
            return false;
        }

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
