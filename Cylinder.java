package work.workdemo3;

/**
 * 圆柱类 - 子类
 */
public class Cylinder extends Circle {
    private double height; // 高

    /** 构造方法 */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    /**
     * 继承父类的方法，计算圆柱体的面积
     */
    public double computeArea() {
        double area = 1.0;
        area = 3.14 * (Math.pow(getRadius(), 2)) * getHeight(); // 圆柱体的面积公式： S = 底面积 * 高
        return area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}