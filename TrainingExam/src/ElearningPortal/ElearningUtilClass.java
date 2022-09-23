package ElearningPortal;

import java.util.ArrayList;
import java.util.HashSet;


public class ElearningUtilClass {

    static ArrayList<Course> coursesList=new ArrayList<>();
    public static ArrayList<Course> getCoursesList()
    {
        coursesList.add(new Course("Electrical","Kutti"));
        coursesList.add(new Course("Mechanical","Agraval"));
        coursesList.add(new Course("computer","Shinde"));
        coursesList.add(new Course("chemical","jadhav"));
        return coursesList;

    }
}
