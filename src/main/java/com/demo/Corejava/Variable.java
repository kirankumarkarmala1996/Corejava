package com.demo.Corejava;

public class Variable {
	int id= 10;// instance variable
	 static String name="kiran";  // static variable
	 
	 static void m1() {
		 int num=100;// Local variable
		 System.out.println(num);
	 }
	
	public static void main(String[] args) {
		Variable ve = new Variable();
		//here we the the variable in three ways
		System.out.println(ve.id);//using object
		m1();//using static method
		System.out.println(name);// using static variable
	}

}
