package org.example.yandex.academy.algo_design_techniques.combinations_3_1_b;

import java.util.Scanner;

public class Task_3_1_B {
    static int n;
    static int k;
    static int res;

    public static void main(String[] args) {
            input();
            if(n > k)
                res = solution(n, k);
            else if(n == k)
                res = 1;
            else
                res = 0;
            output();
    }
    public static void input() {
        Scanner s = new Scanner(System.in);
        String src = s.nextLine();
        String[] vals = src.split(" ");
        n = Integer.parseInt(vals[0]);
        k = Integer.parseInt(vals[1]);
    }
    public static void output() {
        System.out.print(res);
    }
    public static int solution(int n, int k) {
        // C(n, k) = n! / (k! * (n-k)!);
        int res = 1;
        int part = (factorial(k) * (n - k));
        if (part > 0)
            return factorial(n) / (factorial(k) * factorial(n - k));
        else if(part == 0)
            return 1;
        else
            return 0;

    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <=n; i++) {
            res *= i;
        }
        return res;
    }
}
