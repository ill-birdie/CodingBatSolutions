package CodingBat;

public final class Logic2 {
    private Logic2() { }

    public static boolean makeBricks(int small, int big, int goal) {
        return (goal <= small + big*5) && (goal % 5 <= small);
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a == c) return b;
        if (b == c) return a;
        if (a == b) return c;
        return a + b + c;
    }

    public static int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return a + b + c;
    }

    public static int fixTeen(int n) {
        return ( (13 <= n && n <= 19) && (n != 15 && n != 16) ) ? 0 : n;
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int round10(int num) {
        return (int) Math.round((double) num / 10) * 10;
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static boolean closeFar(int a, int b, int c) {
        // If b/c is close, return whether c/b is far
        if (Math.abs(b - a) <= 1) return (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2);
        if (Math.abs(c - a) <= 1) return (Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2);
        return false;
    }

    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        return Math.max(a, b);
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int largest = Math.max(Math.max(a, b), c);
        int smallest = Math.min(Math.min(a, b), c);
        double expectedMedium = (largest + smallest) / 2.0;
        return a == expectedMedium || b == expectedMedium || c == expectedMedium;
    }

    public static int makeChocolate(int small, int big, int goal) {
        return ( (goal <= small + big*5) && (goal % 5 <= small) ) ?
                goal - Math.min(big*5, goal - goal%5) : -1;
    }
}