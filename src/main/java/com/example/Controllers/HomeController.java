package com.example.Controllers;

import com.example.Repository.ActorSampleServiceImpl;
import com.example.models.ActorTableSample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


    protected int number;
    private String hello;
    private double currency;

    @Autowired
    private ActorSampleServiceImpl actorSampleServiceImp;


    private HomeController(ActorSampleServiceImpl actorSampleServiceImp) {
        this.actorSampleServiceImp = actorSampleServiceImp;
    }

    @RequestMapping(value = "/firstname", method = RequestMethod.GET)
    public List<ActorTableSample> actorsFirstName() {
//        final List<ActorTableSample> sample = new ArrayList<>();
//        ActorTableSample name = actorSampleService.findById(1);
        List<ActorTableSample> actorTableSample = new ArrayList<>();
        actorTableSample = actorSampleServiceImp.findAllById(3);
//        ActorTableSample actorTableSample = this.actorSampleService.findById(1);
//        return "index";
        return actorTableSample;
    }

    @RequestMapping(value = "/actors/create", method = RequestMethod.POST)
    public int postActor(@RequestBody ActorTableSample actorTableSample) {
        int _actorTableSample = actorSampleServiceImp.addNewActor(actorTableSample.getId(), actorTableSample.getFirstName(), actorTableSample.getLastName(), actorTableSample.getLastUpdated());
        return _actorTableSample;
    }
}
