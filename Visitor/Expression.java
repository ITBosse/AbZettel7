package Visitor;

public abstract class Expression {
    public abstract String accept(ExpressionVisitor ExpVis);

}
