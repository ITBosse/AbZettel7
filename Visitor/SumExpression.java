package Visitor;

public class SumExpression<T> extends BinaryExpression {

    public SumExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> ExpVis) {
        return ExpVis.visit(this);
    }

}
