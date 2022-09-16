package EmplyeeMgm;

import java.util.Scanner;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Employee[] eArr=new Employee[3];

for(int i=0;i<eArr.length;i++) 
{
       System.out.println("Enter Employee Details");
           eArr[i]=new Employee(sc.next(),sc.nextInt(),sc.nextInt());
}

for(int i=0;i<eArr.length;i++)
{
   for(int j=i+1;j<eArr.length;j++)
   {
	  if(eArr[i].getExp()<eArr[j].getExp()) 
	  {
		  Employee e=eArr[j];
		  eArr[j]=eArr[j];
		  eArr[i]=e;
	  }
   }	

   for(i=0;i<eArr.length;i++)
   {
	   System.out.println(eArr[i]);
   }
   
   
   sc.close();
   
}



	}
	
}
	
	
