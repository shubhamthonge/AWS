package com.tech;

public class Solution {
    static int makePowerNonDecreasing(int[] power) {
        int n = power.length;
        int[] increaseNeeded = new int[n];
        int sum = 0;

        // Calculate the minimum increase needed for each server
        for (int i = 1; i < n; i++) {
            if (power[i] < power[i - 1]) {
                increaseNeeded[i] = power[i - 1] - power[i];
                sum += increaseNeeded[i];
            }
        }

        // Adjust the array to maintain non-decreasing order
        for (int i = n - 2; i >= 0; i--) {
            if (power[i] > power[i + 1]) {
                int diff = power[i] - power[i + 1];
                int decrease = Math.min(diff, increaseNeeded[i + 1]);
                increaseNeeded[i + 1] -= decrease;
                sum -= decrease;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] power = {3, 2, 1};
        System.out.println(makePowerNonDecreasing(power)); // Output: 2
    }
}

