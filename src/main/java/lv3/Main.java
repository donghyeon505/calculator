package lv3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 인스턴스 화
        Calculator<Double> calculator = new Calculator<>();
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        CalculatorUI calculatorUI = new CalculatorUI(scanner, calculator);

        // replay 변수 선언
        String replay;

        // 시작
        System.out.println("Hello, Calculator!");

        // 반복
        do {
            // 모든 숫자 받기 가능 + 다른 타입(문자) 입력시 다시 입력
            input.getNumber();

            // 사칙연산 기호 입력 및 유효성 검사
            input.getOper();

            // 값 받아오기
            double n1 = input.getN1();
            double n2 = input.getN2();
            Operator operEnum = input.getOperEnum();

            // 결과값
            double result = calculator.calculate(n1, n2, operEnum);
            System.out.println("result: " + result);

            // 기능 실행 반복문
            replay = calculatorUI.display();

        } while (!replay.equals("exit"));

        // 계산기 종료
        System.out.print("계산기 종료");
    }
}