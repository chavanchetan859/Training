package ElearningPortal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import static ElearningPortal.ElearningUtilClass.getCoursesList;

public class ElearningMain {


    public static void main(String[] args) throws CustomeExceptionHandling {
        Scanner scan = new Scanner(System.in);

        ArrayList<Course> coursesArrayList = getCoursesList();
        HashMap<Integer, Student> StudentMaps = new HashMap<>();
        int i = 0;
        while (i != 1) {
            System.out.println("Enter Details\n1 ,Add Course,2 Add student,3.view course 4.view  student" + "Exit");

            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter coursedetails, couraname and trainer respectively");
                    coursesArrayList.add(new Course(scan.next(), scan.next()));
                    break;

                case 2:
                    System.out.println("Enter student details enrollment no,studentname and course");
                    int enrollmentid = scan.nextInt();
                    String studentname = scan.next();
                    System.out.println("How many courses ");
                    Course[] CoursesArray = new Course[scan.nextInt()];
                    System.out.println("Select course from list");
                    Iterator<Course> itr=coursesArrayList.iterator();
                    int courseOption;
                    while(itr.hasNext())

                    for (int j = 0; j < CoursesArray.length; j++) {
                        System.out.println("Enter course number");
                        courseOption = scan.nextInt() - 1;
                        if (courseOption > CoursesArray.length)
                            throw new CustomeExceptionHandling("select correct course number");
                        else
                            CoursesArray[j] = coursesArrayList.get(courseOption);
                        }
                        if(StudentMaps.containsKey(enrollmentid))
                            throw new CustomeExceptionHandling("You have selected already registered student");
                        else
                            StudentMaps.put(enrollmentid, new Student(enrollmentid, studentname, CoursesArray));
                         break;
                case 3:
                    System.out.println("Student availiable courses list here");
                    Iterator<Course> itr1 = coursesArrayList.iterator();
                    while (itr1.hasNext())
                        System.out.println(itr1.next());
                    break;
                case 4:
                    System.out.println("Registered Students in elearning portal ");
                    for (Student studentdetails : StudentMaps.values())
                        System.out.println(studentdetails);
                    break;
                case 5:
                    i = 1;
                    break;
                default:
                    throw new CustomeExceptionHandling("You have to select correct option");
            }
        }
    }
}