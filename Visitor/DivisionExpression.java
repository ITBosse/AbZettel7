package Visitor;

public class DivisionExpression extends BinaryExpression {
    public DivisionExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String accept(ExpressionVisitor ExpVis) {
        return ExpVis.visit(this);
    }
}
