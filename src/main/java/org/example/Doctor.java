package org.example;

import org.springframework.stereotype.Component;

public class Doctor implements Staff {
    public void assist(){
        System.out.println("The doctor is assisting");
    }
}
