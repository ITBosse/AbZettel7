package Visitor;

public class NumberExpression<T> extends Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> ExpVis) {
        return ExpVis.visit(this);
    }
}
