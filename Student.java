package work.workdemo2;

public class Student {
    private String name;
    private String sex;
    private int age;
    private int score;

    public Student(String name, String sex, int age, int score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    /**
     * 获取5个学生成绩的平均值
     * 
     * @param student
     * @return 返回学生成绩的平均值
     */
    public static double averageScore(Student[] student) {
        int tempSum = 0;
        for (int i = 0; i < student.length; i++) {
            tempSum += student[i].getScore();
        }
        return (tempSum * 1.0) / student.length;
    }

    /**
     * @param student
     */
    public static void scoreList(Student[] student) {
        System.out.println("---------学生成绩单---------");
        System.out.println("姓名\t性别\t年龄\t成绩");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t" + student[i].getSex() + "\t" + student[i].getAge() + "\t"
                    + student[i].getScore());
        }
        System.out.println("----------------------------");
    }

    /**
     * 获取5个学生中的最高分
     * 
     * @param student
     */
    public static void maxScore(Student[] student) {
        int max = student[0].getScore();
        int indexMax = 0;
        for (int i = 1; i < student.length; i++) {
            if (max < student[i].getScore()) {
                max = student[i].getScore();
                indexMax = i;
            }
        }
        System.out.println(student[indexMax].getName() + "的分数最高：" + student[indexMax].getScore());
    }

    /**
     * 获取5个学生中的最低分
     * 
     * @param student
     */
    public static void minScore(Student[] student) {
        int min = student[0].getScore();
        int indexMin = 0;
        for (int i = 1; i < student.length; i++) {
            if (min > student[i].getScore()) {
                min = student[i].getScore();
                indexMin = i;
            }
        }
        System.out.println(student[indexMin].getName() + "的分数最低：" + student[indexMin].getScore());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
