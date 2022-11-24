// // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.print("Укажите цифру: ");
            int n = iScanner.nextInt();
            int sum = 0;
            int fac = 1;
                    
            for (int i = 1; i < n+1; i++) {
                sum = sum + i;
            }
            System.out.print("Сумма чисел от единицы до введенного числа равна: ");
            System.out.println(sum);

            for (int i = 1; i < n+1; i++) {
                fac = fac * i;
            }

            System.out.printf("Факториал числа %s равен: ", n); 
            System.out.println(fac);
        }
    }

}