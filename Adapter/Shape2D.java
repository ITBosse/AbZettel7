package Adapter;

public abstract class Shape2D implements IShiftable, IScalable {
    private double xPos;
    private double yPos;
    public Shape2D(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public double getxPos() {
        return xPos;
    }
    public double getyPos() {
        return yPos;
    }
    public abstract double getArea();
    @Override
    public void shift(double xOffset, double yOffset) {
        this.xPos += xOffset;
        this.yPos += yOffset;
    }
}