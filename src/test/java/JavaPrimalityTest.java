import org.junit.Test;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


class Solution {

    public static boolean isPrime(String number) {

        BigInteger bigInteger = new BigInteger(number);

        return bigInteger.isProbablePrime(1);
    }
}

public class JavaPrimalityTest {

    @Test
    public void shouldBePrime() {
        assertTrue(Solution.isPrime("1"));
        assertTrue(Solution.isPrime("11"));
        assertTrue(Solution.isPrime("1500450271"));
        assertTrue(Solution.isPrime("71755440315342536873"));
        assertTrue(Solution.isPrime("204005728266090048777253207241416669051476369216501266754813821619984472224780876488344279"));
        assertTrue(Solution.isPrime("2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251983"));
    }

    @Test
    public void shouldNotBePrime() {
        assertFalse(Solution.isPrime("4"));
        assertFalse(Solution.isPrime("12"));
        assertFalse(Solution.isPrime("1500450272"));
        assertFalse(Solution.isPrime("71755440315342536872"));
        assertFalse(Solution.isPrime("204005728266090048777253207241416669051476369216501266754813821619984472224780876488344272"));
        assertFalse(Solution.isPrime("2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982"));
    }
}
