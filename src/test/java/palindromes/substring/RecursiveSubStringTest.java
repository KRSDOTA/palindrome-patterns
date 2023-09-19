package palindromes.substring;

import org.krsdota.practise.palindromes.substring.RecursiveSubStringing;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.containsInAnyOrder;

public class RecursiveSubStringTest {

    private RecursiveSubStringing recursiveSubStringing = new RecursiveSubStringing();

    @ParameterizedTest
    @MethodSource("provideStringInputs")
    void testSubStringing(String input, List<String> expected) {

        final List<String> actual = recursiveSubStringing.extractContiguousSubStrings(input);

        containsInAnyOrder(expected, actual);
    }

    private static Stream<Arguments> provideStringInputs() {
        return Stream.of(
//                Arguments.of("hello", List.of("h", "e", "l", "l", "o", "he", "el", "ll", "lo", "hel", "ell", "llo", "hell", "ello", "hello")),
                Arguments.of("pie", List.of("p", "i", "e", "pi", "ie", "pie"))//,
//                Arguments.of("racecar", List.of("r", "a", "c", "e", "c", "a", "r", "ra", "ac", "ce", "ec", "ca", "ar", "rac", "ace", "cec", "eca", "car", "race", "acec", "ceca", "ecar", "racec", "aceca", "cecar", "raceca", "acecar", "racecar"))
        );
    }

}
