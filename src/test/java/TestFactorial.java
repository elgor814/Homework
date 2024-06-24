

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactorial {

    private BigInteger calculateFactorial(int a) { // метод вычисляет факториал, для сравнения фактического результата с ожидаемым
        BigInteger factorial = BigInteger.ONE;
        if (a < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        for (int i = 2; i <= a; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        int a = 5;
        BigInteger expected = BigInteger.valueOf(120);
        BigInteger result = calculateFactorial(a);
        assertEquals(expected, result);
    }

    @Test
    public void testFactorialOfZero() {

        int a = 0;
        BigInteger expected = BigInteger.ONE;
        BigInteger result = calculateFactorial(a);
        assertEquals(expected, result);
    }


    @Test
    public void testFactorialOfLargeNumber() {
        int a = 25;
        BigInteger expected = new BigInteger("15511210043330985984000000");
        BigInteger result = calculateFactorial(a);
        assertEquals(expected, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        int a = -5;
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculateFactorial(a));
        assertEquals("Факториал отрицательного числа не определен", exception.getMessage());
    }

    @Test
    public void testFactorialOfOne() {
        int a = 1;
        BigInteger expected = BigInteger.ONE;
        BigInteger result = calculateFactorial(a);
        assertEquals(expected, result);
    }



}