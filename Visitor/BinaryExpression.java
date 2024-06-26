package Visitor;

public abstract class BinaryExpression extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public BinaryExpression(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
