package pl.devwords.sortarray;

import java.util.Arrays;

/**
 * The class stores methods to calculate the sum of the absolute table
 */
public class AbsoluteMinSum {

    /**
     * Sort copy of origin array
     *
     * @param arr - array to sort
     * @return sorted array
     */
    public int[] arraySort(int[] arr) {
        int[] arrayToSort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort)); //[1,3,3,5,7]
        return arrayToSort;
    }

    /**
     * calculate sum of absolute of array according to pattern:
     * |1-3| = 2 |3-3| = 0 |3-5| = 2 |5-7| = 2
     * 2+0+2+2=6
     *
     * @param sorted Array
     * @return sum of absolute of array
     */
    public int getAbsoluteSum(int[] sorted) {
        int absoluteSum = 0;
        for (int i = 0; i < sorted.length - 1; i++) {
            int elem0 = sorted[i]; //1
            int elem1 = sorted[i + 1]; //3
            absoluteSum += Math.abs(elem0 - elem1);
        }

        return absoluteSum;
    }
}
