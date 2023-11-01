package org.example.leetcode.eazy.task_9;

import org.example.leetcode.eazy.task_1.Task1;
import org.junit.jupiter.api.Test;

import static org.example.leetcode.eazy.task_9.Task9.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    @Test
    public void test1() {
        int assertNum = 121;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = true;
        assertEquals(assertRes, equalsRes);
    }

    @Test
    public void test2() {
        int assertNum = -121;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = false;
        assertEquals(assertRes, equalsRes);
    }

    @Test
    public void test3() {
        int assertNum = 10;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = false;
        assertEquals(assertRes, equalsRes);
    }

    @Test
    public void test4() {
        int assertNum = 11;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = true;
        assertEquals(assertRes, equalsRes);
    }

    @Test
    public void test5() {
        int assertNum = 1;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = true;
        assertEquals(assertRes, equalsRes);
    }

    @Test
    public void test6() {
        int assertNum = 1111;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = true;
        assertEquals(assertRes, equalsRes);
    }

    @Test
    public void test7() {
        int assertNum = 1221;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = true;
        assertEquals(assertRes, equalsRes);
    }

    @Test
    public void test8() {
        int assertNum = 1212;
        boolean assertRes = isPalindrome(assertNum);
        boolean equalsRes = false;
        assertEquals(assertRes, equalsRes);
    }

}