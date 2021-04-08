package com.noeltoy.udemy.webservices.restwebservices.controllers.helloworld;

import com.noeltoy.udemy.webservices.restwebservices.model.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //GET
    //URI /hello-world
    //method helloWorld
    @GetMapping(path = "hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean("Hello World, "+name);
    }
}
