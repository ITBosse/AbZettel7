package Visitor;

public class SumExpression extends BinaryExpression {

    public SumExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String accept(ExpressionVisitor ExpVis) {
        return ExpVis.visit(this);
    }

}
