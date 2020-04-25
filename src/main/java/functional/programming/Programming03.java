package functional.programming;/* 
@Author : Yogesh Deshmukh
*/

import java.util.List;

public class Programming03 {

    //reduce method example
    public static void main(String[] args) {
        int sum = addTheListValues(List.of(12,4,5,3,2,55,99,3,6,66,77,88));
        System.out.println("Sum is : "+sum);

        System.out.println("Largest Number in the Array is : "+findlargestNumberInList(List.of(12,4,5,3,2,99,44,3,6,66,77,88)));
        System.out.println("Smallest Number in the Array is : "+findSmallestNumberInList(List.of(12,4,5,3,2,99,44,3,6,66,77,88)));
        addTheListValues(List.of(12,4,5,3,2,99,44,3,6,66,77,88));
        sumOfOddNumberInList(List.of(12,4,5,3,2,99,44,3,6,66,77,88));
        sumOfCubesOfListElements(List.of(12,4,5,3,2,99,44,3,6,66,77,88));
        sumOfEvenNumberInList(List.of(12,4,5,3,2,99,44,3,6,66,77,88));
        squareNumbersFromlistAndSum(List.of(12,4,5,3,2,99,44,3,6,66,77,88));


    }

    /*private static Integer addListValuesFunctionalApproach(List<Integer> numbers){
        return numbers.stream()
                .reduce(0,(x,y) ->(x+y));
    }*/

    private static Integer addListValuesFunctionalApproach(List<Integer> numbers){
        System.out.print("Sum of all numbers present in the list : ");
        return numbers.stream()
                .reduce(0,Integer::sum);
    }

    private static Integer addTheListValues(List<Integer> numbers) {
        System.out.print("Sum of all numbers present in the list : ");
        return numbers.stream()
                .reduce(0,Programming03::sum);

    }

    private static int sum(int a, int b){
        return a+b;
    }
//Largest Number in the Array
    private static Integer findlargestNumberInList(List<Integer> numbers){
        System.out.print("Largest number present in the list : ");
        return numbers.stream()
                .reduce(Integer.MIN_VALUE,(x,y) ->((x<y)?y:x));
    }

    private static Integer findSmallestNumberInList(List<Integer> numbers){
        System.out.print("Smallest number present in the list : ");
        return numbers.stream()
                .reduce(Integer.MAX_VALUE,(x,y) ->((x<y)?x:y));
    }

    private static Integer squareNumbersFromlistAndSum(List<Integer> numbers){
        System.out.print("Print Sum of the Squares of all the number present in the list : ");
        return numbers.stream()
                .map(value -> value * value)
                .reduce(0,(x,y) ->x+y);
    }


    private static Integer sumOfCubesOfListElements(List<Integer> numbers){
        System.out.print("Print Sum of the Cubes of all the number present in the list : ");
        return numbers.stream()
                .map(value -> value * value * value )
                        .reduce(0,(x,y) -> x+y);
    }

    private static Integer sumOfOddNumberInList(List<Integer> numbers){
        System.out.print("Print Sum of the Odd number present in the list : ");
        return numbers.stream()
                .filter(x -> x%2 ==1)
                .reduce(0,(x,y) -> x+y);
    }

    private static Integer sumOfEvenNumberInList(List<Integer> numbers){
        System.out.print("Print Sum of Even number present in the list : ");

        return numbers.stream()
                .filter(x -> x%2 ==0)
                .reduce(0,(x,y) -> x+y);

    }






}
