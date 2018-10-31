package com.example.Repository;

import com.example.Controllers.ActorSampleService;
import com.example.models.ActorDAO;
import com.example.models.ActorTableSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
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

    @Override
    public List<ActorTableSample> findAllById(int id) {
        return this.actorDAO.findAllById(id);
    }

    @Override
    public int addNewActor(int id, String firstName, String lastName, Timestamp lastUpdated) {
        return this.actorDAO.addNewActor(id, firstName, lastName, lastUpdated);
    }
}
