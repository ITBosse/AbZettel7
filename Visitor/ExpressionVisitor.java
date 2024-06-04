package Visitor;

public abstract class ExpressionVisitor<T> {
    public abstract T visit(NegativeNumberExpression e);

    public abstract T visit(SumExpression e);

    public abstract T visit(DifferenceExpression e);

    public abstract T visit(DivisionExpression e);

    public abstract T visit(MultiplikationExpression e);

    public abstract T visit(NumberExpression e);

}
