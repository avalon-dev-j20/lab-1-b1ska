package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {

        Fibonacci fibo = new Fibonacci(20);
        int sum = 0;
        for (int n : fibo ) {
            sum = sum + n;
        }


        Fibonacci fibo2 = new Fibonacci(20);
        int sum2 = 0;
        for (int n : fibo2 ) {
            sum2 = sum2 + n;
        }

        Fibonacci fibo3 = new Fibonacci(20);
        int sum3 = 0;
        for (int n : fibo2 ) {
            sum3 = sum3 + n;
        }

        System.out.println("\nЗадание 3");
        System.out.println("Последовательности Фибоначчи равна: "+fibo.toString());
        System.out.println("Сумма 20 первых чисел последовательности Фибоначчи равна: "+sum);


        System.out.println("\nЗадание 3");
        System.out.println("Последовательности Фибоначчи равна: "+fibo2.toString());
        System.out.println("Сумма 20 первых чисел последовательности Фибоначчи равна: "+sum2);


        System.out.println("\nЗадание 3");
        System.out.println("Последовательности Фибоначчи равна: "+fibo3.toString());
        System.out.println("Сумма 20 первых чисел последовательности Фибоначчи равна: "+sum3);

        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найти сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
