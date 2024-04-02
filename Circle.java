public class Circle {
    private double radius;
    private double C;
    private double S;

    public Circle(double radius) {
        this.radius = radius;
        this.C = 2 * Math.PI * radius;//计算周长
        this.S = Math.PI * radius * radius;//计算面积
    }

    public double getC() {
        return C;
    }

    public double getS() {
        return S;
    }
}