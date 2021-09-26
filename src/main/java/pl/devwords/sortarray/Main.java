package pl.devwords.sortarray;

public class Main {
    public static void main(String[] args) {
        AbsoluteMinSum absoluteMinSum = new AbsoluteMinSum();
        int[] array = new int[]{5, 1, 3, 7, 3};
        int[] sorted2 = absoluteMinSum.arraySort(array);
        int sum = absoluteMinSum.getAbsoluteSum(sorted2);
        System.out.println("Minimalna absolutna suma tablicy to: " + sum);
    }
}
