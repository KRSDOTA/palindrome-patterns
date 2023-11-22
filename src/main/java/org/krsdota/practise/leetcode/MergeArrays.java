package org.krsdota.practise.leetcode;

public class MergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        final int upperBound = (n + m) - 1;

        for(int i = 0; i < nums2.length; i++) {
            int nums1Element = nums1[i];
            int nums2Element = nums2[i];

            int offset = 0;
            int index = i + offset;
            while(nums2Element < nums1Element && (index < upperBound)) {
                nums2Element = nums1[index];
                offset++;
            }

            // we've found the position in which num2 Belongs.
            // Now offset the rest of the list
            nums1[index] = nums1Element;
            nums1[upperBound - index] = nums2Element;

        }
    }
}
