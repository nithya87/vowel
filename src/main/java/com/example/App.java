
package com.example;

public class App {

    // 1. Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. Check even or odd
    public static String evenOrOdd(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    // 3. Largest of three numbers
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 4. Factorial
    public static long factorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid input");

        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;

        return result;
    }

    // 5. Check prime number
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 6. Generate Fibonacci series
    public static int[] fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException();

        int[] result = new int[n];
        if (n > 0) result[0] = 0;
        if (n > 1) result[1] = 1;

        for (int i = 2; i < n; i++)
            result[i] = result[i - 1] + result[i - 2];

        return result;
    }

    // 7. Reverse a number
    public static int reverseNumber(int n) {
        int sign = n < 0 ? -1 : 1;
        long num = Math.abs((long) n);
        long reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        reversed *= sign;
        if (reversed > Integer.MAX_VALUE ||
            reversed < Integer.MIN_VALUE)
            throw new IllegalArgumentException("Overflow");

        return (int) reversed;
    }

    // 8. Check number palindrome
    public static boolean isNumberPalindrome(int n) {
        return n >= 0 && n == reverseNumber(n);
    }

    // 9. Calculate simple interest
    public static double simpleInterest(
            double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    // 10. Calculate grade from marks
    public static String grade(int marks) {
        if (marks < 0 || marks > 100)
            throw new IllegalArgumentException("Invalid marks");

        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        if (marks >= 50) return "E";
        return "F";
    }

    // 11. Sum of array elements
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    // 12. Maximum element in an array
    public static int arrayMax(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Empty array");

        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }

    // 13. Count vowels in a string
    public static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }

    // 14. Reverse a string
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 15. Check string palindrome
    public static boolean isStringPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "")
                        .toLowerCase();

        return clean.equals(
            new StringBuilder(clean).reverse().toString());
    }

    // Example program entry point
    public static void main(String[] args) {
        System.out.println("Sum = " + add(2, 3));
    }
}
