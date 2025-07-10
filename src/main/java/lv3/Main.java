package lv3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 인스턴스 화
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // replay 변수 선언
        String replay;

        // 시작
        System.out.println("Hello, Calculator!");

        // 반복
        do {
            // 변수 선언
            int n1;
            int n2;
            Operator operEnum;

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
                char oper = scanner.next().charAt(0);

                // 올바른 기호인지 판단하기위해 여기서 변환
                operEnum = Operator.fromChar(oper);

                // 올바르지않으면 재시작
                if (operEnum == null) {
                    System.out.println("올바른 기호를 입력하세요.");
                } else {
                    break;
                }
            }

            // 결과값
            int result = calculator.calculate(n1, n2, operEnum);

            // 결과값을 가져온 리스트로 표기
            System.out.println("result = " + calculator.getResultList());

            // 결과 값 제거
            calculator.removeResultList();

            // 반복 여부
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료):");
            replay = scanner.next();

        } while (!replay.equals("exit"));
        // 계산기 종료
        System.out.print("계산기 종료");
    }
}