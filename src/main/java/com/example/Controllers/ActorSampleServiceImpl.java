package com.example.Controllers;

import com.example.models.ActorDAO;
import com.example.models.ActorTableSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class ActorSampleServiceImpl implements ActorSampleService {

    private ActorDAO actorDAO;

    @Autowired
    public ActorSampleServiceImpl(ActorDAO actorDAO){
        this.actorDAO=actorDAO;
    }

    @Override
    public ActorTableSample findById(int id) {
        return this.actorDAO.findById(id);
    }

    @Override
    public ActorTableSample findByFirstName(String firstName) {
        return this.actorDAO.findByFirstName(firstName);
    }

    @Override
    public List<ActorTableSample> findAllByFirstName(String firstName) {
        return null;
    }
}
