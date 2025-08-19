package com.empower.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.empower.demo.config.MyConfguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfguration.class);
        JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
        int no = jt.update("INSERT INTO PRODUCT VALUES(1234,'Upma','Break Fast',200.0)");
        System.out.println(no+" row(s) inserted");
    }
}
