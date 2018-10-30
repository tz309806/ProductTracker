package com.example.models;

public interface ActorDAO {

    ActorTableSample findById(int id);
    ActorTableSample findByFirstName(String firstName);
}
