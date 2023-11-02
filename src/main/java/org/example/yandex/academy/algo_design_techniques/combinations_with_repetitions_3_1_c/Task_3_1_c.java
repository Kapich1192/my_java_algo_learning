package org.example.yandex.academy.algo_design_techniques.combinations_with_repetitions_3_1_c;

import java.util.Scanner;

public class Task_3_1_c {
    static int n;
    static int k;
    static int res;
    public static void main(String[] args) {
        input();
        res = solution(n, k);
        output();
    }

    public static void input() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
    }

    public static void output() {
        System.out.print(res);
    }

    public static int solution(int n, int k) {
        int res = 0;
        // C = (k + n − 1)! / (n−1)! * k!
        if (n == 1) {
            return 1;
        }
        res = factorial(k + n - 1) / (factorial(n - 1) * factorial(k));
        return res;
    }

    public static int factorial(int num) {
        int res = 1;
        for(int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
