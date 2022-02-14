package sys.glob;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TemplateTest {

    Template template;

    @BeforeEach
    void prepare() {
        template = new Template();
    }

    @Test
    void sortMainTest() {
        int[] a = {5, 2, 4, 6, 1, 3, 2, 6};
        template.sort(a, 1, a.length);
    }

    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        template.sort(actual, 1, actual.length);
        assertArrayEquals(expected, actual);
    }



//    @Test
//    void merge() {
//    }
}