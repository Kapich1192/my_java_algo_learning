package org.example.yandex.academy.algo_design_techniques.combinations_with_repetitions_3_1_c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_3_1_cTest {
    @Test
    public void test1() {
        int assertN = 1;
        int assertK = 1;
        int assertRes = Task_3_1_c.solution(assertN, assertK);
        int equalRes = 1;
        assertEquals(equalRes, assertRes);
    }

    @Test
    public void test2() {
        int assertN = 4;
        int assertK = 3;
        int assertRes = Task_3_1_c.solution(assertN, assertK);
        int equalRes = 20;
        assertEquals(equalRes, assertRes);
    }

    @Test
    public void test3() {
        int assertN = 2;
        int assertK = 2;
        int assertRes = Task_3_1_c.solution(assertN, assertK);
        int equalRes = 3;
        assertEquals(equalRes, assertRes);
    }

}