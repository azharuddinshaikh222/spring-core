package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/ci/configci.xml");
     Person p1=(Person)context.getBean("person12");
     System.out.println(p1);
}
}
