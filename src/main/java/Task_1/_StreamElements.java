package Task_1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Stream.generate;


public class _StreamElements {
    public static void main(String[] args) {

        System.out.println("Numbers");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::println);

       /* Stream.generate(() -> (int)(Math.random()* 100))
                .limit(20)
                .forEach(System.out::println);*/

        /*Random random = new Random();
        Stream.generate(() -> random.nextInt(100)) // 0 to 99
                .limit(20)
                .forEach(System.out::println);*/

        System.out.println("\n\nRandom Numbers");
        List<Integer> randNum = Stream.generate(() -> (int) (Math.random() * 100))
                .limit(20)
                .toList();
        randNum.forEach(System.out::println);

        System.out.println("\n\nEven numbers");
        List<Integer> evenNum = randNum.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        evenNum.forEach(System.out::println);

    }


}
