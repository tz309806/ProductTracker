package com.example.Controllers;

import com.example.models.ActorDAO;
import com.example.models.ActorTableSample;
import org.springframework.beans.factory.annotation.Autowired;

public class ActorSampleServiceImpl implements ActorSampleService {

    private ActorDAO actorDAO;

    @Autowired
    public ActorSampleServiceImpl(ActorDAO actorDAO){
        this.actorDAO=actorDAO;
    }

    @Override
    public ActorTableSample findById(int Id) {
        return this.actorDAO.findById(Id);
    }
}
