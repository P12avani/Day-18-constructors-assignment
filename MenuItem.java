package com.codegnan.oopexamples;
import java.util.Scanner;
public class MenuItem {
	String name;
	double price;
	String category;
	public MenuItem(String name,double price,String category)throws Exception{
		if(name==null||name.trim().isEmpty()) {
			throw new Exception("Name and Category must not be empty or null");
	}
		if(price<=0) {
			throw new Exception("Price must be positive");
		}
		this.name=name;
		this.price=price;
		this.category=category;
	}
	public String display() {
		return String.format("Name:" +name+ ",Price:" +price+ ",Category:" +category);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		double price=scanner.nextDouble();
		scanner.nextLine();
		String category=scanner.nextLine();
		try {
			MenuItem mt=new MenuItem(name,price,category);
			System.out.println(mt.display());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	}


	
