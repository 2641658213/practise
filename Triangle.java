public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double C;
    private double S;
    private boolean judge;//判断是否是三角

    public double calculateC() {//计算周长
        return sideA + sideB + sideC;
    }

    public double calculateS() {//计算面积，使用海伦公式
        double pp = calculateC() / 2;
        return Math.sqrt(pp * (pp - sideA) * (pp - sideB) * (pp - sideC));
    }
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.judge = isTriangle(sideA, sideB, sideC);
        if (judge) {
            calculateC();
            calculateS();
        }
        else {
            System.out.println("not a triangle");
        }
    }
    public double getC() {
        this.C=calculateC();
        return C;
    }

    public double getS() {
        this.S=calculateS();
        return S;
    }
//以下是用于修改三边的函数，修改完后判断是否是三角形，并重新计算周长和面积
    public void setSideA(double sideA) {
        this.sideA = sideA;
        this.judge = isTriangle(sideA, sideB, sideC);
        if (judge) {
            calculateC();
            calculateS();
        }
        else {
            System.out.println("not a triangle");
        }
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        this.judge = isTriangle(sideA, sideB, sideC);
        if (judge) {
            calculateC();
            calculateS();
        }
        else {
            System.out.println("not a triangle");
        }
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
        this.judge = isTriangle(sideA, sideB, sideC);
        if (judge) {
            calculateC();
            calculateS();
        }
        else {
            System.out.println("not a triangle");
        }
    }

    private boolean isTriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;//是为1
        } else {
            return false;//否为0
        }
    }
//返回值
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
}

