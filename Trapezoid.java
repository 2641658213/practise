public class Trapezoid {
    private double top;
    private double bottom;
    private double height;
    private double S;

    public Trapezoid(double top, double bottom, double height) {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.S = (top + bottom) * height / 2;//计算面积
    }

    public double getS() {//返回面积
        return S;
    }
}