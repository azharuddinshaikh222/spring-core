package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
@Value("Azhar shaikh")	
private String name;
@Value("Mumbai")
private String city;
@Value("#{temp}")
private List<String> address;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + "]";
}

}
