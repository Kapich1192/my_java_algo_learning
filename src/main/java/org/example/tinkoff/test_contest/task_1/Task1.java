package org.example.tinkoff.test_contest.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int totalCost = A;

        if (D > B) {
            int extraData = D - B;
            totalCost += extraData * C;
        }

        System.out.println(totalCost);
    }

}
