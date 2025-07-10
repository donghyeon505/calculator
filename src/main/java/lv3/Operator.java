package lv3;

public enum Operator {
    ADD('+'), SUB('-'), MUL('*'), DIV('/');

    private final char oper;
    Operator(char oper) {
        this.oper = oper;
    }

    public static Operator fromChar(char ch) {
        for (Operator op : Operator.values()) {
            if (op.oper == ch) {
                return op;
            }
        }
        return null;
    }
}
