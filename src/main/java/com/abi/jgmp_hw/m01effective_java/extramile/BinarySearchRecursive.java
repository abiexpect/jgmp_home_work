package com.abi.jgmp_hw.m01effective_java.extramile;

public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, low, mid - 1);
        } else {
            return binarySearchRecursive(arr, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 56;
        int index = binarySearchRecursive(arr, target, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Target found " + index);
        } else {
            System.out.println("Target not found " + index);
        }
    }
}
