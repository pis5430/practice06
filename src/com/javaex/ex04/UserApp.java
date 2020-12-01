package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		
		
		User[] pArray = new User[3]; //배열 개수 선언
		
		//배열 안에 넣어줄 변수 선언
		
		User c01 = new Customer("jws","j1234","정우성", 1000);
		User c02 = new Customer("yjs","y2345","이효리", 2000);
		User e01 = new Employee("master","m7788","운영자", 5000000);
		
		pArray[0] = c01;
		pArray[1] = c02;
		pArray[2] = e01;
		
		
		
		for(int i=0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
		
		
		System.out.println("운영자의 월급은" + ((Employee)pArray[2]).getSalary()+" 입니다.");
		System.out.println("운영자의 월급은" + ((Employee)e01).getSalary()+" 입니다.");
	}

}
