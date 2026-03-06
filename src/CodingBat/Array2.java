package CodingBat;

public final class Array2 {
    private Array2() { }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int numsMax = nums[0];
        int numsMin = nums[0];
        for (int n : nums) {
            numsMax = Math.max(numsMax, n);
            numsMin = Math.min(numsMin, n);
        }
        return numsMax - numsMin;
    }

    public static int centeredAverage(int[] nums) {
        int numsMax = nums[0];
        int numsMin = nums[0];
        int sum = 0;
        for (int n : nums) {
            sum += n;
            numsMax = Math.max(numsMax, n);
            numsMin = Math.min(numsMin, n);
        }
        return (sum - numsMax - numsMin) / (nums.length - 2);
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        boolean lastWasThirteen = false;
        for (int n : nums) {
            if (n == 13) {
                lastWasThirteen = true;
            } else if (lastWasThirteen) {
                lastWasThirteen = false;
            } else {
                sum += n;
            }
        }
        return sum;
    }

    public static boolean lucky13(int[] nums) {
        for (int n : nums) {
            if (n == 1 || n == 3) {
                return false;
            }
        }
        return true;
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static boolean no14(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;
        for (int n : nums) {
            if (n == 1) {
                hasOne = true;
            } else if (n == 4) {
                hasFour = true;
            }
        }
        return !hasOne || !hasFour;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int matches = 0;
        for (int i = 0; i < nums1.length; i++) {
            int difference = nums2[i] - nums1[i];
            boolean diffWithinTwo = -2 <= difference && difference <= 2;
            if (nums1[i] != nums2[i] && diffWithinTwo) {
                matches++;
            }
        }
        return matches;
    }

    public static boolean modThree(int[] nums) {
        int streak = 0;
        boolean lastWasEven = true;
        for (int n : nums) {
            if (streak >= 3) {
                return true;
            } else if ( (n % 2 == 0) != lastWasEven ) {
                lastWasEven = !lastWasEven;
                streak = 1;
            } else {
                streak++;
            }
        }
        return streak >= 3;
    }

    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int pointer = nums.length - 1;
        for (int n : nums) {
            if (n != 0) {
                result[pointer] = n;
                pointer--;
            }
        }
        return result;
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int currIdx = 0;
        for (int n : nums) {
            if (n != 10) {
                result[currIdx] = n;
                currIdx++;
            }
        }
        return result;
    }

    public static int[] zeroMax(int[] nums) {
        int largestOdd = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1) {
                largestOdd = Math.max(largestOdd, nums[i]);
            } else if (nums[i] == 0) {
                nums[i] = largestOdd;
            }
        }
        return nums;
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        for (int n : nums) {
            if (n % 2 == 0) {
                result[leftIdx] = n;
                leftIdx++;
            } else {
                result[rightIdx] = n;
                rightIdx--;
            }
        }
        return result;
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            String currResult = "";
            if (i % 3 == 0) {
                currResult += "Fizz";
            }
            if (i % 5 == 0) {
                currResult += "Buzz";
            }
            if (currResult.isEmpty()) {
                currResult = String.valueOf(i);
            }
            result[i - start] = currResult;
        }
        return result;
    }
}
