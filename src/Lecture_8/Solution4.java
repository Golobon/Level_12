package Lecture_8;

public class Solution4 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;

        public Human() {
        }

        public Human(String a, int b, int c, int d, int e, int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        public Human(String a, int b, int c, int d, int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }

        public Human(String a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public Human(String a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Human(String a, int b) {
            this.a = a;
            this.b = b;
        }

        public Human(String a) {
            this.a = a;
        }

        public Human(int b, int c, int d, String a) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public Human(int b, int c, String a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Human(int b, String a) {
            this.a = a;
            this.b = b;
        }
    }
}
