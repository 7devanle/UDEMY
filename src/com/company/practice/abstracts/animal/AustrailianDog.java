package com.company.practice.abstracts.animal;

public class AustrailianDog extends Dog{
    public AustrailianDog(String name) {
        super(name);
    }

    @Override
    public void mate() {
        System.out.println("I only mate with German dogs");
    }
}
