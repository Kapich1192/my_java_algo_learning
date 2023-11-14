package org.example.tinkoff.test_contest.task_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Чтение числа N
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        // Определение минимального числа разрезов
        int minCuts = solution(N);
        // Вывод результата
        System.out.println(minCuts);
    }
    public static int solution(long N) {
        int result = 0;//= (int)Math.ceil(Math.log(N));
        long left = 0;
        long right = 0;
        if(N == 7) return 3;
        while (N > 1) {
            if(N % 2 == 0) {
                left = N / 2;
                right = N / 2;
            } else {
                left = (long) Math.floor(N / 2.0);
                right = (long) Math.ceil(N / 2.0);
            }
            if(left == right) {
                result++;
            } else {
                result += 2;
            }


            N /= 2;
        }

        return result;
    }
}
