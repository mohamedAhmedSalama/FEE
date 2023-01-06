/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagementsystem;

/**
 *
 * @author Soft Laptop
 */
public class Student extends Person{
    
    private static int number = 3000;
    private  int ID;
    private int level;
    private int courseNo=0;
    private Course[] courses = new Course[4];
    // need some data

    public Student() {
        
        this.ID = this.number;
        this.number++;
    }

    public Student( String name, String address, String gendre, int age,int level,Course course1, Course course2,Course course3,Course course4) {
        super(name, address, gendre, age);
        this.level = level;
        this.courses[0] = new Course(course1.getCourseCode(), course1.getName(), course1.getFeedback(), course1.getHours(), course1.getGrade());
        this.courses[1] = new Course(course2.getCourseCode(), course2.getName(), course2.getFeedback(), course2.getHours(), course2.getGrade());
        this.courses[2] = new Course(course3.getCourseCode(), course3.getName(), course3.getFeedback(), course3.getHours(), course3.getGrade());
        this.courses[3] = new Course(course4.getCourseCode(), course4.getName(), course4.getFeedback(), course4.getHours(), course4.getGrade());
        this.ID = this.number;
        this.number++;
    }
    
    public boolean setCourses(Course course)
    {
        if(this.courseNo == 4)
            return false;
        else
        {
          this.courses[this.courseNo] = new Course(course.getCourseCode(), course.getName(), course.getFeedback(), course.getHours(), course.getGrade());
          this.courseNo++;
          return true;
        }
    }
    public void setStudentFeedback(int num , String feedback)
    {
        this.courses[num].setFeedback(feedback);
    }
    public void setStudentGrades(int num , int grade)
    {
        this.courses[num].setGrade(grade);
    }
    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }
    
    public Course getCourse(int number)
    {
        return this.courses[number];
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @Override
    public String getName()
    {
        return this.name;
    }
    
    
    public int getID() {
        return this.ID;
    }

    
    /*
    public String toString() {
        return super.toString()+ " Student{" + "ID=" + ID + ", level=" + level + ", courseNo=" + courseNo + ", courses=" + courses + '}';
    }*/
    
    
    
}
