
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Arrays;

// Выводим "привет мир" + дату и время
/**
 * seminar_1
 */
// public class seminar_1 {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) 
//     {
//         System.out.println("Привет");
//         LocalDateTime now = LocalDateTime.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        
        
//         System.out.println(now.format(formatter)); // tiString преврашает все в строку
//     }
    
// }

// ЗАДАНИЕ 1
// Написать прогрмму, которая запросит пользователя ввести "Имя" в консули
// Получит введную строку и выведет в консуль сообщение "Привет, "Имя""

// import java.util.Scanner;

// public class program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.println("Name: ");
// String name = iScanner.nextLine();
// System.out.printf("Hey, %s", name);
// iScanner.close();
// }
// }

// ЗАДАНИЕ 2 
// Дан массив чисел, например [1,1,0,1,1,1], вывести максимальное количесвто подрят идущих 1
// public class program 
// {
//     public static void main(String[] args) 
//     {
//         int[] numbers = new int[] { 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1};
//         System.out.println (Arrays.toString(numbers)); // красиво напечатать через классы

//         for (int number : numbers) // как печатать массивы руками
//             System.out.printf("%d ", number);
//         System.out.println();

//         int counter = 0, max = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == 1)
//                 counter ++;
//             else {
//                 if (counter > max)
//                     max = counter;
//                 counter = 0;
//             }
//         }
//         if (counter > max)
//             max = counter;
//         System.out.println(counter);
//     }
// }

// ЗАДАНИЕ 3

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа равные задонному нужно перевести эти элименты в конец массива.
// Таким образом, первые несколько (или все) элементов массива должно быть отличным от заданного, а остальное - равны ему.