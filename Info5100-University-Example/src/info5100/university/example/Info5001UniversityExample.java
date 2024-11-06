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
    

    }

}
