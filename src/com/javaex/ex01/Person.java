package com.javaex.ex01;

public class Person {
	
	
	//필드
	protected String name;
	protected String hp;
	
	//생성자
	public Person() {};
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp =hp;
	}
	
	//메소드 getter setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//일반메소드
	
	public void showInfo() {
		System.out.println("#이름: " + name + ",  #핸드폰: " + hp);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + "]";
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
