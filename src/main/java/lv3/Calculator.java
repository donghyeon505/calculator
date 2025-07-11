package lv3;

import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {

    // 컬렉션 필드
    private List<Double> resultList = new ArrayList<>();

    // 사칙연산 메서드
    public double calculate(T n1, T n2, Operator oper) {
        double result = 0;
        // 사칙연산
        switch (oper) {
            case ADD:
                result = n1.doubleValue() + n2.doubleValue();
                break;
            case SUB:
                result = n1.doubleValue() - n2.doubleValue();
                break;
            case MUL:
                result = n1.doubleValue() * n2.doubleValue();
                break;
            case DIV:
                if (n2.doubleValue() == 0) {
                    System.out.println("나눗셈 연산에서는 분모(두번째 숫자)에 0이 입력될 수 없습니다.");
                    return 0;
                } else {
                    result = n1.doubleValue() / n2.doubleValue();
                }
                break;
        }

        // 컬렉션 필드에 저장
        resultList.add(result);

        // 결과값 반환
        return result;
    }

    // 게더 메서드
    public List<Double> getResultList() {
        return resultList;
    }

    // 세터 메서드
    public void setResultList(List<Double> resultList) {
        this.resultList = resultList;
    }

    // 컬렉션에서 가장 먼저 추가된 데이터를 삭제하는 메서드
    public void removeResultList() {
        resultList.remove(0);
    }
}
