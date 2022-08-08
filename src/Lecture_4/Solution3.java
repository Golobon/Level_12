package Lecture_4;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        byte result = (byte) l;
        return (long) result == l;
    }

    public static boolean isShort(long l) {
        short result = (short) l;
        return (long) result == l;
    }

    public static boolean isInt(long l) {
        int result = (int) l;
        return (long) result == l;
    }
}
