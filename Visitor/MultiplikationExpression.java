package Visitor;

public class MultiplikationExpression extends BinaryExpression {
    public MultiplikationExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> ExpVis) {
        return ExpVis.visit(this);
    }

}
