import org.junit.Test;

import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;




public class BigIntegerTest {

    static class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();

        }

        public static String sum(String a, String b) {
            BigInteger ba = new BigInteger(a);
            BigInteger bb = new BigInteger(b);

            return ba.add(bb).toString();
        }

        public static String multiply(String a, String b) {
            BigInteger ba = new BigInteger(a);
            BigInteger bb = new BigInteger(b);

            return ba.multiply(bb).toString();
        }
    }

    @Test
    public void testSumOfBigIntegers1() {
        String a = "1234";
        String b = "20";
        assertEquals("1254", Solution.sum(a, b));
    }

    @Test
    public void testSumOfBigIntegers2() {
        String a = "1234000000";
        String b = "2000000000";
        assertEquals("3234000000", Solution.sum(a, b));
    }

    @Test
    public void testMultiplicationOfBigIntegers() {
        String a = "1234";
        String b = "20";
        assertEquals("24680", Solution.multiply(a, b));
    }

    @Test
    public void testMultiplicationOfBigIntegers2() {
        String a = "1234000000";
        String b = "100";
        assertEquals("123400000000", Solution.multiply(a, b));
    }
}
