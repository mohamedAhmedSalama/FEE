/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coursemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Soft Laptop
 */
public class CourseManagementSystem {
    
   static void printCourse(Course c)
    {
        System.out.println(c.toString());
    }
   static void printStudentID(Student s)
   {
       System.out.println("ID: "+ s.getID() );
   }
   static void printinstructorID(Instructor i)
   {
       System.out.println("ID: "+ i.getID() );
   }
   static boolean findStudent(Student s , int id)
   {
       if( id == s.getID())
           return true;
        else
           return false;
   }
   static boolean findInstructor(Instructor i , int id)
   {
       if( id == i.getID())
           return true;
        else
           return false;
   }
   static void setStudentCourseNo(Student s )
   {
       s.setCourseNo(0);
   }
   static void setStudentData(Student s,String name, String address, String gendre, int age,int level , Course c1 , Course c2, Course c3, Course c4 )
   {
       
       s.setName(name);
       s.setAddress(address);
       s.setGendre(gendre);
       s.setAge(age);
       s.setLevel(level);
       s.setCourses(c1);
       s.setCourses(c2);
       s.setCourses(c3);
       s.setCourses(c4);
   }
   static void setInstructorData(Instructor i,String courseName, String name, String address, String gendre, int age)
   {
       i.setCourseName(courseName);
       i.setName(name);
       i.setAddress(address);
       i.setGendre(gendre);
       i.setAge(age);
   }
   static void printStudentData( Student s)
   {
       System.out.println(" Name: "+s.getName());
       System.out.println(" Address: "+s.getAddress()+", Level: "+s.getLevel()+", Age: "+s.getAge()+", Gendre: "+s.getGendre());
        for ( int k = 0 ; k < 4 ; k++)
           System.out.println(" course "+(k+1) + ": "+s.getCourse(k).toString());
       
   }
   static void printStudentFeedback( Student s)
   {
        for ( int k = 0 ; k < 4 ; k++)
           System.out.println(" course "+(k+1) + ": "+"name: "+s.getCourse(k).getName()+" feedback: "+s.getCourse(k).getFeedback());
   }
   static void setStudentFeedback( Student s , int num , String feedback)
   {
       s.setStudentFeedback(num, feedback);
   }
   static void printStudentGrades( Student s)
   {
        for ( int k = 0 ; k < 4 ; k++)
           System.out.println(" course "+(k+1) + ": "+"name: "+s.getCourse(k).getName()+" grade: "+s.getCourse(k).getGrade());
   }
   static void setStudentGrade( Student s , int num , int grade)
   {
       s.setStudentGrades(num, grade);
   }
   static void printStudentCourses( Student s)
   {
        for ( int k = 0 ; k < 4 ; k++)
           System.out.println(" course "+(k+1) + ": "+", name: "+s.getCourse(k).getName());
   }
   static void printInstructorData( Instructor i)
   {
        System.out.println(" Name: "+i.getName());
        System.out.println(" Address: "+i.getAddress()+", Age: "+i.getAge()+", Gendre: "+i.getGendre());
        System.out.println(" Course name: "+ i.getCourseName());
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Instructor> instructor = new ArrayList<Instructor>();
        ArrayList<Student> student = new ArrayList<Student>();
        ArrayList<Course> course = new  ArrayList<Course>();
        Administrator admin = new Administrator("mohamed@gmail.com","Tarek El-said","Cairo, Egypt","male",33);
       // Instructor tempInstructor = new Instructor();
       
        boolean flag = true , innerFlag = true , find = false;
        int choice , id , innerChoice , age , level , i ,j;
        String data , name , address , gendre , courseName , feedback; 
        int course1,course2,course3,course4 , hours , grade ;
        
        Scanner input = new Scanner(System.in);
        Scanner str_input = new Scanner(System.in);
        Scanner str2_input = new Scanner(System.in);
        
        course.add(new Course("CSE112","JAVA",null,3,0));
        course.add(new Course("CSE145","OOP",null,2,0));
        course.add(new Course("CSE122","AI",null,3,0));
        course.add(new Course("CSE134","Neural Network",null,2,0));
        course.add(new Course("CSE144","Computer Arch",null,3,0));
        instructor.add(new Instructor("JAVA","Hanaa Turkey","Menofia,Egypt","Female",33));
        instructor.add(new Instructor("OOP","Manar Zaki","Menofia,Egypt","Female",40));
        instructor.add(new Instructor("AI","Ahmed Ghozia","Menofia,Egypt","male",45));
        instructor.add(new Instructor("Computer Arch","Gamal Mahrous","Menofia,Egypt","male",50));
        instructor.add(new Instructor("Neural Network","Abdullah Nabil","Menofia,Egypt","male",36));
        student.add(new Student("Mohamed Ahmed","Menofia,Egypt","Male",21,3,course.get(0),course.get(1),course.get(2),course.get(3)));
        student.add(new Student("Mohamed Ali","Menofia,Egypt","Male",20,2,course.get(0),course.get(4),course.get(2),course.get(3)));
        
        
        
        
        
        System.out.println(" =========================");
        System.out.println(" Welcome to Course System ");
        System.out.println(" =========================");
        while( flag == true)
        {   innerFlag = true;
            System.out.println(" Login as:\n 1- Admininstrator 2- Student\n 3- Instructor 4- Exit");
            System.out.print(" Choice: ");
            choice = input.nextInt();
            System.out.println("");
            switch(choice)
            {
                case 1:
                    System.out.print(" Enter Login email :");
                    data = str_input.nextLine();
                    System.out.print(" Enter ID: ");
                    id = input.nextInt();
                    if ( ( data.equals(admin.getLogin()) == true ) && ( id == admin.getID() ))
                    {   
                        System.out.println("***************************\n");
                        System.out.println(" Welcome " + admin.getName());
                        while(innerFlag == true)
                        {
                            System.out.println("\n which operation to perform !");
                            System.out.println(" 1- Add new student         2- Add new instructor ");
                            System.out.println(" 3- Add new course          4- Update student data");
                            System.out.println(" 5- Update instructor data  6- Display all students");
                            System.out.println(" 7- Dislpay all instructors 8- Remove student");
                            System.out.println(" 9- Remove instructor       10- Exit");
                            System.out.print(" choice: ");
                            innerChoice = input.nextInt();
                            System.out.println("");
                            switch(innerChoice)
                            {
                                case 1 :
                                    System.out.print(" Enter student name: ");
                                    name = str_input.nextLine();
                                    System.out.print(" Enter student address: ");
                                    address = str_input.nextLine();
                                    System.out.print(" Enter student gendre: ");
                                    gendre = str_input.nextLine();
                                    System.out.print(" Enter student age: ");
                                    age = input.nextInt();
                                    System.out.print(" Enter student level: ");
                                    level = input.nextInt();
                                    System.out.println(" chooce 4 numbers of the following courses:");
                                    for ( i = 0 ; i < course.size() ; i++)
                                    {
                                        System.out.print(" "+(i+1)+"- ");
                                       printCourse(course.get(i));
                                    }
                                    System.out.println(" Enter courses numbers: ");
                                    course1 = str_input.nextInt();
                                    course2 = str_input.nextInt();
                                    course3 = str_input.nextInt();
                                    course4 = str_input.nextInt();
                                    student.add(new Student(name, address, gendre, age, level,course.get(course1-1),course.get(course2-1),course.get(course3-1),course.get(course4-1)));
                                    System.out.print(" Succsseful operation , your id is: ");
                                    printStudentID(student.get(student.size()-1));
                                    
                                    break;
                                case 2:
                                    System.out.print(" Enter instructor name: ");
                                    name = str2_input.nextLine();
                                    System.out.print(" Enter instructor address: ");
                                    address = str2_input.nextLine();
                                    System.out.print(" Enter instructor gendre: ");
                                    gendre = str2_input.nextLine();
                                    System.out.println(" Enter instructor age: ");
                                    age = input.nextInt();
                                    System.out.println(" chooce 1 of the following courses:");
                                    for ( i = 0 ; i < course.size() ; i++)
                                    {
                                        System.out.print((i+1)+"- ");
                                        printCourse(course.get(i));
                                    }
                                    System.out.println(" Enter Course name: ");
                                    courseName = str_input.nextLine();
                                    instructor.add(new Instructor(courseName, name, address, gendre, age));
                                    System.out.print(" Succsseful operation , your id is: ");
                                    printinstructorID(instructor.get(instructor.size()-1));
                                    
                                    break;
                                case 3 :
                                    System.out.print(" Enter course name:");
                                    courseName = str_input.nextLine();
                                    System.out.print(" Enter course code:");
                                    name = str_input.nextLine();
                                    System.out.print(" Enter course hours:");
                                    hours = input.nextInt();
                                    course.add(new Course(name, courseName, null, hours, 0));
                                    System.out.println(" Succsseful operation");
                                    break;
                                case 4:
                                    System.out.print(" Enter student ID: ");
                                    id = input.nextInt();
                                    for( j = 0 ; j < student.size() ; j++)
                                    {
                                        find = findStudent(student.get(j), id);
                                        if( find == true)
                                            break;
                                    }
                                    if( find == true)
                                    {
                                        System.out.print(" Enter student name: ");
                                        name = str_input.nextLine();
                                        System.out.print(" Enter student address: ");
                                        address = str_input.nextLine();
                                        System.out.print(" Enter student gendre: ");
                                        gendre = str_input.nextLine();
                                        System.out.print(" Enter student age: ");
                                        age = input.nextInt();
                                        System.out.print(" Enter student level: ");
                                        level = input.nextInt();
                                        System.out.println(" chooce 4 numbers of the following courses:");
                                        for ( i = 0 ; i < course.size() ; i++)
                                        {
                                            System.out.print((i+1)+"- ");
                                           printCourse(course.get(i));
                                        }
                                        System.out.println(" Enter courses numbers: ");
                                        course1 = str_input.nextInt();
                                        course2 = str_input.nextInt();
                                        course3 = str_input.nextInt();
                                        course4 = str_input.nextInt();
                                        setStudentCourseNo(student.get(j));
                                        setStudentData(student.get(j), name, address, gendre, age, level, course.get(course1-1), course.get(course2-1), course.get(course3-1), course.get(course4-1));
                                        System.out.println(" Succsseful operation");
                                    }
                                    else
                                    {
                                        System.out.println(" Please make sure of ID entered");
                                    }
                                    break;
                                case 5 :
                                    System.out.print(" Enter Instructor ID: ");
                                    id = input.nextInt();
                                    for( j = 0 ; j < instructor.size() ; j++)
                                    {
                                        find = findInstructor(instructor.get(j), id);
                                        if( find == true)
                                            break;
                                    }
                                    if( find == true)
                                    {
                                        System.out.print(" Enter instructor name: ");
                                        name = str2_input.nextLine();
                                        System.out.print(" Enter instructor address: ");
                                        address = str2_input.nextLine();
                                        System.out.print(" Enter instructor gendre: ");
                                        gendre = str2_input.nextLine();
                                        System.out.println(" Enter instructor age: ");
                                        age = input.nextInt();
                                        System.out.println(" chooce 1 of the following courses:");
                                        for ( i = 0 ; i < course.size() ; i++)
                                        {
                                            System.out.print((i+1)+"- ");
                                            printCourse(course.get(i));
                                        }
                                        System.out.println(" Enter Course name: ");
                                        courseName = str_input.nextLine(); 
                                        
                                        setInstructorData(instructor.get(j), courseName, name, address, gendre, age);
                                        
                                         System.out.println(" Succsseful operation");
                                    }
                                    else
                                    {
                                        System.out.println(" Please make sure of ID entered");
                                    }
                                    break;
                                case 6:
                                    System.out.println(" ----------------------\n");
                                    for(i = 0 ; i < 5 ; i++)
                                    {
                                        System.out.println(" Level "+(i+1));
                                        for(j = 0 ; j < student.size() ; j++)
                                        {
                                            if( student.get(j).getLevel() == (i+1))
                                            {
                                                printStudentData(student.get(j));
                                                System.out.println(" ------------- ");
                                            }
                                        }
                                        System.out.println("************************************\n");
                                    }
                                    break;
                                case 7:
                                    for( i = 0 ; i < instructor.size() ; i++)
                                    {
                                        System.out.println(" ----------------------\n");
                                        printInstructorData(instructor.get(i));
                                        
                                    }
                                    break;
                                case 8:
                                    System.out.print(" Enter student ID: ");
                                    id = input.nextInt();
                                    for( j = 0 ; j < student.size() ; j++)
                                    {
                                        find = findStudent(student.get(j), id);
                                        if( find == true)
                                            break;
                                    }
                                    if( find == true)
                                    {
                                        student.remove(j);
                                        System.out.println(" Removed Successfully");
                                    }
                                    else
                                    {
                                        System.out.println(" Please make sure of ID entered");
                                    }
                                    break;
                                case 9:
                                    System.out.print(" Enter Instructor ID: ");
                                    id = input.nextInt();
                                    for( j = 0 ; j < instructor.size() ; j++)
                                    {
                                        find = findInstructor(instructor.get(j), id);
                                        if( find == true)
                                            break;
                                    }
                                    if( find == true)
                                    {
                                        instructor.remove(j);
                                        System.out.println(" Removed Successfully");
                                    }
                                    else
                                    {
                                        System.out.println(" Please make sure of ID entered");
                                    }
                                    break;
                                case 10:
                                    System.out.println(" Exiting....");
                                    innerFlag = false ;
                                    break;
                                default:
                                    System.out.println(" Wrong number ! , Try again");
                                    break;
                                     
                            }
                        }
                        
                    }
                    else
                    {
                        System.out.println(" Wrong login email or id ! ,try again");
                    }
                    break;
                case 2:
                    System.out.print(" Enter ID: ");
                    id = input.nextInt();
                    for( j = 0 ;  j < student.size() ; j++)
                    {
                        find = findStudent(student.get(j), id);
                        if (find == true)
                                break;
                    }
                    if( find == true)
                    {
                        while(innerFlag == true)   
                        {
                            System.out.println("***************************\n");
                            System.out.println("\n chooce one of the following: ");
                            System.out.println(" 1- Show all your info 2- Show feedback \n 3- Show grades 4-Exit");
                            System.out.print(" Choice: ");
                            innerChoice = input.nextInt();
                            switch(innerChoice)
                            {
                                case 1:
                                    printStudentData(student.get(j));
                                    break;
                                case 2:
                                    printStudentFeedback(student.get(j));
                                    break;
                                case 3:
                                    printStudentGrades(student.get(j));
                                    break;
                                case 4:
                                    System.out.println(" Exiting....");
                                    innerFlag = false ;
                                    break;
                                default:
                                    System.out.println(" Wrong number ! , Try again");
                                    break;
                            }
                        }
                    }
                    else
                    {
                      System.out.println(" Please make sure of ID entered");  
                    }
                    break;
                case 3 :
                    System.out.print(" Enter ID: ");
                    id = input.nextInt();
                    for( j = 0 ;  j < instructor.size() ; j++)
                    {
                        find = findInstructor(instructor.get(j), id);
                        if (find == true)
                                break;
                    }
                    if( find == true)
                    {
                        while(innerFlag == true)   
                        {
                            System.out.println("***************************\n");
                            System.out.println("\n chooce one of the following: ");
                            System.out.println(" 1- Show all your info 2- Student assessment 3-Exit");
                            System.out.print(" Choice: ");
                            innerChoice = input.nextInt();
                            switch(innerChoice)
                            {
                                case 1:
                                    printInstructorData(instructor.get(j));
                                    break;
                                case 2:
                                    System.out.print(" Enter student ID: ");
                                    id = input.nextInt();
                                    for( j = 0 ;  j < student.size() ; j++)
                                    {
                                        find = findStudent(student.get(j), id);
                                        if (find == true)
                                                break;
                                    }
                                    if (find == true)
                                    {
                                        System.out.println(" chooce one of the following courses:");
                                        printStudentCourses(student.get(j));
                                        System.out.print(" Course no: ");
                                        course1 =  input.nextInt(); 
                                        if ( course1 < 4 )  
                                        {
                                            System.out.print(" Enter student grade: ");
                                            grade = input.nextInt();
                                            System.out.print(" Enter student feedback: ");
                                            feedback = str_input.nextLine();
                                            setStudentGrade(student.get(j), course1-1, grade);
                                            setStudentFeedback(student.get(j), course1-1, feedback);
                                        }
                                        else
                                        { 
                                            System.out.println(" chooce from 1 to 4 !!");
                                        }
                                    }
                                    else
                                    {
                                       System.out.println(" Please make sure of ID entered");   
                                    }
                                    break;
                                case 3:
                                    System.out.println(" Exiting....");
                                    innerFlag = false ;
                                    break;
                                default:
                                    System.out.println(" Wrong number ! , Try again");
                                    break;
                            }
                            
                        }
                    }
                    else
                    {
                       System.out.println(" Please make sure of ID entered"); 
                    }
                    break;
                case 4:
                    System.out.println(" Goodbye , see you soon ! ");
                    flag = false;
                    break;
                default:
                    System.out.println(" Wrong number ! , try again");
                    break;
            }
            System.out.println("\n");
        }
    }
    
}
