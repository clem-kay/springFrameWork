package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Nurse implements Staff {
    private String quaification;

    @Override
    public String toString() {
        return "Nurse{" +
                "quaification='" + quaification + '\'' +
                '}';
    }

    public String getQuaification() {
        return quaification;
    }

    public void setQuaification(String quaification) {
        this.quaification = quaification;
    }

    @Override
    public void assist() {
        System.out.println("Nurse is assisting");
    }
}
