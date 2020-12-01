package com.javaex.ex05;

public class Depart extends Employee {

	
	 //필드
	 private String department;

	 //생산자
	 
	 public Depart() {
		super();
	 }

	 public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	 }
	 
	 
	 //일반 메소드
	 
	 public void showInformation() {
		 System.out.println("이름:" + getName() + "  연봉:" + getSalary() + "  부서:" + department );
	 }
	 
	 
	 



	 
	 
	 
	 

}
