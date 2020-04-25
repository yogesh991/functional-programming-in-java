package functional.programming;/* 
@Author : Yogesh Deshmukh
*/

import java.util.List;

public class Programming04 {
    //distinct method and sorted method example
    public static void main(String[] args) {

        System.out.println("Distinct Number in the Array are : ");
        printDistinctElements(List.of(12,4,5,3,12,99,44,3,66,66,77,88));

        System.out.println("Sorted Number in the Array are : ");
        printSortedElements(List.of(12,4,5,3,12,99,44,3,66,66,77,88));

        System.out.println("Sorted Distinct Number in the Array are : ");
        printSortedDistinctElements(List.of(12,4,5,3,12,99,44,3,66,66,77,88));
        
    }

    private static void printDistinctElements(List<Integer> numbers){
        numbers.stream()
                .distinct()
                .forEach(System.out :: println);
    }

    private static void printSortedElements(List<Integer> numbers){
        numbers.stream()
                .sorted()
                .forEach(System.out :: println);
    }

    private static void printSortedDistinctElements(List<Integer> numbers){
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
