import java.util.Scanner;

/**
 * Created by User on 18.10.2017.
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое a");
        int a = sc.nextInt();

        System.out.println("Введите целое b");
        int b = sc.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        if (b != 0){
            double f = a/b;
            System.out.println(f);
            }
        else
        System.out.println("Do not divide by zero");
    }

}
