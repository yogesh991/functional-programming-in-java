package functional.programming;/* 
@Author : Yogesh Deshmukh
*/


import java.util.List;

public class Programming01 {
    /*    Usages  of foreach loop and filter method */


    public static void main(String[] args) {
        printOddNumbersInList(List.of(12,4,5,3,2,55,44,3,6,66,77,88));
        printAllNumbersInListFuntionalProgrammingWay(List.of(12,4,5,3,2,55,44,3,6,66,77,88));
        printEvenNumbersInList(List.of(12,4,5,3,2,55,44,3,6,66,77,88));

        List<String> courses = List.of("Spring", "Spring Boot", "Core Java", "Java","MicroServices", "Docker", "Kubernetos","PCF", "AWS", "Azure");

        System.out.println("Courses Exercise : ");

        //printing all courses
        System.out.println("Prinitng All Courses:  ");
        courses.stream()
                .forEach(System.out::println);

        //printing courses name which contains Spring word in it
        System.out.println("Prinitng courses name which contains Spring word in it : ");
        courses.stream()
                .filter((course)->course.contains("Spring"))
                .forEach(System.out :: println);

        //prining course whose length is more than 5
        System.out.println("prining course whose length is more than 5 : ");
        courses.stream()
                .filter((course)-> course.length()>=5)
                .forEach(System.out::println);

    }

    private static void print(int temp){
        System.out.println(temp);
    }

    //code to print all numbers
    private static void printAllNumbersInListFuntionalProgrammingWay(List<Integer> numbers) {
        //list of number to convert in stream of numbers

        System.out.println("Printing All numbers from lIst ");
        numbers.stream()
                .forEach(Programming01 :: print);
                       //Class-name :: method which needs to be called

        numbers.stream()
                .forEach(System.out :: println);

    }
    private static boolean isEven(int temp){
        return temp%2==0;
    }

//Code for printing even number
    private static void printEvenNumbersInList(List<Integer> numbers){
        System.out.println("Printing Even  numbers from lIst ");
        numbers.stream()
                .filter(Programming01::isEven)
                .forEach(System.out::println);

        System.out.println("Printing Even numbers from lIst 2 ");

        numbers.stream()
                .filter((number)->(number%2 == 0))
                .forEach(System.out::println);
    }

    private static void printOddNumbersInList(List<Integer> numbers){
        System.out.println("Printing Odd numbers from lIst ");
        numbers.stream()
                .filter((number)-> (number%2 == 1))
                .forEach(System.out::println);
    }


}
