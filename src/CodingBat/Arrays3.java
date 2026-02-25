package CodingBat;

public final class Arrays3 {
    private Arrays3() { }

    public static int maxSpan(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == currNum) {
                    result = Math.max(result, (j + 1) - i);
                }
            }
        }
        return result;
    }

    public static boolean canBalance(int[] nums) {
        for (int split = 0; split < nums.length; split++) {
            int firstHalfSum = 0;
            for (int i = 0; i < split; i++) {
                firstHalfSum += nums[i];
            }
            int secondHalfSum = 0;
            for (int i = split; i < nums.length; i++) {
                secondHalfSum += nums[i];
            }
            if (firstHalfSum == secondHalfSum) {
                return true;
            }
        }

        return false;
    }

    public static int countClumps(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return count;
    }
}
