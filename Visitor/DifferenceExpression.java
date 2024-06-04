package Visitor;

public class DifferenceExpression extends BinaryExpression {

    public DifferenceExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> ExpVis) {
        return ExpVis.visit(this);
    }

}
