import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Vitaliy on 23.09.2017.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int n = scanner.nextInt();
        int number = 0, summ = 0,  max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введите колличество осадков в " + i + "й день:");
            number = scanner.nextInt();
            if (max < number) {
                max = number;
            }
            summ = summ + number;
        }
        System.out.println("Количество дней: " + n);
        System.out.println("Сумма осадков: " + summ);
        System.out.println("Среднее количество осадков " + summ/n);
        System.out.println("Максимальное количество осадков за период " + max);
    }
}
