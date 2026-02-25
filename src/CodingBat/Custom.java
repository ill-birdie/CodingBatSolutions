package CodingBat;

public final class Custom {
    private Custom() { }

    /**
     * Write the hasDuplicates method below to return TRUE
     * if the array contains at least one value that is repeated more than once in the array, and FALSE otherwise.
     * <p>
     * hasDuplicates([1, 2, 3, 4, 5, 6]) → false
     * hasDuplicates([1, 2, 3, 2, 5, 6]) → true
     * hasDuplicates([1, 4, 6, 4, 4, 6]) → true
     * @param numList The input array.
     * @return If the array has a duplicate number.
     */
    public static boolean hasDuplicates(int[] numList) {
        for (int i = 0; i < numList.length - 1; i++) {
            for (int j = i + 1; j < numList.length; j++) {
                if (numList[i] == numList[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Write the howManyPrimes method below to return the number of integers in the array that are prime numbers
     * (numbers that have exactly two divisors: 1 and itself).
     * Note that the number 1 is NOT considered prime, and the number 2 is prime.
     * <p>
     * PRECONDITION: all elements in numList >= 1 (Efficiency is not a priority.)
     * <p>
     * howManyPrimes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) → 4
     * howManyPrimes([1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20]) → 0
     * howManyPrimes([2, 3, 5, 7, 11, 13, 17, 19]) → 8
     * @param numList The input array.
     * @return The number of primes (int) inside the input array.
     */
    public static int howManyPrimes(int[] numList) {
        int numPrimes = 0;
        for (int n : numList) {
            boolean nIsPrime = (n != 1);
            for (int i = (int) Math.sqrt(n); i > 1; i--) {
                if (n % i == 0) {
                    nIsPrime = false;
                    break;
                }
            }
            if (nIsPrime) {
                numPrimes++;
            }
        }
        return numPrimes;
    }

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
        int mode = numList[0];
        int modeCount = 1;
        for (int i = 0; i < numList.length; i++) {
            int currNum = numList[i];
            int currCount = 1;
            for (int j = i + 1; j < numList.length; j++) {
                if (numList[j] == currNum) {
                    currCount++;
                }
            }
            if (currCount >= modeCount) {
                if (currCount == modeCount) {
                    mode = Math.min(mode, currNum);
                } else {
                    mode = currNum;
                    modeCount = currCount;
                }
            }
        }
        return mode;
    }
}
