package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, Calculator!");

        // 숫자 입력
        Scanner scanner = new Scanner(System.in);
        // n1, n2 선언
        int n1;
        int n2;

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

        // oper 선언
        char oper;

        // 사칙연산 기호 전달받기
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
            oper = scanner.next().charAt(0);
            if (oper == '+' ||  oper == '-' || oper == '*' || oper == '/' ) break;
            System.out.println("올바른 기호를 입력하세요.");
        }

        // 결과값 0으로 초기화
        int result = 0;

        // 연산 구분하기
        switch (oper) {
            case '+': result = n1 + n2; break;
            case '-': result = n1 - n2; break;
            case '*': result = n1 * n2; break;
            case '/': if (n2 == 0) {
                System.out.println("나눗셈 연산에서는 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {result = n1 / n2;} break;
        }

        //결과값 입력
        System.out.println("result = " + result);
    }
}
