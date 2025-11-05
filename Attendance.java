package com.codegnan.oopexamples;
import java.util.Scanner;
public class Attendance {
            int id;
         String name;
        String status;
        public Attendance(int id,String name,String status)throws Exception{
        	if(id<=0) {
        		throw new Exception("Id must be positive");
        	}
        	if(name==null||name.trim().isEmpty()) {
        		throw new Exception("Name must not be empty or null");
        	}
        	if (!status.equalsIgnoreCase("present") && !status.equalsIgnoreCase("absent")) {
                throw new Exception("Status must be either Present or Absent");
        				
        	}
        	this.id=id;
        	this.name=name;
        	this.status=status;
        }
        public void displayAttendance() {
        System.out.println("ID:" +id+ ",Name:" +name+ ",Status:" +status);
        }
        public static void main(String[] args)throws Exception{
        	Scanner scanner=new Scanner(System.in);
        	int id=scanner.nextInt();
        	scanner.nextLine();
        	String name=scanner.nextLine();
        	String status=scanner.nextLine();
        	try {
        		Attendance a1=new Attendance(id,name,status);
        		a1.displayAttendance();
        	}catch(Exception e) {
        		System.out.println("Error:"+e.getMessage());
        	}
        	scanner.close();
        }
        
 
}
