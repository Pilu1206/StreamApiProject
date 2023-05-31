package com.springcore.ci;

public class Person {
	private int persomId;
	private String name;
	private Certi certi;
public Person(int personId,String Name,Certi certi) {
	this.persomId =personId;
	this.name=name;
	this.certi=certi;
}
@Override
public String toString() {
	
	return this.persomId +" : "+this.name+"{"+this.certi+" }";
}
}