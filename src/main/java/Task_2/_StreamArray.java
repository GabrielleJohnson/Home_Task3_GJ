package Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _StreamArray {
    public static void main(String[] args) {

        System.out.println("Elements in an Array");
       List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++)
        {
            list.add(i);
        }

        Integer[] array = list.stream()
                .filter(x -> x % 2 == 0)
                .toList()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));

        System.out.println("\n\nConvert and Filtering list");
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        List<String> alphaList = myList.stream()
                .filter(c -> c.startsWith("c"))
                .map(String::toUpperCase)
                .sorted().toList().reversed();

        System.out.println(alphaList);
    }



}
