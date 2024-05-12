package com.tech;

public class ImageOperations {
    public static int findMinimumOperations(String image) {
        // Count the number of black pixels (0s) in the image
        int blackPixelsCount = 0;
        for (int i = 0; i < image.length(); i++) {
            if (image.charAt(i) == '0') {
                blackPixelsCount++;
            }
        }
        // Return the count, which represents the minimum number of operations needed to produce its reverse
        return blackPixelsCount;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findMinimumOperations("00110101"));  // Output: 3
        System.out.println(findMinimumOperations("101011"));    // Output: 2
    }
}
