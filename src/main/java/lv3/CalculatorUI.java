package lv3;

import java.util.List;
import java.util.Scanner;

public class CalculatorUI {

    private final Scanner scanner;
    private final Calculator<Double> calculator;

    // 생성자
    public CalculatorUI(Scanner scanner, Calculator<Double> calculator) {
        this.scanner = scanner;
        this.calculator = calculator;
    }

    // 계산기 기능 메서드
    public String display() {
        List<Double> viewList = calculator.getResultList();
        String replay;
        String view;
        String delete;
        double n3;

        System.out.println("1. 결과값 조회하기");
        System.out.println("2. 결과값 초기화하기");
        System.out.println("3. 계속 계산하기");
        System.out.println("종료 하려면 exit 을 입력");

        while (true) {
            System.out.print("원하시는 기능의 번호를 입력해주세요: ");
            replay = scanner.next();

            switch (replay) {
                case "1":
                    System.out.println("조회기능 목록");
                    System.out.println("1. 입력값보다 낮은 수");
                    System.out.println("2. 입력값보다 높은 수");
                    System.out.println("3. 전체 조회");
                    System.out.println("4. 취소");
                    while (true) {
                        System.out.print("조회 기능 번호 입력: ");
                        view = scanner.next();
                        switch (view) {
                            case "1":
                                System.out.print("입력값: ");
                                n3 = scanner.nextDouble();
                                System.out.println("결과 = " + calculator.resultSearch2(n3));
                                return replay;
                            case "2":
                                System.out.print("입력값: ");
                                n3 = scanner.nextDouble();
                                System.out.println("결과 = " + calculator.resultSearch(n3));
                                return replay;
                            case "3":
                                System.out.println("전체 결과 = " + viewList);
                                return replay;
                            case "4":
                                System.out.println("취소");
                                return replay;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                    }
                case "2":
                    System.out.println("삭제기능 목록");
                    System.out.println("1. 모두 지우기");
                    System.out.println("2. 이전값 지우기");
                    System.out.println("3. 최근값 지우기");
                    System.out.println("4. 취소");
                    while (true) {
                        System.out.print("삭제 기능 번호 입력: ");
                        delete = scanner.next();
                        switch (delete) {
                            case "1":
                                viewList.clear(); // 전체 삭제
                                System.out.println("전체 삭제 완료");
                                return replay;
                            case "2":
                                if (!viewList.isEmpty()) {
                                    calculator.removeResultList(); // 처음 값 삭제
                                    System.out.println("이전값 삭제 완료");
                                } else {
                                    System.out.println("삭제할 값이 없습니다.");
                                }
                                return replay;
                            case "3":
                                if (!viewList.isEmpty()) {
                                    calculator.removeResultList2(); // 마지막 값 삭제
                                    System.out.println("최근값 삭제 완료");
                                } else {
                                    System.out.println("삭제할 값이 없습니다.");
                                }
                                return replay;
                            case "4":
                                System.out.println("취소");
                                return replay;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                    }
                case "3":
                    return replay;
                case "exit":
                    return "exit";
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}