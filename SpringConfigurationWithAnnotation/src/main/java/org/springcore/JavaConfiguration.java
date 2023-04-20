package org.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.springcore")
public class JavaConfiguration {

    @Bean
    public Samosa getSamosa(){

        return  new Samosa();
    }

    @Bean(name = {"student","temp","con"})
    public Student getStudent(){ // default name of bean is getStudent
        Student student = new Student(getSamosa());
        return student;
    }

}
