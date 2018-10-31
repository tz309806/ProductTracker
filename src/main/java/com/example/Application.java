package com.example;

import com.example.Controllers.ActorSampleService;
import com.example.models.ActorTableSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.List;


@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class Application {

    @Autowired
    ActorSampleService actorSampleService;


    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(Application.class);
//        app.run(args);
        SpringApplication.run(Application.class, args);
    }

//    @Override
//    public void run(String... args) {
//
//        ActorTableSample actorTableSample = this.actorSampleService.findById(1);
////        ActorTableSample actorTableSample = this.actorSampleService.findByFirstName("JENNIFER");
//        System.out.println("Params are : " + actorTableSample.getFirstName()+ " " + actorTableSample.getLastName()+actorTableSample.getLastUpdated() );
//
//    }
}
