public final class CodingBat {
    private CodingBat() { }

    public static final class Logic2 {
        private Logic2() { }

        public static int round10(int num) {
            double tenthOfNum = (double) num / 10;
            return (int) Math.round(tenthOfNum) * 10;
        }

        public static int roundSum(int a, int b, int c) {
            int[] nums = {a, b, c};
            int sum = 0;
            for (int n : nums) {
                sum += round10(n);
            }
            return sum;
        }

        public static int loneSum(int a, int b, int c) {
            if (a == b && b == c) {
                return 0;
            } else if (a == c) {
                return b;
            } else if (b == c) {
                return a;
            } else if (a == b) {
                return c;
            } else {
                return a + b + c;
            }
        }

        public boolean evenlySpaced(int a, int b, int c) {
            int[] nums = bubbleSort(new int[] {a, b, c});
            int smallest = nums[0];
            int largest = nums[nums.length - 1];
            int middle = nums[1];
            double expectedMiddle = (smallest + largest) / 2.0;
            return expectedMiddle == middle;
        }

        public static int[] bubbleSort(int[] nums) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < nums.length - 1; i++) {
                    int currNum = nums[i];
                    int nextNum = nums[i + 1];
                    if (currNum > nextNum) {
                        nums[i] = nextNum;
                        nums[i + 1] = currNum;
                        sorted = false;
                    }
                }
            }
            return nums;
        }
    }

    public final class String2 {
        private String2() { }

        public static String doubleChar(String str) {
            StringBuilder doubledWord = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char currChar = str.charAt(i);
                doubledWord.append(currChar);
                doubledWord.append(currChar);
            }
            return doubledWord.toString();
        }
    }
}