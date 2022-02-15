package sys.glob;

import java.math.BigDecimal;
import java.util.Arrays;

// https://www.baeldung.com/java-merge-sort

public class SortMergeImpl implements SortMerge {

    @Override
    public void sort(int[] a, int firstAtOne, int lastAtLength) {
        if (firstAtOne < lastAtLength) {
            int lastAtHalfLength = new BigDecimal((firstAtOne + lastAtLength) / 2)
                    .setScale(0, BigDecimal.ROUND_HALF_DOWN)
                    .intValue();
            sort(a, firstAtOne, lastAtHalfLength);
            sort(a, lastAtHalfLength + 1, lastAtLength);
            merge(a, firstAtOne, lastAtHalfLength, lastAtLength);
        }
    }

    @Override
    public void merge(int[] a, int firstAtOne, int lastAtHalfLength, int lastAtLength) {
        int[] a_left = Arrays.copyOfRange(a, firstAtOne-1, lastAtHalfLength);
        int[] a_right = Arrays.copyOfRange(a, lastAtHalfLength, lastAtLength);
        int i = 0, j = 0, k = 0;
        while (i < a_left.length && j < a_right.length) {
            if (a_left[i] <= a_right[j]) {
                a[firstAtOne-1 + k++] = a_left[i++];
            } else {
                a[firstAtOne-1 + k++] = a_right[j++];
            }
        }
        while (i < a_left.length) {
            a[firstAtOne-1 + k++] = a_left[i++];
        }
        while (j < a_right.length) {
            a[firstAtOne-1 + k++] = a_right[j++];
        }
    }

}
