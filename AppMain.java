package work.workdemo3;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 实例化对象
        System.out.println("请输入圆柱的半径：");
        double radius = sc.nextDouble();
        System.out.println("请输入圆柱的高：");
        double height = sc.nextDouble();
        Circle cylinder = new Cylinder(radius, height);
        // 调用方法，得到圆柱的面积
        double area = cylinder.computeArea();
        System.out.println("圆柱体的面积为：" + area);
        sc.close();// 关闭输入的流，释放内存
    }
}