package at.aau.serg.exercises.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MyMathTest {

    private MyMath myMath;

    @BeforeEach
    public void setUp() {
        myMath = new MyMath();
    }
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "-1, 1, 0",
            "0, 0, 0"
    })
    public void testAdd(double a, double b, double expected) {
        assertEquals(expected, myMath.add(a, b), 0.0001, "Addition failed for inputs: " + a + ", " + b);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "1, 1, 0",
            "0, 5, -5"
    })
    public void testSub(double a, double b, double expected) {
        assertEquals(expected, myMath.sub(a, b), 0.0001, "Subtraction failed for inputs: " + a + ", " + b);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, 50",
            "1, 0, 0",
            "-1, 2, -2"
    })
    public void testMul(double a, double b, double expected) {
        assertEquals(expected, myMath.mul(a, b), 0.0001, "Multiplication failed for inputs: " + a + ", " + b);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, 2",
            "1, 1, 1",
            "0, 5, 0"
    })
    public void testDiv(double a, double b, double expected) {
        assertEquals(expected, myMath.div(a, b), 0.0001, "Division failed for inputs: " + a + ", " + b);
    }
}
