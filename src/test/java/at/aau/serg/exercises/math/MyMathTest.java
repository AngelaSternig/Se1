package at.aau.serg.exercises.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MyMathTest {

    private MyMath myMath;

    @BeforeEach
    public void setUp() {
        myMath = new MyMath();
    }
    @Test
    public void testAdd() {
        assertEquals(3d, myMath.add(1d, 2d), 0.0001, "Addition failed for inputs 1 and 2"); // 0.0001 because: The assertEquals(double, double, double) method is specifically designed for floating-point comparisons, and the third argument (delta) ensures that the comparison accounts for potential precision issues.
    }

    @Test
    public void testSub() {
        assertEquals(5d, myMath.sub(10d, 5d), 0.0001, "Subtraction failed for inputs 10 and 5");
    }

    @Test
    public void testMul() {
        assertEquals(50d, myMath.mul(10d, 5d), 0.0001, "Multiplication failed for inputs 10 and 5");
    }

    @Test
    public void testDiv() {
        assertEquals(2d, myMath.div(10d, 5d), 0.0001, "Division failed for inputs 10 and 5");
    }

    @Test
    public void testDivByZero() {
        assertEquals(Double.NaN, myMath.div(10d, 0d), 0.0001, "Division by zero should return NaN");
    }
}
