package Lecture_8;

public class Solution5 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution5.D = 5 * D * C;

        Solution5.D = 5;
    }

    public int getA() {
        return A;
    }

}
