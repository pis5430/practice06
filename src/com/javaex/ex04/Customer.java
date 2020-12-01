package com.javaex.ex04;

public class Customer extends User {

	
	//필드
	private int point;

	
	//생성자
	public Customer() {
		super();
	}

	public Customer(int point) {
		super();
		this.point = point;
	}
	

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	//메소드 getter setter

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//일반메소드 
	
	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password+ ", #이름:" + name + ", #포인트:" + point);
	}

	@Override
	public String toString() {
		return "Customer [point=" + point + "]";
	}
	
	
	
	
	

}
