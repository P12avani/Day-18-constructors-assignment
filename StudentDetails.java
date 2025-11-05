package com.codegnan.oopexamples;

public class StudentDetails {
          String name;
          int rollNumber;
          int[] marks=new int[3];
          
          public StudentDetails() {
        	   name ="unknown";
        	   rollNumber=0;
        	  marks[0]=0;
        	  marks[1]=0;
        	  marks[2]=0;
          }
       public StudentDetails(String name,int rollNumber,int[] marks) {
    	   this.name=name;
    	   this.rollNumber=rollNumber;
    	   this.marks=marks;
	  
        	  }
        	  public void display() {
        		  System.out.println("Name:"+name);
        		  System.out.println("roll number:"+rollNumber);
        		  System.out.println("Marks:");
        		  for(int i=0;i<marks.length;i++) {
        			  System.out.print(marks[i] + " ");
        	        }
        	        System.out.println();
        	    }
        	  int calculateTotal() {
        	        int total = 0;
        	        for (int mark : marks) {
        	            total += mark;
        	        }
        	        return total;
        	    }
        	  double calculateAverage() {
        	        return (double) calculateTotal() / marks.length;
        	    }
        	
           public static void main(String[] args) {	
        	   StudentDetails s1 = new StudentDetails();
        	   int[] marks = {85, 90, 80};
               StudentDetails s2 = new StudentDetails("Pavani", 101, marks);
               
               System.out.println("=== Student 1 Details ===");
               s1.display();
               System.out.println("Total Marks: " + s1.calculateTotal());
               System.out.println("Average Marks: " + s1.calculateAverage());

               System.out.println("\n=== Student 2 Details ===");
               s2.display();
               System.out.println("Total Marks: " + s2.calculateTotal());
               System.out.println("Average Marks: " + s2.calculateAverage());
           }
       }
           
        		  
        	  
        	  
          

