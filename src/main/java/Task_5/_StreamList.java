package Task_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _StreamList {

    public static void main(String[] args) {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List <String> val = people.values().stream()
                .flatMap(List::stream)
                .filter(v -> v.matches("[a-zA-Z]"))
                .sorted()
                .toList();

        System.out.println("List of letters that only occurs in the Map: " + val);
        System.out.println("nothing");

    }
}
