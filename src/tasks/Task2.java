package tasks;

import java.util.Scanner;

/*
2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
В результате сравнения в консоль должно быть выведено одно из сообщений:
  "Строки неидентичны" или "Строки идентичны"
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку \"a\": ");
        String a = sc.nextLine();
        System.out.println("Введите строку \"b\": ");
        String b = sc.nextLine();
        if(a.equals(b)) {
            System.out.println("Строки \"a\" и \"b\" идентичны");
        } else {
            System.out.println("Строки \"a\" и \"b\" не идентичны");
        }
    }
}
