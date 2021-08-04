package com.example.education.xml_dependency_injection;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("inicialization");
    }

    public void doMyDestroy() {
        System.out.println("destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
