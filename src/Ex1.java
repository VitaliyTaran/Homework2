import java.util.Scanner;

/**
 * Created by Vitaliy on 23.09.2017.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Сумма цифр числа равна: " + calculate(number, 0));


    }
    public static int calculate (int number, int summ){
        if(number == 0) {
            return summ;
        }
        int a = number %10;
        number = number/10;
        summ = a + summ;
        return calculate(number, summ);
    }
}
