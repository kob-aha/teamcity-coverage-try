package org.edu.ka;

public class HelloWorldService {

    private final String name;

    public HelloWorldService(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.name);
    }

}
