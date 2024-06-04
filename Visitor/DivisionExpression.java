package Visitor;

public class DivisionExpression extends BinaryExpression {
    public DivisionExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> ExpVis) {
        return ExpVis.visit(this);
    }
}
