package homework3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] strArr = {"q", "w", "e", "r", "t", "y", "q", "w", "e", "q", "w", "q", "z"};
        mapEx(strArr);
    }

    private static void mapEx(String[] str) {
        Map<String, Integer> map = new HashMap();

        for (int i = 0; i < str.length; i++) {
            if (!map.containsKey(str[i])) {
                map.put(str[i], 0); // инициализируем key-строки в map со назначим value = 0
                //System.out.println(str[i] + " " + map.get(str[i]));
            }
            map.put(str[i], map.get(str[i]) + 1); // и для key-строк с value = 0 назначим value = 1; далее, если key-строка втретится еще раз, увеличим для нее счетчик
            //System.out.println(str[i] + " " + map.get(str[i]));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}