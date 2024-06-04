package Visitor;

public class NegativeNumberExpression extends Expression {

    private int number;

    public NegativeNumberExpression(int number) {
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
