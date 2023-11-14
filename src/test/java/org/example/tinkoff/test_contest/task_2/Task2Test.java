package org.example.tinkoff.test_contest.task_2;

import org.junit.jupiter.api.Test;

import static org.example.tinkoff.test_contest.task_2.Task2.solution;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void test1() {
        int res = solution(1);
        assertEquals(0,res);
    }
    @Test
    public void test2() {
        int res = solution(2);
        assertEquals(1,res);
    }
    @Test
    public void test3() {
        int res = solution(3);
        assertEquals(2,res);
    }
    @Test
    public void test4() {
        int res = solution(4);
        assertEquals(2,res);
    }
    @Test
    public void test5() {
        int res = solution(5);
        assertEquals(3,res);
    }

    @Test
    public void test6() {
        int res = solution(6);
        assertEquals(3,res);
    }

    @Test
    public void test7() {
        int res = solution(7);
        assertEquals(3,res);
    }

    @Test
    public void test8() {
        int res = solution(8);
        assertEquals(3,res);
    }
}