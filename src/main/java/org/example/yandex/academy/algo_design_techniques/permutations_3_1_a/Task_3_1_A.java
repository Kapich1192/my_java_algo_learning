package org.example.yandex.academy.algo_design_techniques.permutations_3_1_a;

import java.util.Scanner;

public class Task_3_1_A {
    static int num;
    static int res;
    public static void main(String[] args) {
        num = input();
        res = solution(num);
        output();
    }
    public static int input() {
        Scanner console = new Scanner(System.in);
        int res = console.nextInt();
        return res;
    }
    public static int solution(int num) {
        int res = 1;
        for(int i = 1; i <= num; i++) res *= i;
      return res;
    }

    public static void output() {
        System.out.print(res);
    }
}
