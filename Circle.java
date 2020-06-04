package work.workdemo3;

/**
 * 圆类 - 父类
 */
public class Circle {
    private double radius; // 半径

    /** 构造方法 */
    public Circle(double radius) {
        this.radius = radius;
    }

    protected double computeArea() {
        double area = 1.0;
        area = 3.14 * (Math.pow(radius, 2)); // 圆的面积公式 S = π*r*r
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}