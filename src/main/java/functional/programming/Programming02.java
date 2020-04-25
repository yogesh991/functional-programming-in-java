package functional.programming;
/*
@Author : Yogesh Deshmukh
*/

import java.util.List;

public class Programming02 {
    /*    Usages  of map method  and filter method */
    public static void main(String[] args) {
        printCubesOfEvenNumber(List.of(12,4,5,3,2,55,44,3,6,66,77,88));
        printCubesOfTheList(List.of(12,4,5,3,2,55,44,3,6,66,77,88));
        printSquaresOfOddNumber(List.of(12,4,5,3,2,55,44,3,6,66,77,88));
        printSquaresOfTheList(List.of(12,4,5,3,2,55,44,3,6,66,77,88));

        List<String> courses = List.of("Spring", "Spring Boot", "Core Java", "Java","MicroServices", "Docker", "Kubernetos","PCF", "AWS", "Azure");

        //To print the length of eah string wiht the word
        courses.stream()
                .map(value -> value+" : "+value.length())
                .forEach(System.out::println);



    }

    private static void printSquaresOfTheList(List<Integer> list){
        System.out.println("Printing Squares of the list : ");
        list.stream()
                .map(value -> value * value)
                .forEach(System.out :: println);
    }

    private static void printCubesOfTheList(List<Integer> list){
        System.out.println("Printing Cubes of the list : ");
        list.stream()
                .map(value -> value * value * value)
                .forEach(System.out::println);
    }

    private static void printSquaresOfOddNumber(List<Integer> list){
        System.out.println("Printing Squares of Odd numbers in list : ");

        list.stream()
                .filter(value -> value%2 == 1)
                .map(value -> value * value)
                .forEach(System.out::println);
    }

    private static void printCubesOfEvenNumber(List<Integer> list){
        System.out.println("Printing Cubes of even numbers in the list : ");

        list.stream()
                .filter(value -> value%2 == 0)
                .map(value -> value * value * value)
                .forEach(System.out :: println);
    }
}
