package Lecture_4;

public class Solution6 {
    public static void main(String[] args) {
        double d = (int) 2.50256e2d;
        System.out.println("d = " + d);
        char c = (byte) 'd';
        System.out.println("c = " + c);
        short s = (int) 2.22;
        System.out.println("s = " + s);
        int i = 150000;
        System.out.println("i = " + i);
        float f = 0.50f;
        System.out.println("f = " + f);
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + i / c);
    }
}
