package com.dev.inheritance;

public class ChildClass extends ParentClass{

	public ChildClass() {
									//if we dont declare super then compliler will implicitely write super and super calls default constructor
	}
public void addition() {
	super.addition(10,30);
	super.addition((int) 20.5, 12);
}
	
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
	cc.addition();
	}

}
