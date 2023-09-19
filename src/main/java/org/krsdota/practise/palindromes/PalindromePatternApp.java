package org.krsdota.practise.palindromes;

import org.krsdota.practise.palindromes.hardware.ComputerHardwareSpecifications;
import org.krsdota.practise.palindromes.palindrome.Palindrome;
import org.krsdota.practise.palindromes.palindrome.PalindromeFactory;

import java.util.ArrayList;
import java.util.List;

public class PalindromePatternApp {

    public void runApp() {

        final ComputerHardwareSpecifications spaceship = new ComputerHardwareSpecifications(
                12,
                4,
                1000,
                32,
                3000
        );

        final ComputerHardwareSpecifications driftwood = new ComputerHardwareSpecifications(
                2,
                1,
                100,
                4,
                1600
        );

        final String inputPalindromeString = "racecar";

        final List<Palindrome> palindromes = new ArrayList<>();

        palindromes.add(PalindromeFactory.cratePalindrome(spaceship, inputPalindromeString));
        palindromes.add(PalindromeFactory.cratePalindrome(driftwood, inputPalindromeString));

        palindromes.forEach(palindrome -> {
            System.out.println(String.format("\n\r getLongestSubString: %s  \n\r", palindrome.getLongestPalindromicSubString()));
            System.out.println(String.format("\n\r getPalindromicStrings: %s  \n\r", palindrome.getPalindromicStrings()));
        });
    }
}
