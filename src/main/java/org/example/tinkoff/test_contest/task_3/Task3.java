package org.example.tinkoff.test_contest.task_3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // количество сотрудников
        int t = scanner.nextInt(); // время, когда один из сотрудников покинет офис
        int[] floors = new int[n]; // номера этажей, на которых находятся сотрудники
        for (int i = 0; i < n; i++) {
            floors[i] = scanner.nextInt();
        }
        int leavingEmployee = scanner.nextInt(); // номер сотрудника, который уйдет через t минут
        int result = solution(n, t, floors, leavingEmployee); // вычисляем минимальное количество лестничных пролетов
        System.out.println(result);
    }

    public static int solution(int n, int t, int[] floors, int leavingEmployee) {
        int result = 0;

        int height = calcInterval(leavingEmployee - 1,floors.length - 1 , floors);
        int low = calcInterval(0, leavingEmployee - 1, floors);

        int heightFull = calcInterval(0, floors.length - 1, floors);

        if (t >= low || t >= height) {
            result = heightFull;
        } else {
            if (height < low) {
                result = heightFull + height;
            } else {
                result = heightFull + low;
            }
        }
        return result;
    }
    public static int calcInterval(int a, int b, int[] floors) {
        int res = 0;
        res = floors[b] - floors[a];
        return res;
    }
}
