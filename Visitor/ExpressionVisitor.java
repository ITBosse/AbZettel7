package Visitor;

public abstract class ExpressionVisitor {
    public abstract String visit(NegativeNumberExpression e);

    public abstract String visit(SumExpression e);

    public abstract String visit(DifferenceExpression e);

    public abstract String visit(DivisionExpression e);

    public abstract String visit(MultiplikationExpression e);

    public abstract String visit(NumberExpression e);

}
