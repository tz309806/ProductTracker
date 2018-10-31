package com.example.models;

import java.sql.Timestamp;
import java.util.List;

public interface ActorDAO{

    ActorTableSample findById(int id);
    ActorTableSample findByFirstName(String firstName);
    List<ActorTableSample> findAllById(int id);
    int addNewActor(int id, String firstName, String lastName, Timestamp lastUpdated);
}
