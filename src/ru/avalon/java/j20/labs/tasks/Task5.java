package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.*;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(array));

        System.out.println("\nЗадание 4");
        System.out.print("Коллекция List ");
        printEverything(Arrays.asList(list));
        System.out.print("Коллекция SET  ");
        printEverything(Arrays.asList(set));
          }



    private static void printEverything(Iterable<?> it) //метод для печати коллекций
    {
        for(Object o: it)
            System.out.println(o);
    }



        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }




