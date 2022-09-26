package Qution1;

import java.util.Map;
import java.util.TreeMap;

public class StudentMapMain {
    public static void main(String[] args) {
        Map<Integer,StudentInfo> StudentInfoMap=new TreeMap<Integer,StudentInfo>();
        StudentInfoMap.put(101,new StudentInfo(1,"Ajay",51));
        StudentInfoMap.put(103,new StudentInfo(2,"Shivaji",52));
        StudentInfoMap.put(104,new StudentInfo(3,"Sanket",54));
        StudentInfoMap.put(102,new StudentInfo(4,"Ali",53));
        for(int n :  StudentInfoMap.keySet())
        {
            StudentInfo stud=  StudentInfoMap.get(n);
            if(stud.getName().startsWith("S") || stud.getName().startsWith("s"))
                System.out.println(stud);
        }




    }
}
