package CodingBat;

public final class Array1 {
    private Array1() {
    }

    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) return false;
        return nums[0] == nums[nums.length - 1];
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static int[] maxEnd3(int[] nums) {
        int maxValue = Math.max(nums[0], nums[2]);
        nums[0] = maxValue;
        nums[1] = maxValue;
        nums[2] = maxValue;
        return nums;
    }

    public static int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2) || (nums[0] == 3 || nums[1] == 3);
    }

    public static boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3);
    }

    public static int[] makeLast(int[] nums) {
        int[] doubled = new int[nums.length * 2];
        doubled[doubled.length - 1] = nums[nums.length - 1];
        return doubled;
    }

    public static boolean double23(int[] nums) {
        if (nums.length < 2) return false;
        return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
    }

    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3) nums[2] = 0;
        return nums;
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        return (a[0] + a[1] >= b[0] + b[1]) ? a : b;
    }

    public static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static int[] midThree(int[] nums) {
        int middleIdx = nums.length / 2;
        return new int[]{nums[middleIdx - 1], nums[middleIdx], nums[middleIdx + 1]};
    }

    public static int maxTriple(int[] nums) {
        return Math.max(
                Math.max(nums[0], nums[nums.length / 2]),
                nums[nums.length - 1]
        );
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length == 0) return new int[]{};
        if (nums.length == 1) return new int[]{nums[0]};
        return new int[]{nums[0], nums[1]};
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length <= 1) return false;
        return (nums[0] == 1 && nums[1] == 3) ||
                (nums[1] == 1 && nums[2] == 3) ||
                (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
    }

    public static int[] make2(int[] a, int[] b) {
        if (a.length >= 2) return new int[]{a[0], a[1]};
        if (a.length == 1) return new int[]{a[0], b[0]};
        return new int[]{b[0], b[1]};
    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) return new int[]{};
        if (b.length == 0) return new int[]{a[0]};
        if (a.length == 0) return new int[]{b[0]};
        return new int[]{a[0], b[0]};
    }
}
