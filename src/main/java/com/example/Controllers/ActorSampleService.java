package com.example.Controllers;

import com.example.models.ActorTableSample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;


@Service
public interface ActorSampleService {

    ActorTableSample findById(int id);
    ActorTableSample findByFirstName(String firstName);
    List<ActorTableSample> findAllByFirstName(String firstName);
    List<ActorTableSample> findAllById(int id);
    int addNewActor(int id, String firstName, String lastName, Timestamp lastUpdated);
}
