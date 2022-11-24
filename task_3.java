
// 3. Реализовать простой калькулятор

import java.util.Scanner;


public class  task_3 {

    public static void main(String[] args) {

            try (Scanner input_1 = new Scanner(System.in)) {
                System.out.print("Введите первое число: ");
                double numbers_1 = input_1.nextDouble();

                try (Scanner input_2 = new Scanner(System.in)) {
                    System.out.print("Введите второе число: ");
                    double numbers_2 = input_2.nextDouble();
                
                try (Scanner input_3 = new Scanner(System.in)) {
                    System.out.print("Выберите тип операции\n1 - сложить\n2 - вычесть\n3 - умножить\n4 - разделить\n");
                    int numbers_3 = input_3.nextInt();
                    double result = 0;

                    if (numbers_3 == 1) {
                        result = numbers_1 + numbers_2;
                    }
                    if (numbers_3 == 2) {
                        result = numbers_1 - numbers_2;
                    }
                    if (numbers_3 == 3) {
                        result = numbers_1 * numbers_2;
                    }
                    if (numbers_3 == 4) {
                        result = numbers_1 / numbers_2;
                          
                    }
                    else {
                        System.out.println("Выберите от 1 до 4 пункты меню");
                
                    }
                System.out.printf("Факториал числа  равен: %s", result);  
                }
                 
            }
        }
        
    }     
} 
