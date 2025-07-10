package lv3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 컬렉션 필드
    private List<Integer> resultList = new ArrayList<>();

    // 사칙연산 메서드
    public int calculate(int n1, int n2, Operator oper) {
        int result = 0;
        // 사칙연산
        switch (oper) {
            case ADD:
                result = n1 + n2;
                break;
            case SUB:
                result = n1 - n2;
                break;
            case MUL:
                result = n1 * n2;
                break;
            case DIV:
                if (n2 == 0) {
                    System.out.println("나눗셈 연산에서는 분모(두번째 숫자)에 0이 입력될 수 없습니다.");
                    return 0;
                } else {
                    result = n1 / n2;
                }
                break;
        }

        // 컬렉션 필드에 저장
        resultList.add(result);

        // 결과값 반환
        return result;
    }

    // 게더 메서드
    public List<Integer> getResultList() {
        return resultList;
    }

    // 세터 메서드
    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    // 컬렉션에서 가장 먼저 추가된 데이터를 삭제하는 메서드
    public void removeResultList() {
        resultList.remove(0);
    }
}
