package dspracticeproblems;

import util.ArrayUtil;

public class MaximumThreeNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 6, 12, 15, 4, 25};
//        sortNumbersByDesc(numbers);
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
        findMaxNumbers(numbers,numbers.length);
    }

    static void findMaxNumbers(int[]arr,int length){
        var first=0;
        var second=0;
        var third=0;
        first = second = third = arr[0];
        int i=1;
        while (i<length){
            int number = arr[i];
            if(number>first){
                third = second;
                second = first;
                first = number;
            }else if(number>second && second!=first){
                third = second;
                second = number;
            }
            i++;
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);;

    }




    static void sortNumbersByDesc(int[] arr) {
        for (var i = 0; i < arr.length - 1; i++) {
            for (var j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                   ArrayUtil.swap(arr, j, j + 1);
                }
            }
        }
    }



}
