package lv3;

public enum Operator {
    ADD('+'), SUB('-'), MUL('*'), DIV('/');

    // oper 저장하는 필드
    private final char oper;

    // oper 연산자 초기화
    Operator(char oper) {
        this.oper = oper;
    }

    // 받은 문자에 대응하는 Operator enum을 반환
    public static Operator fromChar(char ch) {
        for (Operator op : Operator.values()) {
            if (op.oper == ch) {
                return op;
            }
        }
        return null;
    }
}
