/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();
        
        
        //Manage the course catalog: browse and add courses
        Course course = coursecatalog.newCourse("Application Engineering", "info 5100", 4);
        Course course1 = coursecatalog.newCourse("OOPS", "info 5101", 4);
        Course course2= coursecatalog.newCourse("Cloud", "info 5102", 4);
        Course course3 = coursecatalog.newCourse("Python", "info 5103", 4);
        Course course4 = coursecatalog.newCourse("PromptEngg", "info 5104", 3);
        Course course5 = coursecatalog.newCourse("BigData", "info 5105", 4);
        Course course6 = coursecatalog.newCourse("DMDD", "info 5106", 4);
        Course course7 = coursecatalog.newCourse("WebDev", "info 5107", 1);
        Course course8 = coursecatalog.newCourse("ENCP", "info 5107", 1);
        Course course9 = coursecatalog.newCourse("PM", "info 5108", 3);
        coursecatalog.addCourse(course);
        coursecatalog.addCourse(course1);
        coursecatalog.addCourse(course2);
        coursecatalog.addCourse(course3);
        coursecatalog.addCourse(course4);
        coursecatalog.addCourse(course5);
        coursecatalog.addCourse(course6);
        coursecatalog.addCourse(course7);
        coursecatalog.addCourse(course8);
        coursecatalog.addCourse(course9);
    
         Degree degree=new Degree("Masters");
        degree.addCoreCourse(course);
        degree.addElectiveCourse(course7);
        degree.addElectiveCourse(course1);
        degree.addElectiveCourse(course2);
        degree.addElectiveCourse(course3);
        degree.addElectiveCourse(course4);
        degree.addElectiveCourse(course5);
        degree.addElectiveCourse(course6);
        degree.addElectiveCourse(course8);
        degree.addElectiveCourse(course9);
        
        System.out.println("This is the core course:\n"+course.getCourseName());
        System.out.println("These are the elective courses:");
        for(int i=0;i<9;i++){
        System.out.println(degree.getElectiveList().get(i).getCourseName());
        }//tried using the arrayList that is already defined in the degree class
        System.out.println();
        
          
        //Manage the course schedule: Create course schedule for new semester,
        //add course offers for courses, and assign teachers.
        ArrayList<String> faculty_Name_List=new ArrayList<>();
        faculty_Name_List.add("Daniel");
        faculty_Name_List.add("Tom");
        faculty_Name_List.add("Peters");
        faculty_Name_List.add("Hayley");
        faculty_Name_List.add("Leela");
        faculty_Name_List.add("Harry");
        faculty_Name_List.add("Liam");
        faculty_Name_List.add("Harry");
        faculty_Name_List.add("Daniel");
        faculty_Name_List.add("Leela");
        
        CourseSchedule courseschedule=department.newCourseSchedule("Fall2024");
        CourseOffer courseoffer=courseschedule.newCourseOffer("123");
        Person person=new Person("null");
        FacultyProfile fp=new FacultyProfile(person);
        ArrayList<FacultyProfile> FP_List=new ArrayList<FacultyProfile>();
        ArrayList<String> FC_List=new ArrayList<>();
        ArrayList<CourseOffer> CO_List=new ArrayList<CourseOffer>();
        for(int i=0;i<10;i++){
            courseschedule = department.newCourseSchedule("Fall2024");
            courseoffer = courseschedule.newCourseOffer(coursecatalog.courselist.get(i).getCOurseNumber());//parameter returns INFO5100
            CO_List.add(courseoffer);
            person=new Person(faculty_Name_List.get(i));
            fp=new FacultyProfile(person);
            FP_List.add(fp);
            FacultyAssignment fa=fp.AssignAsTeacher(courseoffer);
            FC_List.add(fa.getFacultyProfile().getPerson().getPersonName());
            System.out.println("Faculty professor "+faculty_Name_List.get(i)+" teaches this course:"+coursecatalog.courselist.get(i).getCourseName());
        }
        System.out.println();

    }

}