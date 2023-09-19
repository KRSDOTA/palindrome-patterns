package org.krsdota.practise.palindromes.palindrome;

import org.krsdota.practise.palindromes.hardware.ComputerHardwareSpecifications;
import org.krsdota.practise.palindromes.operations.StreamFilterOperation;
import org.krsdota.practise.palindromes.substring.LinearSubStringing;
import org.krsdota.practise.palindromes.substring.RecursiveSubStringing;

public class PalindromeFactory {

    public static Palindrome cratePalindrome(
            ComputerHardwareSpecifications hardwareSpecifications,
             String inputPalindromeString
    ) {
        switch (hardwareSpecifications.getPowerRating()) {
            case AMAZING, OK -> { return new Palindrome(inputPalindromeString, new StreamFilterOperation(), new RecursiveSubStringing()); }
            case TRASH -> { return new Palindrome(inputPalindromeString, new StreamFilterOperation(), new LinearSubStringing());}
            default -> throw new IllegalArgumentException("Unsupported power value");
        }
    }
}
