package functional.programming;/* 
@Author : Yogesh Deshmukh
*/

import java.util.Comparator;
import java.util.List;

public class Programming04 {
    //distinct method and sorted method example
    public static void main(String[] args) {

        System.out.println("Distinct Number in the Array are : ");
        printDistinctElements(List.of(12,4,5,3,12,99,44,3,111,66,77,88));

        System.out.println("Sorted Number in the Array are : ");
        printSortedElements(List.of(12,4,5,3,12,99,44,3,111,66,77,88));

        System.out.println("Sorted Distinct Number in the Array are : ");
        printSortedDistinctElements(List.of(12,4,5,3,12,99,44,3,111,66,77,88));

        System.out.println("Sorted Distinct Number using comparator in the Array are : ");
        printSortedDistinctElementsUsingComparator(List.of(12,4,5,3,12,99,44,3,111,66,77,88));

        System.out.println("Reverse Sorted Number using comparator in the Array are : ");
        printSortedReverseElementsUsingComparator(List.of(12,4,5,3,12,99,44,3,111,66,77,88));

        System.out.println("Custom Sorted Number using comparator in the Array are : ");
        printCustomSortedElementsUsingComparator(List.of("Spring", "Spring Boot", "Core Java", "Java","MicroServices", "Docker", "Kubernetos","PCF", "AWS", "Azure"));


    }

    private static void printCustomSortedElementsUsingComparator(List<String> courses) {
        courses.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .forEach(System.out::println);
    }

    private static void printSortedReverseElementsUsingComparator(List<Integer> numbers) {
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
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

    private static void printSortedDistinctElementsUsingComparator(List<Integer> numbers){
        numbers.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
