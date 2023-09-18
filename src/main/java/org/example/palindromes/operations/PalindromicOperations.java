package org.example.palindromes.operations;

import java.util.List;

public interface PalindromicOperations {

    /**
     * Take a list of Strings, return the palindromes among them
     * @return List of palindromicStrings in desc order keyed on length
     */
    List<String> filterPalindromicStrings(List<String> string);

    /**
     * Test if a given String is a palindrome
     *
     * @param string string to be tested
     * @return isPalindrome or not
     */
    boolean isPalindrome(String string);
}
