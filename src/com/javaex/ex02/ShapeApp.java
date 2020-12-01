package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println(s1.toString());
		System.out.println("================");
		

		
		Triangle t1 = new Triangle();
		System.out.println(s1.toString());
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println(t2.toString());
		System.out.println("================");
		// 생성자에서 super에다가 color값을 넣어줌 
		// int int 순서대로 기입하면 고정된 색이 넣어짐

		
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println(t3.toString());
		System.out.println("================");
		
		//String String /String String int int 에서 String이 겹쳐서 
		//생성자 Shape(2) 이 먼저 실행됨
		
		
		
		
	}

}

