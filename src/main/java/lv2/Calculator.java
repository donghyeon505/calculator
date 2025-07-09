package lv2;

public class Calculator {

    public int calcul(int n1, int n2, char oper) {
        int result = 0;

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
        return result;

    }



}
