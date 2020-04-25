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

    }

    /*private static Integer addListValuesFunctionalApproach(List<Integer> numbers){
        return numbers.stream()
                .reduce(0,(x,y) ->(x+y));
    }*/

    private static Integer addListValuesFunctionalApproach(List<Integer> numbers){
        return numbers.stream()
                .reduce(0,Integer::sum);
    }

    private static Integer addTheListValues(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,Programming03::sum);

    }

    private static int sum(int a, int b){
        return a+b;
    }
//Largest Number in the Array
    private static Integer findlargestNumberInList(List<Integer> numbers){
        return numbers.stream()
                .reduce(Integer.MIN_VALUE,(x,y) ->((x<y)?y:x));
    }

    private static Integer findSmallestNumberInList(List<Integer> numbers){
        return numbers.stream()
                .reduce(Integer.MAX_VALUE,(x,y) ->((x<y)?x:y));
    }

}
