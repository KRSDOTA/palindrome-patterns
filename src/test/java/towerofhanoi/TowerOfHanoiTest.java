package towerofhanoi;

import org.krsdota.practise.towerofhanoi.TowerofHanoi;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TowerOfHanoiTest {

    private TowerofHanoi towerofHanoi;

    @ParameterizedTest
    @MethodSource("expectedOutputMovesGivenDisks")
    void testExpectedMinimumNumberOfMoves(Integer numberOfDisks, Long expectedMinimumNumberOfMoves) {
        towerofHanoi = new TowerofHanoi(numberOfDisks);

        assertEquals(expectedMinimumNumberOfMoves, towerofHanoi.calculateMinimumNumberOfMoves());
    }

    private static Stream<Arguments> expectedOutputMovesGivenDisks() {
        return Stream.of(
                Arguments.of(1, 1L),
                Arguments.of(2, 3L),
                Arguments.of(3, 7L),
                Arguments.of(4, 15L)
        );
    }
}
