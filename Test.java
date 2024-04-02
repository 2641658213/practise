public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle zhou chang: " + triangle.getC());
        System.out.println("Triangle mian ji: " + triangle.getS());
        System.out.println("Triangle sideA: " + triangle.getSideA());
        System.out.println("Triangle sideB: " + triangle.getSideB());
        System.out.println("Triangle sideC: " + triangle.getSideC());
        System.out.println("\nnow change sideA=4 " );//测试修改边代码
        triangle.setSideA(4);
        System.out.println("Triangle zhou chang: " + triangle.getC());
        System.out.println("Triangle mian ji: " + triangle.getS());
        System.out.println("Triangle sideA: " + triangle.getSideA());
        System.out.println("\nnow change sideA=10 " );
        triangle.setSideA(10);//测试Boolean判断
        System.out.println("\n");

        Trapezoid trapezoid = new Trapezoid(3, 5, 4);
        System.out.println("Trapezoid mian ji: " + trapezoid.getS());
        System.out.println("\n");

        Circle circle = new Circle(2);
        System.out.println("Circle zhou chang: " + circle.getC());
        System.out.println("Circle mian ji: " + circle.getS());

    }
}