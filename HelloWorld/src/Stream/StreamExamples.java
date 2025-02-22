package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(1000);
        salaryList.add(2000);
        salaryList.add(3000);
        salaryList.add(4000);
        salaryList.add(5000);


//        int count = 0;
//        for(Integer salary: salaryList){
//            if(salary > 3000){
//                count++;
//            }
//        }
//
//        System.out.println("Employee with Salary > 3000" + count);

        long count = salaryList.stream()
                .filter((Integer salary) -> salary>3000)
                .count();

        System.out.println("Employee with Salary > 3000: " + count);


        Stream<String> nameStream = Stream.of("HALO","WORLD");
        List<String> lowerNames = nameStream.map(String::toLowerCase)
                                    .collect(Collectors.toList());
        System.out.println("Names in Lower Case: " + lowerNames);


        List<List<Integer>> complexData = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(1,2,3),
                Arrays.asList(1,2,3)
        );

        List<Integer> out = complexData.stream()
                .flatMap((List<Integer> list) -> list.stream())
                .collect(Collectors.toList());

        System.out.println("Flatten List: " + out);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> processedList = list.stream()
                .filter((Integer a) -> a>3)
                .peek((Integer a) -> System.out.println(a))
                .map((Integer a) -> a+3)
                .collect(Collectors.toList());

        System.out.println(processedList);


        List<String> numbers = Arrays.asList("2","1","3");
        IntStream numbersStream = numbers.stream()
                .mapToInt((String val) -> Integer.parseInt(val));
        int[] numberArray = numbersStream.toArray();

        List<Integer> lazyExample = Arrays.asList(1,2,3);
        Stream<Integer> lazyStream = lazyExample.stream()
                .filter((Integer val) -> (val >2 ))
                .peek((Integer val) -> System.out.println(val));
//        Here Nothing get printed terminal operations not invoked -> as intermediate operation as "Lazy" in nature.



//        POINT 1:
        List<Integer> listIntegers = Arrays.asList(3,10,1,2,5,9);
        List<Integer> processedIntegers = listIntegers.stream()
                .filter((Integer val) -> val > 3)
                .peek((Integer val) -> System.out.println("After filtering: " + val))
                .map((Integer val) -> val * -1)
                .peek((Integer val) -> System.out.println("After mapping" + val))
                .sorted()
                .peek((Integer val) -> System.out.println("After sorting" + val))
                .collect(Collectors.toList());
        System.out.println(processedIntegers);



        List<Integer> reduceExample = Arrays.asList(1,2,310,20);
        Optional<Integer> answer = reduceExample.stream()
                .reduce((Integer val1, Integer val2) -> val1 + val2);
        System.out.println(answer.get());



        List<Integer> example = Arrays.asList(12,123,23,43,123,3412,12);

//    Sequential Processing
        long seqProcessingStartingTime = System.currentTimeMillis();
        example.stream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.println(val));
        System.out.println("Sequential processing time: " + (System.currentTimeMillis() - seqProcessingStartingTime) + " milliseconds");

//        Parallel Processing
        long parallelProcessingStartingTime = System.currentTimeMillis();
        example.parallelStream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.println(val));
        System.out.println("Parallel processing time: " + (System.currentTimeMillis() - parallelProcessingStartingTime) + " milliseconds");

    }
}
