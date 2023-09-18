package palindromes;


import org.example.palindromes.Palindrome;
import org.example.palindromes.operations.LinearPalindrome;
import org.example.palindromes.operations.PalindromicOperations;
import org.example.palindromes.substring.SubStringingExtractor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @ParameterizedTest
    @MethodSource("providePalindromeInputs")
    void correctlyFindLongestPalindromicString(String input, String expected) {
        final var palindrome = new Palindrome(input, Mockito.mock(PalindromicOperations.class), Mockito.mock(SubStringingExtractor.class));

        assertEquals(expected, palindrome.getLongestPalindromicSubString());
    }

    private static Stream<Arguments> providePalindromeInputs() {
        return Stream.of(
                Arguments.of("gggracecarggg", "gggracecarggg"),
                Arguments.of("ff", "ff"),
                Arguments.of("gggff", "ggg"),
                Arguments.of("ffggg", "ggg"),
                Arguments.of("racecar", "racecar"),
                Arguments.of("racecar", "racecar"),
                Arguments.of("madam", "madam"),
                Arguments.of("1fkgmmadamg", "madam")
        );
    }
}
