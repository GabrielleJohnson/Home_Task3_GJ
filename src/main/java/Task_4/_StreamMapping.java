package Task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _StreamMapping {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<Integer> nestedList = Stream.of(list1, list2, list3)
                .flatMap(List::stream)
                .toList();

        System.out.println("3 arrays nested in one: " + nestedList);

        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

       /* String arrayAlpha = Arrays.stream(dataArray)
                .flatMap(Arrays::stream)
                .collect(Collectors.joining(", "));

        System.out.println("Combined 2D String: " + arrayAlpha);*/

        List<String> arrayAlpha = Arrays.stream(dataArray)
                .flatMap(Arrays::stream)
                .toList();

        System.out.println("Combined 2D String: " + arrayAlpha);

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        List <Integer> distinctList = numbersList.stream()
                .distinct()
                .toList();

        System.out.println("Distinct Numbers: "+ distinctList);

        //ArrayList<Integer> numbersLists = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

    }
}
