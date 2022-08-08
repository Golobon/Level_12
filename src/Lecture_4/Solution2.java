package Lecture_4;

public class Solution2 {
    public static void main(String[] args) {
        int big = 1234567890;

        System.out.println(getDifference(big)); // 46 или -46
    }

    public static int getDifference(int big) {
        float approx = big;
        return big - (int) approx;
    }
}
