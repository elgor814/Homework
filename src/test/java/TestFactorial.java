import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class TestFactorial {
    @Test(priority = 2)
    public void testFactorialForZero() {
        int a = 0;
        BigInteger expectedFactorial = BigInteger.ONE;

        BigInteger factorial = calculateFactorial(a);

        Assert.assertEquals(factorial, expectedFactorial);
    }

    @Test(priority = 1)
    public void testFactorialForPositiveNumber() {
        int a = 5;
        BigInteger expectedFactorial = BigInteger.valueOf(120);

        BigInteger factorial = calculateFactorial(a);

        Assert.assertEquals(factorial, expectedFactorial);
    }

    @Test(priority = 3)
    public void testFactorialForLargeNumber() {
        int a = 100;
        BigInteger expectedFactorial = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");

        BigInteger factorial = calculateFactorial(a);

        Assert.assertEquals(factorial, expectedFactorial);
    }

    public static BigInteger calculateFactorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}


