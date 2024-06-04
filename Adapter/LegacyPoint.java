package Adapter;

public class LegacyPoint {
    private double xPos;
    private double yPos;
    public double getxPos() { return xPos; }
    public void setxPos(double xPos) { this.xPos = xPos; }
    public double getyPos() { return yPos; }
    public void setyPos(double yPos) { this.yPos = yPos; }
    public void shiftxPos(double xShift) { this.xPos += xShift; }
    public void shiftyPos(double yShift) { this.yPos += yShift; }
    public LegacyPoint(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
