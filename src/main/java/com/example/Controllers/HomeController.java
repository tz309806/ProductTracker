package com.example.Controllers;

import com.example.models.ActorTableSample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


    protected int number;
    private String hello;
    private double currency;

    @Autowired
    private ActorSampleServiceImpl actorSampleService;


    private HomeController(ActorSampleServiceImpl actorSampleService) {
        this.actorSampleService = actorSampleService;
    }

    @RequestMapping(value = "/firstname", method = RequestMethod.GET)
    public ActorTableSample index() {
//        final List<ActorTableSample> sample = new ArrayList<>();
//        ActorTableSample name = actorSampleService.findById(1);
        final ActorTableSample actorTableSample = new ActorTableSample();
        actorTableSample.setFirstName("Biatch");
//        ActorTableSample actorTableSample = this.actorSampleService.findById(1);
//        return "index";
        return actorTableSample;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
