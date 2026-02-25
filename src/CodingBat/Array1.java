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
        return new int[] {nums[2], nums[1], nums[0]};
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
}
