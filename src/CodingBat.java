public final class CodingBat {
    private CodingBat() { }

    // LOGIC-2 PROBLEMS
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

    // STRING-2 PROBLEMS
    public static final class String2 {
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

        public static int countCode(String str) {
            int count = 0;
            for (int i = 0; i < str.length() - 3; i++) {
                String currWindow = str.substring(i, i + 4);
                if (currWindow.matches("co.e")) {
                    count++;
                }
            }
            return count;
        }

        public static boolean bobThere(String str) {
            for (int i = 0; i < str.length() - 2; i++) {
                char currChar = str.charAt(i);
                char nextNextChar = str.charAt(i + 2);
                if (currChar == nextNextChar) {
                    return true;
                }
            }
            return false;
        }

        public static String repeatFront(String str, int n) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String currWindow = str.substring(0, n - i);
                result.append(currWindow);
            }
            return result.toString();
        }

        public static String repeatEnd(String str, int n) {
            String lastChars = str.substring(str.length() - n);
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                result.append(lastChars);
            }
            return result.toString();
        }

        public static boolean prefixAgain(String str, int n) {
            String prefix = str.substring(0, n);
            String regex = prefix + ".*" + prefix + ".*";
            return str.matches(regex);
        }

        public static boolean sameStarChar(String str) {
            for (int i = 0; i < str.length(); i++) {
                boolean firstOrLast = (i == 0 || i == str.length() - 1);
                char currChar = str.charAt(i);
                if (currChar == '*' && !firstOrLast) {
                    char prevChar = str.charAt(i - 1);
                    char nextChar = str.charAt(i + 1);
                    if (prevChar != nextChar) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static int countHi(String str) {
            int count = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                String currWindow = str.substring(i, i + 2);
                if (currWindow.equals("hi")) {
                    count++;
                }
            }
            return count;
        }

        public static boolean endOther(String a, String b) {
            if (a.length() < b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            int targetStartIndex = a.length() - b.length();
            return a.substring(targetStartIndex).equalsIgnoreCase(b);
        }

        public static boolean xyBalance(String str) {
            boolean hangingX = false;
            for (int i = 0; i < str.length(); i++) {
                char currChar = str.charAt(i);
                if (currChar == 'x') {
                    hangingX = true;
                } else if (currChar == 'y') {
                    hangingX = false;
                }
            }
            return !hangingX;
        }

        public static boolean xyzMiddle(String str) {
            int xyzStartIndex = str.substring(str.length() / 2).indexOf("xyz");
            if (xyzStartIndex == -1) {
                return false;
            }
            int difference = str.substring(0, xyzStartIndex).length() - str.substring(xyzStartIndex + 3).length();
            return -1 <= difference && difference <= 1;
        }

        public static boolean xyzThere(String str) {
            return str.matches(".*(?<!\\.)xyz.*");
        }
    }
}