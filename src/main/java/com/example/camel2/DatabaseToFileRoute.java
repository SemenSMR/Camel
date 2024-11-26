package com.example.camel2;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DatabaseToFileRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://readDatabase?repeatCount=1&delay=10000")
                .setBody(constant("SELECT * FROM employees"))
                .to("jdbc:dataSource")
                .marshal().json()
                .to("file:output?fileName=employees.json&fileExist=Append");
    }
}
