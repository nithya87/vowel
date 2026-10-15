
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void testEvenOdd() {
        assertEquals("Even", App.evenOrOdd(4));
        assertEquals("Odd", App.evenOrOdd(7));
    }

    @Test
    public void testLargest() {
        assertEquals(9, App.largest(4, 9, 2));
    }

    @Test
    public void testFactorial() {
        assertEquals(120L, App.factorial(5));
        assertEquals(1L, App.factorial(0));
    }

    @Test
    public void testPrime() {
        assertTrue(App.isPrime(7));
        assertFalse(App.isPrime(8));
    }

    @Test
    public void testFibonacci() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3},
            App.fibonacci(5));
    }

    @Test
    public void testReverseNumber() {
        assertEquals(4321, App.reverseNumber(1234));
    }

    @Test
    public void testNumberPalindrome() {
        assertTrue(App.isNumberPalindrome(121));
        assertFalse(App.isNumberPalindrome(123));
    }

    @Test
    public void testSimpleInterest() {
        assertEquals(100.0,
            App.simpleInterest(1000, 10, 1), 0.001);
    }

    @Test
    public void testGrade() {
        assertEquals("A", App.grade(95));
        assertEquals("F", App.grade(35));
    }

    @Test
    public void testArraySum() {
        assertEquals(10,
            App.arraySum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testArrayMax() {
        assertEquals(9,
            App.arrayMax(new int[]{4, 9, 2}));
    }

    @Test
    public void testCountVowelsIsPositive() {
        assertEquals(2, App.countVowels("apple"));
    }

    //@Test
    //public void testCountVowelIsNegative(){
    //    assertEquals(0,App.countVowels("Biden"));
    //}

    @Test
    public void testReverseString() {
        assertEquals("olleh", App.reverseString("hello"));
    }

    @Test
    public void testStringPalindrome() {
        assertTrue(App.isStringPalindrome("Madam"));
        assertFalse(App.isStringPalindrome("Hello"));
    }
}
