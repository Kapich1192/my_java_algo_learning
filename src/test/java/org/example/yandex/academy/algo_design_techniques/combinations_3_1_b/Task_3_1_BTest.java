package org.example.yandex.academy.algo_design_techniques.combinations_3_1_b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_3_1_BTest {
    @Test
    public void test1() {
        int assertN = 3;
        int assertK = 2;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 3;
        assertEquals(equalRes,assertRes);
    }

    @Test
    public void test2() {
        int assertN = 7;
        int assertK = 5;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 21;
        assertEquals(equalRes,assertRes);
    }

    @Test
    public void test3() {
        int assertN = 1;
        int assertK = 1;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 1;
        assertEquals(equalRes,assertRes);
    }
    @Test
    public void test4() {
        int assertN = 5;
        int assertK = 2;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 10;
        assertEquals(equalRes,assertRes);
    }
    @Test
    public void test5() {
        int assertN = 7;
        int assertK = 7;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 1;
        assertEquals(equalRes,assertRes);
    }
    @Test
    public void test6() {
        int assertN = 6;
        int assertK = 2;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 15;
        assertEquals(equalRes,assertRes);
    }
    @Test
    public void test7() {
        int assertN = 6;
        int assertK = 5;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 6;
        assertEquals(equalRes,assertRes);
    }

    @Test
    public void test8() {
        int assertN = 2;
        int assertK = 2;
        int assertRes = Task_3_1_B.solution(assertN,assertK);
        int equalRes = 1;
        assertEquals(equalRes,assertRes);
    }

}