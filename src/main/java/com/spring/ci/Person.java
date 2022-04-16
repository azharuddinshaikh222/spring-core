package com.spring.ci;

public class Person {
private String name;
private int PersonId;
private Certi certi;

public Person(String name,int PersonId,Certi certi)
{
	this.name=name;
	this.PersonId=PersonId;
	this.certi=certi;
}

@Override
public String toString() {
	return this.name+" :"+this.PersonId+"{ "+this.certi.name+"}";
}

}
