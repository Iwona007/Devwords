package pl.devwords.Sort;

import java.util.Arrays;

public class AbsoluteMinSum {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 3, 7, 3};
        int[] sorted2 = arraySort(array);
        int sum2 = getAbsoluteSum(sorted2);
    }

    public static int[] arraySort(int[] arr) {
//najpier posortowac naturalnie.
        int[] arrayToSort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort)); //[1,3,3,5,7]
        return arrayToSort;
    }


    private static int getAbsoluteSum(int[] sorted) {
//        int elem0;   //1
//        int elem1; //3
        int absoluteSum = 0;

        for (int i = 0; i < sorted.length - 1; i++) {
            int elem0 = sorted[i];
            int elem1 = sorted[i + 1];
            absoluteSum += Math.abs(elem0 - elem1);
        }
        System.out.print("z metody getAbsoluteSum " + absoluteSum + " ");
        return absoluteSum;
    }
}
