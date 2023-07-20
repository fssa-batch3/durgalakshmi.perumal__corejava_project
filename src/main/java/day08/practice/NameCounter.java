package day08.practice;

import java.util.HashMap;
import java.util.Map;

public class NameCounter {
    public static void main(String[] args) {
        String input = "Ram, Ram, Superman, spider, hey, hello, hey, Spider";

        String[] names = input.split(", ");
        Map<String, Integer> nameCounts = new HashMap<>();

        for (String name : names) {
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
