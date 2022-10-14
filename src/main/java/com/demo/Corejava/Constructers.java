package com.demo.Corejava;


public class Constructers {

	

	int id;
	String name;
	double AccountNo;
	Float salary;
	long phoneno;
	
	

// default constructer
public Constructers() {
		super();
		// TODO Auto-generated constructor stub
	}

public Constructers(int id,String name) {
	super();
}
 



public Constructers(int id, String name, double accountNo, Float salary, long phoneno) {
		super();
		this.id = id;
		this.name = name;
		AccountNo = accountNo;
		this.salary = salary;
		this.phoneno = phoneno;
	}



public static void main(String[] args) {
	
}
}