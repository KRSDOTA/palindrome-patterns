package palindromes.substring;


import org.example.palindromes.substring.LinearSubStringing;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSubStringingTest {

    private LinearSubStringing linearSubStringing = new LinearSubStringing();

    @ParameterizedTest
    @MethodSource("provideStringInputs")
    void testSubStringing(String input, List<String> expected) {

        final List<String> actual = linearSubStringing.extractSubStrings(input);

        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideStringInputs() {
        return Stream.of(
                Arguments.of("hello", List.of("h", "e", "l", "l", "o", "he", "el", "ll", "lo", "hel", "ell", "llo", "hell", "ello", "hello"))
        );
    }

}
