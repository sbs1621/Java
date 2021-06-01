package base; //base패키지

public class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}
----------------------------------------------------------------------------------
package derived; /derived패키지

import base.Shape;//base패키지의 Shape클래스를 가져옴

public class Circle extends Shape{//Circle클래스는 Shape클래스를 상속받음
	public void draw() {System.out.println("Circle");}
}
----------------------------------------------------------------------------------
package app; //app패키지

import base.Shape;//base패키지의 Shape클래스를 가져옴
import derived.Circle;//derived패키지의 Circle클래스를 가져옴

public class GraphicEdtior{
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
