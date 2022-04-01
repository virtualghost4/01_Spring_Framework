package com.virtualghost4;


import com.virtualghost4.beans.Mundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world with XML
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Mundo m = (Mundo) applicationContext.getBean("mundo");
        System.out.println(m.getSaludo());
    }
}
