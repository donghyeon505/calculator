package lv2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;
        char oper;

        // 0이상의 양의 정수만 받기
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            n1 = scanner.nextInt();
            if (n1 >= 0) break;
            System.out.println("0 이상의 정수를 입력하세요");
        }
        while (true) {
            System.out.print("두 번째 숫자를 입력하세요: ");
            n2 = scanner.nextInt();
            if (n2 >= 0) break;
            System.out.println("0 이상의 정수를 입력하세요");
        }

        // 사칙연산 기호 전달받기
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
            oper = scanner.next().charAt(0);
            if (oper == '+' || oper == '-' || oper == '*' || oper == '/') break;
            System.out.println("올바른 기호를 입력하세요.");
        }

        int result = calculator.calcul(n1, n2, oper);
            System.out.println("result = " + result);

    }
}
