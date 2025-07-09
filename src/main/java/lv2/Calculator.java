package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 컬렉션 필드
    private List<Integer> resultList = new ArrayList<>();

    // 사칙연산 메서드
    public int calcul(int n1, int n2, char oper) {
        int result = 0;
        // 사칙연산
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

    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

}
