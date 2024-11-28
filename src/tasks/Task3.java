package tasks;
import java.util.Arrays;
/*
Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
необходимо написать программу, которая выведет в консоль все чётные числа.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(array).filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}