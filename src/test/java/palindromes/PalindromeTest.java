package palindromes;


import org.example.palindromes.Palindrome;
import org.example.palindromes.operations.PalindromicOperations;
import org.example.palindromes.substring.SubStringingExtractor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PalindromeTest {

    @Test
    void correctlyFindLongestPalindromicString(String input, String expected) {
        final var palindrome = new Palindrome(input, Mockito.mock(PalindromicOperations.class), Mockito.mock(SubStringingExtractor.class));

    }
}
