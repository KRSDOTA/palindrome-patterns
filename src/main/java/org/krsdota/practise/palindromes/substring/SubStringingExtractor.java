package org.krsdota.practise.palindromes.substring;

import java.util.List;

public interface SubStringingExtractor {

    /**
     * Given some input string, extract all contiguous sub-stings
     *
     * @param inputString input string
     * @return constituent sub-strings
     */
    List<String> extractContiguousSubStrings(String inputString);

}
