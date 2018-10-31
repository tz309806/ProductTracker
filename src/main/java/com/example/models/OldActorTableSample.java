package com.example.models;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "sakila.actor")
public class OldActorTableSample {

    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "actor_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "last_update")
    private Timestamp lastUpdated;


    public OldActorTableSample() {}


    public OldActorTableSample(int id, String firstName, String lastName, Timestamp lastUpdated) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdated = lastUpdated;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
