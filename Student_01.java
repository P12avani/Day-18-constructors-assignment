package com.codegnan.oopexamples;
import java.util.Scanner;
public class Student_01 {
		String name;
		int rollNumber;
		int grade;
		public Student_01(String name,int rollNumber,int grade) throws Exception {
			if(name.equals("null")||name.trim().isEmpty()) {
				//System.out.println("Name cannot be empty or null");
				throw new Exception("Name cannot be empty or null");
			}if(rollNumber<=0) {
				//System.out.println("Roll Number must be positive");
				throw new Exception("Roll Number must be positive");
			}if(grade<1||grade>12) {
				//System.out.println("Grade level must be between 1 to 12");
				throw new Exception("Grade level must be between 1 to 12");
			}
			this.name=name;
			this.rollNumber=rollNumber;
			this.grade=grade;

	}
		public String showProfile(){
			return "Name :"+name+",Roll Number :"+rollNumber+",Grade:"+grade;
		}
		public static void main(String[] args) throws Exception {
			Scanner scanner=new Scanner(System.in);
			String name=scanner.next();
			int rollNumber=scanner.nextInt();
			int grade=scanner.nextInt();
			Student_01 s1=new Student_01(name,rollNumber,grade);
			System.out.println(s1.showProfile());
		}
		

}
