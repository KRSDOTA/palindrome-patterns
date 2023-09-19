package org.krsdota.practise.palindromes.operations;

import java.util.List;

public interface PalindromicOperations {

    /**
     * Takes a list of strings, returns a filtered list containing only palindromes
     *
     * @param string A List of contiguous strings to test, will extract out any non-palindromes
     * @return Largest palindromic substring extracted
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
