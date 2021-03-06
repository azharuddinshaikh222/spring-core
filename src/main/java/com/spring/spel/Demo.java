package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+78}")
 private int x;
	@Value("#{2+89+90}")
	private int y;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + "]";
}
 
}
