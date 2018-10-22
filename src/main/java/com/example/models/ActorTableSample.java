package com.example.models;

import com.example.Controllers.HomeController;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;


@Data
@Entity(name="actor")
@NamedQueries({
        @NamedQuery(
                name = "findActorTableSampleById",
                query = "from ActorTableSample a where a.actor_id=:id"
        )

})
public class ActorTableSample extends HomeController{

    public @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long actorId;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="last_update")
    private String lastUpdated;


    public ActorTableSample() {}


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

    public void me() {

    }

}
