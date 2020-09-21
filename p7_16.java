
//package ti;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

class Course{
	private String cNo;
	private String cName;
	private int credit;
	Course(String No, String Name, int credit){
		this.cNo = No;
		this.cName = Name;
		this.credit = credit;
	}
	/**
     * @return the credit
     */
    public int getCredit() {
        return credit;
    }
    /**
     * @return the cName
     */
    public String getcName() {
        return cName;
    }
    /**
     * @return the cNo
     */
    public String getcNo() {
        return cNo;
    }
}

class student{
	private String no;
	private String name;
	private String subject;
	student(String no, String name, String subject){
		this.no = no;
		this.name = name;
		this.subject = subject;
	}
	public String toString() {//注释1
		return  "    学生编号:" + this.no + ",学生姓名:" + this.name;
	}
}

class selectCourse{
	private Course course;
	private student[] stu;
	private int maxNum;
	private int curNum;
	selectCourse(Course course, student[] stu, int maxNum, int curNum){
		this.course = course;
		this.stu = stu;
		this.maxNum = maxNum;
		this.curNum = curNum;
	}
	void appendStu(student s) {
		this.stu[this.curNum++] = s;
	}
	public String getCourse() {
		return "课程编号:" + course.getcNo() + ",课程名:" + course.getcName() + ",学分:" + course.getCredit();
	}
	/**
     * @return the curNum
     */
    public int getCurNum() {
        return curNum;
    }
    /**
     * @return the maxNum
     */
    public int getMaxNum() {
        return maxNum;
    }
    /**
     * @return the stu
     */
    public student[] getStu() {
        return stu;
    }
}

public class p7_16 {
	public static final int NUM=100;
	public static void main(String[] args) {
		selectCourse sCourse;
		Course course = new Course("001",new String("java程序设计"),3);
		student[] s = new student[NUM];
		for(int i = 0;i < NUM;i ++)
		{
			s[i] = new student((new Integer(100 + i)).toString(), "StudentName_" + i, "computer");
		}
		sCourse = new selectCourse(course, s, 100, 3);
		sCourse.appendStu(new student("800", "  name_last ", " computer"));
		System.out.println(sCourse.getCourse()+"---课程选课情况为：");
		
		for(int i=0;i<sCourse.getCurNum();i++){
			System.out.println(sCourse.getStu()[i]);
		}
	}
}
//优先级 9

/*
1. toString方法 
https://www.cnblogs.com/huan-guo/p/8404891.html
*/