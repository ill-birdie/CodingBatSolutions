package CodingBat;

public final class Array1 {
    private Array1() { }

    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) return false;
        return nums[0] == nums[nums.length - 1];
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }

    public static int[] maxEnd3(int[] nums) {
        int maxValue = Math.max(nums[0], nums[2]);
        nums[0] = maxValue;
        nums[1] = maxValue;
        nums[2] = maxValue;
        return nums;
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public static boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public static int[] makeMiddle(int[] nums) {
        int halfwayHigher = nums.length / 2;
        return new int[] {nums[halfwayHigher - 1], nums[halfwayHigher]};
    }

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[] {a[0], a[1], b[0], b[1]};
    }

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static int[] midThree(int[] nums) {
        int middleIdx = nums.length / 2;
        return new int[] {nums[middleIdx - 1], nums[middleIdx], nums[middleIdx + 1]};
    }

    public static int maxTriple(int[] nums) {
        return Math.max(
                nums[nums.length - 1],
                Math.max(nums[0], nums[nums.length / 2])
        );
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[] {nums[0], nums[1]};
        } else if (nums.length == 1) {
            return new int[] {nums[0]};
        } else {
            return new int[] {};
        }
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
            return true;
        } else if (nums[0] == 1 && nums[1] == 3) {
            return true;
        } else if (nums[1] == 1 && nums[2] == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] make2(int[] a, int[] b) {
        if (a.length >= 2) {
            return new int[] {a[0], a[1]};
        } else if (a.length == 1) {
            return new int[] {a[0], b[0]};
        } else {
            return new int[] {b[0], b[1]};
        }
    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[] {};
        } else if (b.length == 0) {
            return new int[] {a[0]};
        } else if (a.length == 0) {
            return new int[] {b[0]};
        }
        return new int[] {a[0], b[0]};
    }
}
