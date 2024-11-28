package tasks;
import java.util.Scanner;
/*
1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите число \"a\": ");
            long a = sc.nextLong();
            System.out.println("Введите число \"b\": ");
            long b = sc.nextLong();
            if(a > b) {
                System.out.println("a > b");
            } else if(a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
            System.out.printf("a + b = %s%n", (double)a + b);   // приведение к double - уменьшить вероятность переполнения
            System.out.printf("a - b = %s%n", (double)a - b);
            System.out.printf("a * b = %s%n", (double)a * b);
            System.out.printf("a / b = %s%n", (double)a / b);   // приведение к double - для точности
                                                                // и избежать возможнго ArifmeticException(деление на 0)
        } catch (java.util.InputMismatchException ime) {
            System.err.printf("Ошибка ввода. Программа работает с числами в диапазоне от %d до %d",
                    Long.MIN_VALUE, Long.MAX_VALUE);
            System.exit(-1);
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка: ");
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }
}
