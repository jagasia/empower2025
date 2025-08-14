package com.empower.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
    	Book book =(Book) ctx.getBean("b1");
//    	book.setId(56L);
//    	book.setTitle("You can win");
//    	book.setAuthor("Shiv Khera");
//    	book.setPrice(105.0);
    	
    	System.out.println(book);
        System.out.println( "Hello World!" );
    }
}
