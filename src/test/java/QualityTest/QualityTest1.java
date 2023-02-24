package QualityTest;

import java.util.HashMap;
import java.util.Map;

public class QualityTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "alp");
        map.put(101, "eren");
        map.put(102, "serhat");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("map.keySet() = " + map.keySet());
        System.out.println("map.values() = " + map.values());
    }
}
