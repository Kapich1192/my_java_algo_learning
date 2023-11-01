package org.example.yandex.academy.permutations_3_1_a;

import org.example.yandex.academy.algo_design_techniques.permutations_3_1_a.Task_3_1_A;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_3_1_ATest {

    @Test
    public void test1() {
        int assertNum = 1;
        int assertRes = Task_3_1_A.solution(assertNum);
        int equalsRes = 1;
        assertEquals(assertRes,equalsRes);
    }
    @Test
    public void test2() {
        int assertNum = 2;
        int assertRes = Task_3_1_A.solution(assertNum);
        int equalsRes = 2;
        assertEquals(assertRes,equalsRes);
    }
    @Test
    public void test3() {
        int assertNum = 3;
        int assertRes = Task_3_1_A.solution(assertNum);
        int equalsRes = 6;
        assertEquals(assertRes,equalsRes);
    }

}