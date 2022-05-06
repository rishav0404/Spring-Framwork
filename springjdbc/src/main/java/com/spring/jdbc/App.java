package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.Studentdao;
import com.spring.jdbc.entities.Student;

public class App 
{
    

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        //JdbcTemplate bean = context.getBean("jdbcTemplate" , JdbcTemplate.class);
        
        //String query = "insert into student(id,name,city) values(?,?,?)";
        
        //int result = bean.update(query,111,"Manish","Mumbai ");
        //System.out.println("number of record inserted..." +result);
        Studentdao imp = (Studentdao)context.getBean("dao");
        //INSERT
        Student s = new Student();
        s.setId(666);
        s.setName("Ram");
        s.setCity("Ayodhya");
        
        int s1 = imp.insert(s);
        System.out.println("Student addes" +s1);
        //UPDATE
        //Student s = new Student();
        //s.setId(666);
        //s.setName("Shyaam");
        //s.setCity("Mathura");
        
        //int c1 = imp.change(s);
        //System.out.println("Updated address is" +c1);
        
        //int result = imp.delete(666);
        //System.out.println("Deleted" +result);
        
        Student student = imp.getStudent(111);
        System.out.println(student);
        
        List<Student> students = imp.getAllStudent();
        System.out.println(students);
        
    }
}
