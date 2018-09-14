package com.example.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class ActorTableSample {

    private @Id @GeneratedValue Long actorId;
    private String firstName;
    private String lastName;
    private String lastUpdated;


    private ActorTableSample() {}


    public ActorTableSample(String firstName, String lastName, String lastUpdated) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdated = lastUpdated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
