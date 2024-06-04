package Visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {

    @Test
    public void ExpressiontestDiffSum() {
        Expression exp = new SumExpression(new DifferenceExpression(new NumberExpression(5), new NumberExpression(2)),
                new NumberExpression(3));
        ExpressionVisitor visitor = new ToInfixStringVisitor();

        assertEquals("((5 - 2) + 3)", exp.accept(visitor));
    }

    @Test
    public void ExpressiontestDivMul() {
        Expression exp = new MultiplikationExpression(
                new DivisionExpression(new NumberExpression(5), new NumberExpression(2)),
                new NumberExpression(3));
        ExpressionVisitor visitor = new ToInfixStringVisitor();

        assertEquals("((5 / 2) * 3)", exp.accept(visitor));
    }

    @Test
    public void ExpressiontestNegativeNumber() {
        Expression exp = new MultiplikationExpression(
                new DivisionExpression(new NumberExpression(5), new NegativeNumberExpression(2)),
                new NumberExpression(3));
        ExpressionVisitor visitor = new ToInfixStringVisitor();

        assertEquals("((5 / (-2)) * 3)", exp.accept(visitor));
    }

}
