package lv3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 인스턴스 화
        Calculator<Double> calculator = new Calculator<>();
        Scanner scanner = new Scanner(System.in);

        // replay 변수 선언
        String replay;

        // 시작
        System.out.println("Hello, Calculator!");

        // 반복
        do {
            // 변수 선언
            double n1;
            double n2;
            Operator operEnum;

            // 모든 숫자 받기 가능 + 다른 타입(문자) 입력시 다시 입력
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                if (scanner.hasNextDouble()) {
                    n1 = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("숫자만 입력해주세요.");
                    scanner.next();
                }
            }

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                if (scanner.hasNextDouble()) {
                    n2 = scanner.nextDouble();
                    break;
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
            double result = calculator.calculate(n1, n2, operEnum);
            System.out.println("result: " + result);

            // 반복 여부
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료):");
            replay = scanner.next();

        } while (!replay.equals("exit"));

        // 결과 값 조회하기
        System.out.print("값 조회하기(입력한 수보다 큰 수): ");
        double n3 = scanner.nextDouble();
        System.out.println("조회된 값 = " + calculator.resultSearch(n3));

        // 계산기 종료
        System.out.print("계산기 종료");
    }
}