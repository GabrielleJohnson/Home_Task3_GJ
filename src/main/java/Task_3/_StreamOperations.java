package Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _StreamOperations {

    public static void main(String[] args) {

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");


        System.out.println("\nFiltered and sorted all names beginning with A > 5 letters");
        List<String> namesBeginWithA = memberNames.stream()
                .filter(a -> a.startsWith("A"))
                .filter(a -> a.length() >= 5)
                .map(String::toLowerCase)
                .sorted().toList();

        System.out.println(namesBeginWithA);

        System.out.println("\nStream match predicate");


        boolean listContainS = memberNames.stream()
                .allMatch(s -> s.contains("S"));

        /*boolean listContainS = memberNames.stream()
                .anyMatch(s -> s.contains("S"));*/

        boolean listContainH = memberNames.stream()
                .noneMatch(s -> s.contains("H"));

        System.out.println("Names containing S " + listContainS);
        System.out.println("Names containing H " + listContainH);


        System.out.println("\nCount the number of names starting with A");

        Long nameCount = memberNames.stream()
                .filter(a -> a.startsWith("A"))
                .count();

        System.out.println(nameCount);


        System.out.println("\nPrinting first name's that starts with the letter L");

        String namesWithL = memberNames.stream()
                .filter(nameL -> nameL.contains("L"))
                .findFirst()
                .orElse(null);
        System.out.println(namesWithL);

    }
}
