package com.springcore.standalone.collections;

import java.util.List;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Properties property;
	
	

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	
	
	
	
}
