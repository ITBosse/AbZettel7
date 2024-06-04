package Adapter;

public class TriangleAdapter extends Shape2D{
    private final LegacyTriangle legacyTriangle;
    public TriangleAdapter(LegacyTriangle legacyTriangle) {
        super(legacyTriangle.pointA().getxPos(), legacyTriangle.pointA().getyPos());
        this.legacyTriangle = legacyTriangle;
    }
    @Override
    public double getxPos() {
        return legacyTriangle.pointA().getxPos();
    }
    @Override
    public double getyPos() {
        return legacyTriangle.pointA().getyPos();
    }
    @Override
    public double getArea() {
        double ab = Math.abs(Math.sqrt(Math.pow((legacyTriangle.pointA().getxPos() - legacyTriangle.pointB().getxPos()), 2)
                + Math.pow((legacyTriangle.pointA().getyPos() - legacyTriangle.pointB().getyPos()), 2)));
        double bc = Math.abs(Math.sqrt(Math.pow((legacyTriangle.pointB().getxPos() - legacyTriangle.pointC().getxPos()), 2)
                + Math.pow((legacyTriangle.pointB().getyPos() - legacyTriangle.pointC().getyPos()), 2)));
        double ca = Math.abs(Math.sqrt(Math.pow((legacyTriangle.pointC().getxPos() - legacyTriangle.pointA().getxPos()), 2)
                + Math.pow((legacyTriangle.pointC().getyPos() - legacyTriangle.pointA().getyPos()), 2)));
        double s = (ab + bc + ca) / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
        //satz von heron
    }
    @Override
    public void shift(double xOffset, double yOffset) {
        legacyTriangle.pointA().shiftxPos(xOffset);
        legacyTriangle.pointA().shiftyPos(yOffset);
        legacyTriangle.pointB().shiftxPos(xOffset);
        legacyTriangle.pointB().shiftyPos(yOffset);
        legacyTriangle.pointC().shiftxPos(xOffset);
        legacyTriangle.pointC().shiftyPos(yOffset);
    }

    @Override
    public void scale(double factor) {
        double abx = Math.abs(legacyTriangle.pointA().getxPos() - legacyTriangle.pointB().getxPos());
        double aby = Math.abs(legacyTriangle.pointA().getyPos() - legacyTriangle.pointB().getyPos());
        double acx = Math.abs(legacyTriangle.pointA().getxPos() - legacyTriangle.pointC().getxPos());
        double acy = Math.abs(legacyTriangle.pointA().getyPos() - legacyTriangle.pointC().getyPos());
        legacyTriangle.pointB().setxPos(legacyTriangle.pointA().getxPos() + abx * factor);
        legacyTriangle.pointB().setyPos(legacyTriangle.pointA().getyPos() + aby * factor);
        legacyTriangle.pointC().setxPos(legacyTriangle.pointA().getxPos() + acx * factor);
        legacyTriangle.pointC().setyPos(legacyTriangle.pointA().getyPos() + acy * factor);
    }
    //test
}
