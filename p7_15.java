import java.util.*;

public class p7_15 {
    static class Person {
        private String name;// 姓名
        private int age;// 年龄
        private String gender;// 性别

        public void setName(String name) {
            this.name = name;
        }

        /**
         * @param age the age to set
         */
        public void setAge(int age) {
            this.age = age;
        }

        /**
         * @param gender the gender to set
         */
        public void setGender(String gender) {
            this.gender = gender;
        }

        // Person
        public String toString() {//注释1
            return "name=" + name + ", age=" + age + ", gender=" + gender + ", ";
        }
    }

    static class Teacher extends Person {
        private float salary;// 薪酬
        private String department;// 部门

        Teacher(String name, int age, String gender, float salary, String department) {
            super.name = name;
            super.age = age;
            super.gender = gender;
            this.salary = salary;
            this.department = department;
        }

        // Teacher
        public String toString() {
            return "Teacher: " + super.toString() + "salary=" + salary + ", department=" + department;
        }

    }

    static class Student extends Person {
        private int[] score;// 成绩
        private String grade;// 年级

        /**
         * @param grade the grade to set
         */
        public void setGrade(String grade) {
            this.grade = grade;
        }

        /**
         * @param score the score to set
         */
        public void setScore(int[] score) {
            this.score = score;
        }

        // Student
        public String toString() {
            return "Student: " + super.toString() + "score=" + Arrays.toString(score) + ", grade=" + grade;
        }
    }

    public static void main(String[] args) {
        Person teacher = new Teacher("Jason", 28, "男", 10000, "外国语学院");
        Student stu[] = new Student[5];
        for (int i = 0; i < 5; i++)
            stu[i] = new Student();
        stu[0].setName("张三");
        stu[0].setAge(18);
        stu[0].setGender("男");
        stu[0].setScore(new int[] { 120, 130, 144, 110, 125 });
        stu[0].setGrade("软工2018级");
        stu[1].setName("李四");
        stu[1].setAge(19);
        stu[1].setGender("男");
        stu[1].setScore(new int[] { 112, 123, 122, 144, 125 });
        stu[1].setGrade("软工2018级");
        System.out.println(teacher);
        for (int i = 0; i < 5; i++)
            System.out.println(stu[i]);
    }
}
//优先级 9

/*
1. toString方法 
https://www.cnblogs.com/huan-guo/p/8404891.html
*/