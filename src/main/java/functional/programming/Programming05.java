package functional.programming;/* 
@Author : Yogesh Deshmukh
*/

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Programming05 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,4,5,3,12,99,44,3,111,66,77,88);
        List<String> courses = List.of("Spring", "Spring Boot", "Core Java", "Java","MicroServices", "Docker", "Kubernetos","PCF", "AWS", "Azure");

        System.out.println("Getting square of each even number from list : ");
        numbers.stream()
                .filter(num -> num%2 == 0)
                .map(num -> num * num)
                .forEach(System.out :: println);

        System.out.println("Getting square of each even number from list using Predicate and Function : ");

        //A Fuctional interface,
        //Predicate class has test unimplemented method, all things are wrtteen into it
        Predicate< Integer>  isEvenPredicate = num -> num%2 ==0;//filter method logic

        //Represents a predicate(boolean valued function) of one argument
        //isEvenPredicate and isEvenPredicate2 implementation are same.
        Predicate< Integer>  isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num%2 == 0;
            }
        };

        //squareFunction and squareFunction2 are same.
        //Represents a function that accepts one argument and produces a result.(one input and one output)
        Function< Integer, Integer>  squareFunction = val -> val * val; //map method logic
        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer val) {
                return val * val;
            }
        };

        //It takes the input and consumes it to
        //sysoutFunction and sysoutFunction2 are same
        Consumer<Integer> sysoutFunction = System.out::println;  //for Sysout function logic
        Consumer<Integer> sysoutFunction2 = new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysoutFunction);

        System.out.println("Different Approach : ");

        numbers.stream()
                .filter(isEvenPredicate2)
                .map(squareFunction2)
                .forEach(sysoutFunction2);

        System.out.println(" Functional Interface Approach for sum of Integers : ");

        int sum = numbers.stream()
                .reduce(0,Integer :: sum);
        System.out.println("Sum is : "+sum);

        //It is used when u have 2 or more input values will be there and a return type.
        BinaryOperator<Integer> sumLogic2 = Integer::sum;
        BinaryOperator<Integer> sumLogic = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        sum = numbers.stream()
                .reduce(0,sumLogic);
        System.out.println("Sum is : "+sum);

        sum = numbers.stream()
                .reduce(0,sumLogic2);
        System.out.println("Sum is : "+sum);

    }
}
