package CodingBat;

public final class Array3 {
    private Array3() { }

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

    public static int[] fix34(int[] nums) {
        int nextFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                while (nextFour < nums.length) {
                    if (nums[nextFour] != 4) {
                        nextFour++;
                    } else {
                        break;
                    }
                }
                nums[nextFour] = nums[i + 1];
                nums[i + 1] = 4;
            }
        }
        return nums;
    }

    public static int[] fix45(int[] nums) {
        int nextFive = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4) {
                while (nextFive < nums.length &&
                        nums[nextFive] != 5 || nums[nextFive - 1] == 4) {
                    nextFive++;
                }
                if (nextFive < nums.length) {
                    nums[nextFive] = nums[i + 1];
                    nums[i + 1] = 5;
                }
            }
        }
        return nums;
    }

    public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }
        int leftSideSum = 0;
        int rightSideSum;
        for (int n : nums) {
            leftSideSum += n;
            rightSideSum = totalSum - leftSideSum;
            if (leftSideSum == rightSideSum) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int outerPointer = 0;
        int innerPointer = 0;
        while (outerPointer < outer.length && innerPointer < inner.length) {
            int outerNum = outer[outerPointer];
            int innerNum = inner[innerPointer];
            if (outerNum <= innerNum) {
                outerPointer++;
                if (outerNum == innerNum) {
                    innerPointer++;
                }
            } else {
                return false;
            }
        }
        return innerPointer == inner.length;
    }

    public static int[] squareUp(int n) {
        int[] result = new int[n*n];
        int currIdx = n*n - 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    result[currIdx] = j;
                }
                currIdx--;
            }
        }
        return result;
    }

    public static int[] seriesUp(int n) {
        int[] series = new int[n*(n + 1)/2];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                series[idx] = j;
                idx++;
            }
        }
        return series;
    }

    public static int maxMirror(int[] nums) {
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int currCount = 0;
            for (int j = nums.length - 1; j >= 0; j--) {
                int k = i;
                while (j >= 0 && k < nums.length && nums[k] == nums[j]) {
                    currCount++;
                    j--;
                    k++;
                }
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }
        return maxCount;
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
