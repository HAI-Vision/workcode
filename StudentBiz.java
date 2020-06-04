package work.workdemo2;

public class StudentBiz {
    public static void main(String[] args) {
        // 定义一个对象数组
        Student[] student = new Student[5];
        // 实例化5个学生对象
        Student student1 = new Student("Bale", "male", 18, 95);
        Student student2 = new Student("Ronaldo", "male", 17, 65);
        Student student3 = new Student("Alan", "male", 18, 72);
        Student student4 = new Student("Taylor", "female", 19, 91);
        Student student5 = new Student("Neymar", "male", 20, 55);
        // 将学生信息存放在数组中
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;
        student[3] = student4;
        student[4] = student5;
        // 用static关键字修饰的方法，在调用时采用类名.方法名
        Student.scoreList(student);
        Student.maxScore(student);
        Student.minScore(student);
        System.out.println("5位同学的平均分：" + Student.averageScore(student));

    }

}