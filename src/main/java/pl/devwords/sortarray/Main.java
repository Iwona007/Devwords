package pl.devwords.sortarray;

public class Main {
    public static void main(String[] args) {
        AbsoluteMinSum absoluteMinSum = new AbsoluteMinSum();
        int[] sorted = new int[]{5, 1, 3, 7, 3};
        int sum = absoluteMinSum.calculateAbsoluteSum(sorted);
        System.out.println("Minimalna absolutna suma tablicy to: " + sum);
    }
}
