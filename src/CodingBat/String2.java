package CodingBat;

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

    public static boolean catDog(String str) {
        int numCat = 0;
        int numDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String window = str.substring(i, i + 3);
            if (window.equals("cat")) {
                numCat++;
            } else if (window.equals("dog")) {
                numDog++;
            }
        }
        return numCat == numDog;
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

    public static boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int targetStartIndex = a.length() - b.length();
        return a.substring(targetStartIndex).equalsIgnoreCase(b);
    }

    public static boolean xyzThere(String str) {
        return str.matches(".*(?<!\\.)xyz.*");
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

    public static String mixString(String a, String b) {
        StringBuilder mixed = new StringBuilder();
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            mixed.append(a.charAt(i));
            mixed.append(b.charAt(i));
        }
        if (a.length() > b.length()) {
            mixed.append(a.substring(b.length()));
        } else if (b.length() > a.length()) {
            mixed.append(b.substring(a.length()));
        }
        return mixed.toString();
    }

    public static String repeatEnd(String str, int n) {
        String lastChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(lastChars);
        }
        return result.toString();
    }

    public static String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String currWindow = str.substring(0, n - i);
            result.append(currWindow);
        }
        return result.toString();
    }

    public static String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        StringBuilder repeated = new StringBuilder();
        for (int i = 1; i < count; i++) {
            repeated.append(word);
            repeated.append(sep);
        }
        repeated.append(word);
        return repeated.toString();
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        String regex = prefix + ".*" + prefix + ".*";
        return str.matches(regex);
    }

    public static boolean xyzMiddle(String str) {
        int xyzStartIndex = str.substring(str.length() / 2).indexOf("xyz");
        if (xyzStartIndex == -1) {
            return false;
        }
        int difference = str.substring(0, xyzStartIndex).length() - str.substring(xyzStartIndex + 3).length();
        return -1 <= difference && difference <= 1;
    }

    public static String getSandwich(String str) {
        String target = "bread";
        int startIdx = str.indexOf(target) + target.length();
        int endIdx = str.lastIndexOf(target);
        if (endIdx == -1 || startIdx - target.length() == endIdx) {
            return "";
        } else {
            return str.substring(startIdx, endIdx);
        }
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

    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        while (str.length() >= 3) {
            String currWindow = str.substring(0, 3);
            String newWord = currWindow.substring(1) + currWindow.charAt(0);
            result.append(newWord);
            str = str.substring(3);
        }
        return result.toString();
    }

    public static String zipZap(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 2; i++) {
            if (sb.substring(i, i + 3).matches("z.p")) {
                sb.delete(i + 1, i + 2);
                i++;
            }
        }
        return sb.toString();
    }

    public static String starOut(String str) {
        StringBuilder starless = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String window = str.substring(
                    Math.max(0, i - 1),
                    Math.min(str.length(), i + 2)
            );
            if (!window.contains("*")) {
                starless.append(str.charAt(i));
            }
        }
        return starless.toString();
    }

}