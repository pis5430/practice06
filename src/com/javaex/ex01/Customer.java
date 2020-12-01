package com.javaex.ex01;

public class Customer extends Person{

	//필드
	
	private int cNo; // 고객번호
	private int point; //포인트 점수

	//생성자
	
	protected Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	
	//메소드 getter setter
	
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//일반메소드
	public void showInfo() {
		System.out.println("#이름: "+name+",  #핸드폰: "+hp+",  #고객번호: "+cNo+",  #포인트점수: "+point);
	}


	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + ", name=" + name + ", hp=" + hp + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
