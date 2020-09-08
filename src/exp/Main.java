package exp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculator calculator=new Calculator(a,b);
        System.out.println(calculator.div(a,b));

    }
}
