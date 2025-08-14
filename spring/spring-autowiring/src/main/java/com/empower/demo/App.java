package com.empower.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empower.demo.beans.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Car car= (Car) ctx.getBean("car");
    	car.playMusic();
        
    }
}
