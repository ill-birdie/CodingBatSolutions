package CodingBat;

import java.util.Map;
import java.util.HashMap;

public class Map1 {
    private Map1() { }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if (a != null & b != null) {
            map.put("ab", a + b);
        }
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }


    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        return map;
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if (a != null && b != null && a.equals(b)) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        boolean aExists = map.get("a") != null;
        boolean bExists = map.get("b") != null;
        if (aExists && !bExists) {
            map.put("b", map.get("a"));
        } else if (!aExists && bExists) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if (a != null && b != null) {
            String toInsert = "";
            if (a.length() != b.length()) {
                toInsert = (a.length() > b.length()) ? a : b;
                map.put("c", toInsert);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}