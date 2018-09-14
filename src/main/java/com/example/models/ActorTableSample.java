package main.models;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@Component
public class ActorTableSample {

    private @Id @GeneratedValue Long actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdated;


    private ActorTableSample() {}


    public ActorTableSample(String firstName, String lastName, Date lastUpdated) {
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

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
