package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {
    private Addition addition;

    @BeforeEach
    void setUp() {
        addition = new Addition();
    }


    @Test
    void testShouldAddTwoPositiveNumber() {
        // given
        int n1 = 10;
        int n2 = 20;

        // when
        int actual = addition.add(n1, n2);

        // then
        assertEquals(30, actual);
    }

    @Test
    void testShouldAddTwoNegativeNumber() {
        assertEquals(-30, addition.add(-10, -20));

    }

}