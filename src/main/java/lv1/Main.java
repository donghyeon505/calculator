package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // replay 변수 선언
        String replay;

        System.out.println("Hello, Calculator!");

        do {
            // 변수 선언
            int n1;
            int n2;
            char oper;

            // 0이상의 양의 정수만 받기 + 다른 타입의 입력시 오류 처리
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                if (scanner.hasNextInt()) {
                    n1 = scanner.nextInt();
                    if (n1 >= 0) break;
                    System.out.println("0 이상의 정수를 입력하세요");
                } else {
                    System.out.println("숫자만 입력해주세요.");
                    scanner.next();
                }
            }

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                if (scanner.hasNextInt()) {
                    n2 = scanner.nextInt();
                    if (n2 >= 0) break;
                    System.out.println("0 이상의 정수를 입력하세요");
                } else {
                    System.out.println("숫자만 입력해주세요.");
                    scanner.next();
                }
            }

            // 사칙연산 기호 입력 및 유효성 검사
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
                oper = scanner.next().charAt(0);
                if (oper == '+' || oper == '-' || oper == '*' || oper == '/') break;
                System.out.println("올바른 기호를 입력하세요.");
            }

            // 변수들 초기화
            int result = 0;
            boolean letResult = true;

            // 연산 구분하기
            switch (oper) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("나눗셈 연산에서는 분모(두번째 숫자)에 0이 입력될 수 없습니다.");
                        letResult = false;
                    } else {
                        result = n1 / n2;
                    }
                    break;
            }

            // 결과값 출력
            if (letResult) {
                System.out.println("result = " + result);
            }

            // 반복 여부
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료):");
            replay = scanner.next();

        } while (!replay.equals("exit"));

        // 계산기 종료
        System.out.print("계산기 종료");
    }
}