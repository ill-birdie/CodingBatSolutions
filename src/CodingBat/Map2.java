package CodingBat;

import java.util.Map;
import java.util.HashMap;

public class Map2 {
    private Map2() {
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> lens = new HashMap<>();
        for (String str : strings) {
            lens.put(str, str.length());
        }
        return lens;
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> p = new HashMap<>();
        for (String str : strings) {
            p.put(str.substring(0, 1), str.substring(str.length() - 1));
        }
        return p;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> counted = new HashMap<>();
        for (String str : strings) {
            int newValue = (counted.containsKey(str)) ? counted.get(str) + 1 : 1;
            counted.put(str, newValue);
        }
        return counted;
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> firsts = new HashMap<>();
        for (String str : strings) {
            String k = str.substring(0, 1);
            String newValue = (firsts.containsKey(k)) ? firsts.get(k) + str : str;
            firsts.put(k, newValue);
        }
        return firsts;
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            int newValue = (!count.containsKey(str)) ? 1 : count.get(str) + 1;
            count.put(str, newValue);
            if (newValue % 2 == 0) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> foundTwice = new HashMap<>();
        for (String str : strings) {
            if (!foundTwice.containsKey(str)) {
                foundTwice.put(str, false);
            } else if (!foundTwice.get(str)) {
                foundTwice.put(str, true);
            }
        }
        return foundTwice;
    }

    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> toSwap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char k = strings[i].charAt(0);
            if (toSwap.containsKey(k)) {
                String temp = strings[toSwap.get(k)];
                strings[toSwap.get(k)] = strings[i];
                strings[i] = temp;
                toSwap.remove(k);
            } else {
                toSwap.put(k, i);
            }
        }
        return strings;
    }

    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> toSwap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            char k = str.charAt(0);
            int seenValue = -1;
            if (!toSwap.containsKey(k)) {
                toSwap.put(k, i);
            } else if (toSwap.get(k) != seenValue) {
                strings[i] = strings[toSwap.get(k)];
                strings[toSwap.get(k)] = str;
                toSwap.put(k, seenValue);
            }
        }
        return strings;
    }
}