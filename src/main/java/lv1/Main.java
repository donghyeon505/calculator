package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 숫자 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int n1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int n2 = scanner.nextInt();

        // 숫자 확인 테스트용
//        System.out.println("n1 = " + n1);
//        System.out.println("n2 = " + n2);

        // 사칙연산 기호 전달받기
        System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
        char oper = scanner.next().charAt(0);

        // 사칙연산 기호 확인 테스트용
//        System.out.println("operation = " + oper);

        // 연산 진행
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
