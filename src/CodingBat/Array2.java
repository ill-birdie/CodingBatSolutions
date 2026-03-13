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

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean inSix = false;
        for (int n : nums) {
            if (!inSix) {
                if (n == 6) {
                    inSix = true;
                } else {
                    sum += n;
                }
            } else {
                if (n == 7) {
                    inSix = false;
                }
            }
        }
        return sum;
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean lucky13(int[] nums) {
        for (int n : nums) {
            if (n == 1 || n == 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean sum28(int[] nums) {
        int numTwos = 0;
        for (int n : nums) {
            if (n == 2) {
                numTwos++;
            }
        }
        return numTwos == 4;
    }

    public static boolean more14(int[] nums) {
        int numOnes = 0;
        int numFours = 0;
        for (int n : nums) {
            if (n == 1) {
                numOnes++;
            } else if (n == 4) {
                numFours++;
            }
        }
        return numOnes > numFours;
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static boolean only14(int[] nums) {
        for (int n : nums) {
            if (n != 1 && n != 4) {
                return false;
            }
        }
        return true;
    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
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

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public static boolean either24(int[] nums) {
        boolean fourPair = false;
        boolean twoPair = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                twoPair = true;
            } else if (nums[i] == 4 && nums[i + 1] == 4) {
                fourPair = true;
            }
            if (twoPair && fourPair) {
                return false;
            }
        }
        return twoPair || fourPair;
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

    public static boolean has77(int[] nums) {
        int prevSeven = -3; // Way out of bounds
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7) {
                if (i - prevSeven <= 2) {
                    return true;
                }
                prevSeven = i;
            }
        }
        return false;
    }

    public static boolean has12(int[] nums) {
        boolean hasOne = false;
        for (int n : nums) {
            if (n == 1) {
                hasOne = true;
            } else if (hasOne && n == 2) {
                return true;
            }
        }
        return false;
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

    public static boolean haveThree(int[] nums) {
        int numThrees = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean currIsThree = (nums[i] == 3);
            boolean nextIsThree = (i < nums.length - 1 && nums[i + 1] == 3);
            if (currIsThree) {
                numThrees++;
            }
            if ( numThrees > 3 || (currIsThree && nextIsThree) ) {
                return false;
            }
        }
        return numThrees == 3;
    }

    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                boolean leftIsTwo = i > 0 && nums[i - 1] == 2;
                boolean rightIsTwo = i < nums.length - 1 && nums[i + 1] == 2;
                if (!leftIsTwo && !rightIsTwo) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean tripleUp(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 1 && nums[i] - nums[i-1] == 1) {
                return true;
            }
        }
        return false;
    }

    public static int[] fizzArray3(int start, int end) {
        int range = end - start;
        int[] rangeArr = new int[range];
        for (int i = 0; i < range; i++) {
            rangeArr[i] = start + i;
        }
        return rangeArr;
    }

    public static int[] shiftLeft(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int firstNum = nums[0];
        int[] shifted = new int[nums.length];
        shifted[nums.length - 1] = firstNum;
        System.arraycopy(nums, 1, shifted, 0, nums.length - 1);
        return shifted;
    }

    public static int[] shiftRight(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int lastNum = nums[nums.length - 1];
        int[] shifted = new int[nums.length];
        shifted[0] = lastNum;
        System.arraycopy(nums, 0, shifted, 1, nums.length - 1);
        return shifted;
    }

    public static int[] tenRun(int[] nums) {
        int currMultiple = -1;
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            currMultiple = (currNum % 10 != 0) ? currMultiple : currNum;
            nums[i] = (currMultiple != -1) ? currMultiple : currNum;
        }
        return nums;
    }

    public static int[] pre4(int[] nums) {
        int firstFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                firstFour = i;
                break;
            }
        }
        int[] p4 = new int[firstFour];
        System.arraycopy(nums, 0, p4, 0, firstFour);
        return p4;
    }

    public static int[] post4(int[] nums) {
        int lastFour = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                lastFour = i;
                break;
            }
        }
        int startIdx = lastFour + 1;
        int[] result = new int[nums.length - startIdx];
        System.arraycopy(nums, startIdx, result, 0, nums.length - startIdx);
        return result;
    }

    public static int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            boolean isAlone =
                    (i > 0 && nums[i - 1] != curr) &&
                            (i < nums.length - 1 && nums[i + 1] != curr);
            if (nums[i] == val && isAlone) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public static int[] zeroFront(int[] nums) {
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
