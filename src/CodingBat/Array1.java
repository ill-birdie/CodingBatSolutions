package CodingBat;

public final class Array1 {
    private Array1() { }

    public final boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public final boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int[] reverse3(int[] nums) {
        int[] reversed = nums.clone();
        reversed[0] = nums[2];
        reversed[2] = nums[0];
        return reversed;
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
}
