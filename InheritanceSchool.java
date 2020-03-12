package myfirstproject;
import java.util.Scanner;

class School
{
    String stuName, stuDOB, stuClass, stuAddress;
    int stuFees;
    
    void getAdmission()
    {
        System.out.println("Please enter student name, date of birth, class & address");
        Scanner s = new Scanner(System.in);
        stuName = s.next();
        stuDOB = s.next();
        stuClass = s.next();
        stuAddress = s.next();
    }
    
    void getFees()
    {
        System.out.println("Please enter fees");
        Scanner s = new Scanner(System.in);
        stuFees = s.nextInt();
    }
    
    void displayAdmissionAndFees()
    {
        System.out.println("Student name: " + stuName + "\nDate of Birth: " + stuDOB 
                + "\nClass: " + stuClass + "\nAddress: " + stuAddress + "\nFees" + stuFees);
    }
}

public class InheritanceSchool extends School {
    String teachName, teachDOB, teachQualification, teachSubject;
    String homeworkMath, homeworkEnglish, homeworkScience, homeworkHistory;
    String syllabusMath, syllabusEnglish, syllabusScience, syllabusHistory;
    Scanner s = new Scanner(System.in);
    
    void getTeacher()
    {
        System.out.println("Please enter teacher name, date of birth, qualification & subject");
        teachName = s.next();
        teachDOB = s.next();
        teachQualification = s.next();
        teachSubject = s.next();
    }
    
    void getHomework()
    {
        System.out.println("Please enter math, english, science & history homework");
        homeworkMath = s.next();
        homeworkEnglish = s.next();
        homeworkScience = s.next();
        homeworkHistory = s.next();
    }
    
    void getSyllabus()
    {
        System.out.println("Please enter math, english, science & history syllabus");
        syllabusMath = s.next();
        syllabusEnglish = s.next();
        syllabusScience = s.next();
        syllabusHistory = s.next();
    }
    
    void diplayTeacherHomeworkSyllabus()
    {
        System.out.println("Teacher name: " + teachName + "\nDate of Birth: " + teachDOB 
                + "\nQualification: " + teachQualification + "\nSubject: " + teachSubject);
        
        System.out.println("Math Syllabus: " + syllabusMath + "\nEnglish Syllabus: " + syllabusEnglish 
                + "\nScience Syllabus: " + syllabusScience + "\nHistory Syllabus: " + syllabusHistory);
        
        System.out.println("Math Homework: " + homeworkMath + "\nEnglish Homework: " + homeworkEnglish 
                + "\nScience Homework: " + homeworkScience + "\nHistory Homework: " + homeworkHistory);
        
    }
    
    
    public static void main(String[] arg)
    {
        InheritanceSchool obj = new InheritanceSchool();
        obj.getAdmission();
        obj.getFees();
        obj.getTeacher();
        obj.getHomework();
        obj.getSyllabus();
        obj.displayAdmissionAndFees();
        obj.diplayTeacherHomeworkSyllabus();
    }
}
