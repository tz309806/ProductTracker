package com.example.models;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "sakila.actor")
@NamedQueries({
        @NamedQuery(
                name = "findActorTableSampleById",
                query = "from ActorTableSample a where a.id=:id"
        ),
        @NamedQuery(
                name = "findActorTableSampleByFirstName",
                query = "from ActorTableSample a where a.firstName=:firstName"
        ),

})
public class ActorTableSample {

    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "actor_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "last_update")
    private Timestamp lastUpdated;


    public ActorTableSample() {}


    public ActorTableSample(String firstName, String lastName, Timestamp lastUpdated, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdated = lastUpdated;
        this.id = id;
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
