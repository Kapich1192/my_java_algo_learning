package org.example.leetcode.eazy.task_9;

public class Task9 {
    public static boolean isPalindrome2(int x) {
        String buf = x + "";
        String right = "";
        String left = "";
        char[] array;
        String temp = "";
        if (buf.length() == 1) {
            return true;
        } else if (buf.length() % 2 == 0) {
            right = buf.substring(0, buf.length() / 2);
            left = buf.substring(buf.length() / 2, buf.length());
            array = left.toCharArray();
            for (int i = array.length - 1; i >= 0; i--) {
                temp += array[i];
            }

            return temp.equals(right);
        } else {
            right = buf.substring(0, buf.length() / 2);
            left = buf.substring(buf.length() / 2 + 1, buf.length());
            array = left.toCharArray();
            for (int i = array.length - 1; i >= 0; i--) {
                temp += array[i];
            }
            return temp.equals(right);
        }
    }
    public static boolean isPalindrome(int x) {
        int sym = 0;
        int right = 0;
        int left = 0;
        int pivot = 0;
        int temp = x;

        do {
            sym++;
            temp /= 10;
        } while (temp >= 1);
        if (x < 0) {
            return false;
        } else if (sym == 1) {
            return true;
        } else if (sym % 2 == 0) {
            pivot = sym / 2;
            right = x / (int) Math.pow(10, pivot);
            left = x % (int) Math.pow(10, pivot);
            temp = 0;
            while (right >= 1) {
                temp += right % 10;
                right /= 10;
                if (right >= 1) temp *= 10;
            }
            return left == temp;
        } else {
            pivot = (int) Math.floor(sym / 2.0);
            right = x / (int) Math.pow(10, pivot + 1);
            left = x % (int) Math.pow(10, pivot);
            temp = 0;
            while (right >= 1) {
                temp += right % 10;
                right /= 10;
                if (right >= 1) temp *= 10;
            }
            return left == temp;
        }
    }
}

