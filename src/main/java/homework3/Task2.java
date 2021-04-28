package homework3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Phonebook.add("Смирнов", "+799912345");
        Phonebook.add("Смирнов", "+7999123451111");
        Phonebook.add("Смирнов", "+799954321");
        Phonebook.add("Сидоров", "+766666666");
        Phonebook.add("Иванов", "+7111111111");

        String s = Phonebook.get(Phonebook.map, "Смирнов");

        System.out.println(s.substring(2));
    }

    public static class Phonebook {
        private static final Map<String, String> map = new HashMap<>();

        public static void add(String lastName, String phoneNumber) {
            if (!map.containsKey(lastName))
                map.put(lastName, "");
            map.put(lastName, map.get(lastName) + "; " + phoneNumber);
        }

        public static String get(Map map, String lastName) {
            return (String) map.get(lastName);
        }
    }
}
