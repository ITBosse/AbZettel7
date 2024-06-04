package Visitor;

public class MultiplikationExpression extends BinaryExpression {
    public MultiplikationExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String accept(ExpressionVisitor ExpVis) {
        return ExpVis.visit(this);
    }

}
