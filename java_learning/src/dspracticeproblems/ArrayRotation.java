package dspracticeproblems;

import util.ArrayUtil;

import javax.swing.text.Utilities;

public class ArrayRotation {
    static void leftRotateUsingForLoop(int[] arr, int length, int rotatePosition) {
        for (int i = 0; i < rotatePosition; i++) {
            for (int j = 0; j <= length - 2; j++) {
                ArrayUtil.swap(arr, j, j + 1);
            }
        }
    }

    static void leftRotate(int[] arr, int length, int rotatePosition) {

        if (rotatePosition == 0) {
            return;
        }
        rotatePosition = rotatePosition % length;
        rotate(arr, 0, rotatePosition - 1);
        rotate(arr, rotatePosition, length - 1);
        rotate(arr, 0, length - 1);
    }

    static void rightRotate(int[] arr, int length, int rotatePosition) {

        if (rotatePosition == 0) {
            return;
        }
        rotatePosition = rotatePosition % length;
        rotate(arr, 0, length - 1);
        rotate(arr, 0, rotatePosition - 1);
        rotate(arr, rotatePosition, length - 1);
    }


    static void rightRotateMethod2(int[] arr, int length, int rotatePosition) {
        if (rotatePosition == 0) {
            return;
        }
        rotatePosition %= length;
        rotate(arr, 0, length - rotatePosition - 1);
        rotate(arr, length - rotatePosition, length - 1);
        rotate(arr, 0, length - 1);
    }

    static void rotate(int[] arr, int firstPosition, int lastPosition) {
        while (firstPosition < lastPosition) {
            ArrayUtil.swap(arr, firstPosition, lastPosition);
            firstPosition++;
            lastPosition--;
        }
    }

    static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        rightRotateMethod2(arr, n, d);
        printArray(arr);
    }
}
