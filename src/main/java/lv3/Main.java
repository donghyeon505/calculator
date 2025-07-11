package lv3;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 인스턴스 화
        Calculator<Double> calculator = new Calculator<>();
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();

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

            // 변수 선언
            double n3;
            List<Double> viewList = calculator.getResultList();
            String view;
            String delete;

            // 기능 묻기
            System.out.println("1. 결과값 조회하기");
            System.out.println("2. 결과값 초기화하기");
            System.out.println("3. 계속 계산하기");
            System.out.println("종료 하려면 exit 을 입력");

            // 기능 실행 반복문
            label:
            while (true) {
                System.out.print("원하시는 기능을 번호를 입력해주세요: ");
                replay = scanner.next();

                switch (replay) {
                    // 조회
                    case "1":
                        System.out.println("조회기능 목록");
                        System.out.println("1. 입력값보다 낮은 수");
                        System.out.println("2. 입력값보다 높은 수");
                        System.out.println("3. 전체 조회");
                        System.out.println("4. 취소");
                        viewlabel:
                        while (true) {
                            System.out.print("원하시는 기능의 번호를 입력해주세요: ");
                            view = scanner.next();
                            switch (view) {
                                case "1":
                                    System.out.print("해당 값을 입력해주세요: ");
                                    n3 = scanner.nextDouble();
                                    System.out.println("result = " + calculator.resultSearch2(n3));
                                    break viewlabel;
                                case "2":
                                    System.out.print("해당 값을 입력해주세요: ");
                                    n3 = scanner.nextDouble();
                                    System.out.println("result = " + calculator.resultSearch(n3));
                                    break viewlabel;
                                case "3":
                                    System.out.println("result = " + viewList);
                                    break viewlabel;
                                case "4":
                                    System.out.println("취소했습니다");
                                    break viewlabel;
                                default:
                                    System.out.println("잘못된 입력입니다.");
                                    break;
                            }
                        }
                        break;
                    // 삭제
                    case "2":
                        System.out.println("삭제기능 목록");
                        System.out.println("1. 모두 지우기");
                        System.out.println("2. 이전값 지우기");
                        System.out.println("3. 최근값 지우기");
                        System.out.println("4. 취소");
                        deletelabel:
                        while (true) {
                            System.out.print("원하시는 기능의 번호를 입력해주세요: ");
                            delete = scanner.next();
                            switch (delete) {
                                case "1":
                                    if (!viewList.isEmpty()) {
                                        while (!viewList.isEmpty()) {
                                            calculator.removeResultList();
                                        }
                                    }
                                    System.out.println("삭제 완료");
                                    break deletelabel;
                                case "2":
                                    if (!viewList.isEmpty()) {
                                        calculator.removeResultList();
                                        System.out.println("삭제 완료");
                                    } else {
                                        System.out.println("삭제할 값이 없습니다.");
                                    }
                                    break deletelabel;
                                case "3":
                                    if (!viewList.isEmpty()) {
                                        calculator.removeResultList2();
                                        System.out.println("삭제 완료");
                                    } else {
                                        System.out.println("삭제할 값이 없습니다.");
                                    }
                                    break deletelabel;
                                case "4":
                                    System.out.println("취소했습니다");
                                    break deletelabel;
                                default:
                                    System.out.println("잘못된 입력입니다");
                                    break;
                            }
                        }
                        break;
                    // 진행
                    case "3":
                        break label;
                    // 종료
                    case "exit":
                        replay = "exit";
                        break label;
                    // 해당되지 않는 값
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                        break;
                }
            }

        } while (!replay.equals("exit"));

        // 계산기 종료
        System.out.print("계산기 종료");
    }
}