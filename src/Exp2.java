import java.util.Scanner;

/**
 * Created by Vitaliy on 23.09.2017.
 */
public class Exp2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int  number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            if(b <= number){
                System.out.print(sum_fib + " ");
            }else break;
        }
    }
}
