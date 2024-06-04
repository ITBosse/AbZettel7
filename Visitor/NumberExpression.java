package Visitor;

public class NumberExpression extends Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String accept(ExpressionVisitor ExpVis) {
        return ExpVis.visit(this);
    }
}
