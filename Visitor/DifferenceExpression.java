package Visitor;

public class DifferenceExpression extends BinaryExpression {

    public DifferenceExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String accept(ExpressionVisitor ExpVis) {
        return ExpVis.visit(this);
    }

}
