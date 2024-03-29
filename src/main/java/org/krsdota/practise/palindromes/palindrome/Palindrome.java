package org.krsdota.practise.palindromes.palindrome;

import org.krsdota.practise.palindromes.operations.PalindromicOperations;
import org.krsdota.practise.palindromes.substring.SubStringingExtractor;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    private final List<String> subStrings;

    private final List<String> palindromicSubStrings = new ArrayList<>();

    private final PalindromicOperations palindromicOperations;

    public Palindrome(String inputString,
                      PalindromicOperations palindromicOperations,
                      SubStringingExtractor subStringingExtractor) {
        this.palindromicOperations = palindromicOperations;
        subStrings = subStringingExtractor.extractContiguousSubStrings(inputString);
    }

    public String getLongestPalindromicSubString() {
        checkAndInitialisePalindromicSubStrings();
        return palindromicSubStrings.get(0);
    }

    public List<String> getPalindromicStrings() {
        checkAndInitialisePalindromicSubStrings();
        return palindromicSubStrings;
    }

    private void checkAndInitialisePalindromicSubStrings() {
        if(palindromicSubStrings.isEmpty()) {
            palindromicSubStrings.addAll(palindromicOperations.filterPalindromicStrings(subStrings));
        }
    }
}
