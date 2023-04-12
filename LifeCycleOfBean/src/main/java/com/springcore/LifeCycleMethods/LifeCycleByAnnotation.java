package com.springcore.lifecyclemethods;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class LifeCycleByAnnotation {



    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LifeCycleByAnnotation() {
        super();
    }

    @Override
    public String toString() {
        return "LifeCycleByAnnotation{" +
                "subject='" + subject + '\'' +

                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("lifecycle method by annotation , it is init() ");
    }

    @PreDestroy
    public void end(){
        System.out.println("lifecycle method by annotation, it is destroy()");

    }

}
