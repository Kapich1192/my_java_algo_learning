package org.example.leetcode.eazy.task_1;

public class Task1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (target == sum(nums[i], nums[j]) && i != j) {
                    res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
