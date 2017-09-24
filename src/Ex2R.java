import java.util.Scanner;

/**
 * Created by Vitaliy on 23.09.2017.
 */
    public class Ex2R {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum_fib = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println(calculate(number, a, b, sum_fib));
    }



    public static int calculate(int number, int a, int b, int sum_fib) {
        if (sum_fib >= number) {
            return 1;
        }
        sum_fib = a + b;
        a = b;
        b = sum_fib;
        System.out.print(sum_fib + " ");
        return calculate(number, a, b, sum_fib);
    }
}
