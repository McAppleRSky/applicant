package sys.glob;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortMergeTest {

    SortMerge template;

    @BeforeEach
    void prepare() {
        template = new SortMergeImpl();
    }

    @Test
    void sortMainTest() {
        int[] actual = {5, 2, 4, 6, 1, 3, 2, 6};
        int[] expected = {1, 2, 2, 3, 4, 5, 6, 6};
        template.sort(actual, 1, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        template.sort(actual, 1, actual.length);
        assertArrayEquals(expected, actual);
    }

}
