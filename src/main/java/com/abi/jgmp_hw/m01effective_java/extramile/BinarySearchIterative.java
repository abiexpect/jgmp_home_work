package com.abi.jgmp_hw.m01effective_java.extramile;

public class BinarySearchIterative {

    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 56;
        int index = binarySearchIterative(arr, target);
        if (index != -1) {
            System.out.println("Target found " + index);
        } else {
            System.out.println("Target not found " + index);
        }
    }
}
