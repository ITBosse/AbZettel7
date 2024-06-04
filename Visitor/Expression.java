package Visitor;

public abstract class Expression {
    public abstract <T> T accept(ExpressionVisitor<T> ExpVis);
}
