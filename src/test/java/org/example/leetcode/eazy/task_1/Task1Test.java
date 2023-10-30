package org.example.leetcode.eazy.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void example1() {
        int[] assertNums = {2, 7, 11, 15};
        int assertTarget = 9;
        int[] equalsNums = {0, 1};
        int[] assertRes = Task1.twoSum(assertNums, assertTarget);
        assertArrayEquals(assertRes, equalsNums);
    }

    @Test
    public void example2() {
        int[] assertNums = {3, 2, 4};
        int assertTarget = 6;
        int[] equalsNums = {1, 2};
        int[] assertRes = Task1.twoSum(assertNums, assertTarget);
        assertArrayEquals(assertRes, equalsNums);
    }

    @Test
    public void example3() {
        int[] assertNums = {3, 3};
        int assertTarget = 6;
        int[] equalsNums = {0, 1};
        int[] assertRes = Task1.twoSum(assertNums, assertTarget);
        assertArrayEquals(assertRes, equalsNums);
    }

}