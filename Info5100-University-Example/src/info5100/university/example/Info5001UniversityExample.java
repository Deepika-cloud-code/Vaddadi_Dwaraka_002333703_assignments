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
        
         
        //Manage student course registrations. Students register for classes.
        ArrayList<String> Student_ID_List=new ArrayList<>();
        Student_ID_List.add("stu1");
        Student_ID_List.add("stu2");
        Student_ID_List.add("stu3");
        Student_ID_List.add("stu4");
        Student_ID_List.add("stu5");
        Student_ID_List.add("stu6");
        Student_ID_List.add("stu7");
        Student_ID_List.add("stu8");
        Student_ID_List.add("stu9");
        Student_ID_List.add("stu10");
        
         for(int i=0;i<10;i++){
            PersonDirectory pd = department.getPersonDirectory();
            Person student = pd.newPerson(Student_ID_List.get(i));
            StudentDirectory sd = department.getStudentDirectory();
            StudentProfile studentprofile = sd.newStudentProfile(student);
            CourseLoad courseload = studentprofile.newCourseLoad("Fall2024");
            //1st registration of course by a student
            Seat seat=new Seat(CO_List.get(0), 10);
            SeatAssignment sa=new SeatAssignment(courseload, seat);
            sa.GetCourseStudentScore();
            //register student in class
            courseload.newSeatAssignment(CO_List.get(0)); 
            courseload.registerStudent(sa);
            int credit_1=sa.getCreditHours();
            int price1=course.getCoursePrice();
            //System.out.println(sa.getCreditHours());
            //2nd registration of course by a student
            seat=new Seat(CO_List.get(i), 10);
            sa=new SeatAssignment(courseload, seat);
            sa.GetCourseStudentScore();
            courseload.newSeatAssignment(CO_List.get(i)); //register student in class
            courseload.newSeatAssignment(CO_List.get(i));
            courseload.registerStudent(sa);
            int credit_2=sa.getCreditHours();
            int price2=course.getCoursePrice();
            double min = 0.001;
            double max = 0.005;
            //generating random values between 0.001 and 0.005 and adding it to grades, 
            //to generate different grades to different students
            double randomValue = min + (Math.random() * (max - min));
            sa.grade=(double)3.80+randomValue;
            double grade1=sa.grade;
            sa.grade=(float)3.90+randomValue;
            double grade2=sa.grade;
            
            System.out.println("Student"+" "+(i+1)+" Details:");
            System.out.println("-----------------");
            System.out.println("StudentID:"+student.getPersonName());
            if(i==0){
                System.out.println("Courses Taken:"+CO_List.get(0).getSubjectCourse().getCourseName()+" & "+CO_List.get(i+2).getSubjectCourse().getCourseName());
            }
            else{
                System.out.println("Courses Taken:"+CO_List.get(0).getSubjectCourse().getCourseName()+" & "+CO_List.get(i).getSubjectCourse().getCourseName());
            }
            if(i==0)
                System.out.println("Faculty handling the courses:"+FP_List.get(0).getPerson().getPersonName()+" and "+FP_List.get(2).getPerson().getPersonName()+" respectively.");
            else
                System.out.println("Faculty handling the courses:"+FP_List.get(0).getPerson().getPersonName()+" and "+FP_List.get(i).getPerson().getPersonName()+" respectively.");
               
            System.out.println("Grade Obtained in "+CO_List.get(i).getSubjectCourse().getCourseName()+" is "+grade1);
            System.out.println("Grade Obtained in "+CO_List.get(i).getSubjectCourse().getCourseName()+" is "+grade2);
            System.out.println("Average CGPA for semester :"+(grade1+grade2)/2);
            System.out.println("credit hours for both respectively are :"+credit_1+" & "+credit_2);
            System.out.println("Course price per credit hour:"+course.price);
            System.out.println("Tuition fees for the semester: "+(price1+price2));
            System.out.println("==========================================================");
        }

    }

}
