package com.springcore.ci;
import java.util.List;
public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;
	
	public Person(String name, int personId, Certi certi,List<String> list) {
		//super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.list = list;
	}


	//@Override
	//public String toString() {
		//return "Person [name=" + name + ", personId=" + personId + "]";
	//}


	@Override
	public String toString() {
		return this.name + " : "+this.personId +" : "+this.certi+ " : "+this.list;
		//return "Person [name=" + name + ", personId=" + personId + "]";
	}
	
	
	
	
	
	
	
	
}
