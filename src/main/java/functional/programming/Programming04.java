package functional.programming;/* 
@Author : Yogesh Deshmukh
*/

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("Creating New Course Length list in the Array are : ");
        List<Integer> lengths = getNewListOfLength(List.of("Spring", "Spring Boot", "Core Java", "Java","MicroServices", "Docker", "Kubernetos","PCF", "AWS", "Azure"));
        System.out.println(lengths);

        System.out.println("Creating New Course Length list in the Array are : ");
        lengths = getNewListOfEvenNumbers(List.of(12,4,5,3,12,99,44,3,111,66,77,88));
        System.out.println(lengths);

        System.out.println("Creating New Course Length list in the Array are : ");
        lengths= getNewListOfOddNumbers(List.of(12,4,5,3,12,99,44,3,111,66,77,88));
        System.out.println(lengths);
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

    private static List<Integer> getNewListOfLength(List<String> courses){
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> getNewListOfOddNumbers(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .filter(number -> number%2 ==1)
                .collect(Collectors.toList());
    }

    private static List<Integer> getNewListOfEvenNumbers(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .filter(number -> number%2 ==0)
                .collect(Collectors.toList());
    }
}
