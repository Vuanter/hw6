import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

//  Задание 1
//  Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//  Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//  в формате: «Сумма трат за месяц составила … рублей».

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

//  Задание 2
//  Следующая задача — найти минимальную и максимальную трату за день.
//  Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//  в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
        if (max < arr[i])
            max = arr[i];
        if (min > arr[i])
            min = arr[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");


//  Задание 3
//  А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
//  Нужно написать программу, которая посчитает среднее значение трат за месяц
//  (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат
//  в формате: «Средняя сумма трат за месяц составила … рублей».
//  Важно помнить: подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).

        double average = 0;
        for (int i = 0; i < arr.length ; i++) {
            average += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + average / arr.length + " рублей");

        System.out.println();



//  Задание 4
//  В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться
//  в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
//  Данные с именами сотрудников хранятся в виде массива символов (char[]).
//  Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
//  В качестве данных для массива используйте:
//  char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//  В результате в консоль должно быть выведено "Ivanov Ivan".
//  **Важно**: не используйте дополнительные массивы для решения этой задачи.
//  Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.


        for (int i = 0; i <reverseFullName.length ; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        int fullName = reverseFullName.length;
        char temp;

        for (int i = 0; i < fullName / 2; i++) {
            temp = reverseFullName[fullName - i - 1];
            reverseFullName[fullName - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i = 0; i <reverseFullName.length ; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("В последнем задании было сложновато, перебрал кучу вариантов в гугле, надеюсь что на разборе домашек пойму как все произошло, мбо этот метод мне кажется не тот которым нужно было решать :-/");
        return arr;
    }
}



