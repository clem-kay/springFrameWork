package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor staff = context.getBean(Doctor.class);
        staff.assist();


        Nurse nurse = context.getBean(Nurse.class);
        nurse.setQuaification("Community Nurse");
        nurse.assist();
        System.out.println(nurse);

        Nurse nurse1 = context.getBean(Nurse.class);
        nurse1.setQuaification("university");
        nurse.assist();
        System.out.println(nurse1);
        }
}