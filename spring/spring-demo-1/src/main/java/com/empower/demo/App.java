package com.empower.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empower.demo.beans.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Book b1=ctx.getBean(Book.class);
    	System.out.println(b1);
        
    }
}
