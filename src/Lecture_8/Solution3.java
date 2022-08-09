package Lecture_8;

public class Solution3 {
    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        if(number instanceof Byte) {
            return (byte) number / 2 + "b";
        } else if(number instanceof Integer) {
            return Integer.toString((int) number / 3);
        } else if(number instanceof Double) {
            return Double.toString((double) number * 30);
        } else {
            return "Я такого типа числа не жду!";
        }
    }
}
