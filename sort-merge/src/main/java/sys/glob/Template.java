package sys.glob;

import org.apache.commons.lang3.NotImplementedException;

import java.math.BigDecimal;

public class Template {

    public void sort(int[] a_array, int p_first, int r_length) {
        if (p_first < r_length) {
            int q_lastOfHalf = new BigDecimal((p_first + r_length) / 2).setScale(0, BigDecimal.ROUND_HALF_DOWN).intValue();
            sort(a_array, p_first, q_lastOfHalf);
            sort(a_array, q_lastOfHalf + 1, r_length);
            merge(a_array, p_first, q_lastOfHalf, r_length);
        }
    }

    public void merge(int[] a_array, int p_first, int q_lastOfHalf, int r_length) {
        throw new NotImplementedException("Merge");
    }

}
