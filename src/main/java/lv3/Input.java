package lv3;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);
    private double n1;
    private double n2;
    private Operator operEnum;

    // 숫자 입력 메서드
    public void getNumber() {
        // 첫 번째 숫자
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            if (scanner.hasNextDouble()) {
                n1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("\n숫자만 입력해주세요.");
                scanner.next(); // 잘못된 입력 소모
            }
        }

        // 두 번째 숫자
        while (true) {
            System.out.print("두 번째 숫자를 입력하세요: ");
            if (scanner.hasNextDouble()) {
                n2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("\n숫자만 입력해주세요.");
                scanner.next();
            }
        }
    }

    // 사칙연산 기호 입력 메서드
    public void getOper() {
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
            char oper = scanner.next().charAt(0);
            operEnum = Operator.fromChar(oper);

            if (operEnum == null) {
                System.out.println("\n올바른 기호를 입력하세요.");
            } else {
                break;
            }
        }
    }

    // 첫 번째 값 반환
    public double getN1() {
        return n1;
    }

    // 두 번째 값 반환
    public double getN2() {
        return n2;
    }

    // 사칙연산 기호 반환
    public Operator getOperEnum() {
        return operEnum;
    }
}
