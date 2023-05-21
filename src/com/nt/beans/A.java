package com.nt.beans;
public class A {
private B b;
public A() {
	System.out.println("A.0 param contructor");
}
public void setB(B b) {
	System.out.println("A.setB()");
	this.b = b;
}
@Override
public String toString() {
	return "From A";
}

}
