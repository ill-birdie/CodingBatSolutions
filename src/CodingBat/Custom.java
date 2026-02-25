package CodingBat;

public final class Custom {
    private Custom() { }

    /**
     * Write the mode method below to return the number that is the mode of the array,
     * which is the number that appears most frequently.
     * <p>
     * If there is more than one number that appears the most (i.e. there are multiple modes),
     * then return the smallest mode.
     * <p>
     * For example, the array {1, 2, 3, 4, 2} has a mode of 2 and the array {1, 1, 2, 2, 3, 3, 3, 4, 4} has a mode of 3.
     * The array {4, 2, 4, 2, 4, 2, 1} has two modes (4 and 2, since both appear 3 times each),
     * so return 2, the smaller of the two modes.
     * <p>
     * An array where all elements appear once has no mode, so return the smallest element in the array.
     * <p>
     * mode([4, 1, 3, 4, 2]) → 4
     * mode([1, 2, 3, 4, 2, 3, 4, 3]) → 3
     * mode([1, 1, 2, 2, 2, 3, 3, 4, 4]) → 2
     * @param numList The input array.
     * @return The mode of the array.
     */
    public static int mode(int[] numList) {
        int[] checked = new int[numList.length]; // Checking this array might be slower or faster depending on the input
        int mode = numList[0];
        int modeCount = 0;
        for (int i = 0; i < numList.length - modeCount; i++) {
            int currNum = numList[i];
            if (!arrayContains(checked, currNum)) {
                checked[i] = currNum;
                int currCount = hasHowMany(numList, currNum);
                if (currCount >= modeCount) {
                    if (currCount == modeCount) {
                        mode = Math.min(currNum, mode);
                    } else {
                        mode = currNum;
                    }
                    modeCount = currCount;
                }
            }
        }
        return mode;
    }

    public static boolean arrayContains(int[] arr, int target) {
        for (int n : arr) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }

    public static int hasHowMany(int[] arr, int target) {
        int count = 0;
        for (int n : arr) {
            if (n == target) {
                count++;
            }
        }
        return count;
    }
}
