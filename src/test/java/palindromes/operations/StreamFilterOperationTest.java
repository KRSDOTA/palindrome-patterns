package palindromes.operations;

import org.krsdota.practise.palindromes.operations.StreamFilterOperation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamFilterOperationTest {

    private StreamFilterOperation streamFilterOperation = new StreamFilterOperation();

    @ParameterizedTest
    @MethodSource("providePalindromeInputAndExpectedOutputs")
    void correctlyFindLongestPalindromicString(List<String> inputStrings, List<String> expectedPalindromeStrings) {
        final List<String> actualOutput = streamFilterOperation.filterPalindromicStrings(inputStrings);
        assertEquals(expectedPalindromeStrings, actualOutput);
    }

    private static Stream<Arguments> providePalindromeInputAndExpectedOutputs() {
        return Stream.of(
                Arguments.of(
                        List.of("h", "e", "l", "l", "o", "he", "el", "ll", "lo", "hel", "ell", "llo", "hell", "ello", "hello"),
                        List.of("ll")
                ),
                Arguments.of(
                        List.of("r", "a", "c", "e", "c", "a", "r", "ra", "ac", "ce", "ec", "ca", "ar", "rac", "ace", "cec", "eca", "car", "race", "acec", "ceca", "ecar", "racec", "aceca", "cecar", "raceca", "acecar", "racecar"),
                        List.of("racecar", "aceca", "cec")
                )
        );
    }
}
