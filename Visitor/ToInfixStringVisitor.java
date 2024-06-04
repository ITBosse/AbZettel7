package Visitor;

public class ToInfixStringVisitor extends ExpressionVisitor<String> {

    @Override
    public String visit(NumberExpression e) {
        return String.valueOf(e.getNumber());
    }

    @Override
    public String visit(NegativeNumberExpression e) {
        return "(-" + String.valueOf(e.getNumber()) + ")";
    }

    @Override
    public String visit(SumExpression e) {
        return "(" + e.getLeftExpression().accept(this)
                + " + " + e.getRightExpression().accept(this) + ")";
    }

    @Override
    public String visit(DifferenceExpression e) {
        return "(" + e.getLeftExpression().accept(this)
                + " - " + e.getRightExpression().accept(this) + ")";

    }

    @Override
    public String visit(DivisionExpression e) {
        return "(" + e.getLeftExpression().accept(this)
                + " / " + e.getRightExpression().accept(this) + ")";
    }

    @Override
    public String visit(MultiplikationExpression e) {
        return "(" + e.getLeftExpression().accept(this)
                + " * " + e.getRightExpression().accept(this) + ")";
    }

}
