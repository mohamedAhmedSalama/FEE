/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagementsystem;

/**
 *
 * @author Soft Laptop
 */
public class Course extends Score{
    
    private String courseCode;

    
    private String name;
    private String feedback;
    private int hours;

    public Course() {
    }

    public Course(String courseCode, String name, String feedback, int hours, int grade) {
        super(grade);
        this.courseCode = courseCode;
        this.name = name;
        this.feedback = feedback;
        this.hours = hours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", name=" + name  + ", hours=" + hours + ", feedback=" + feedback + ", grade= " + this.getGrade() + '}';
    }
    
    
}
