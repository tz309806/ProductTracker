package com.example.Repository;



import com.example.models.ActorDAO;
import com.example.models.ActorTableSample;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.sql.Timestamp;
import java.util.List;


@Repository
public class ActorDAOImpl implements ActorDAO {

final static Logger logger = LoggerFactory.getLogger(ActorDAOImpl.class);

private SessionFactory sessionFactory;


@Autowired
public ActorDAOImpl(SessionFactory sessionFactory){
    this.sessionFactory = sessionFactory;

}

    @Override
    public ActorTableSample findById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<ActorTableSample> query = session.getNamedQuery("findActorTableSampleById");
        query.setParameter("id", id);
        ActorTableSample actorTableSample = query.getSingleResult();
        return actorTableSample;
    }


    @Override
    public ActorTableSample findByFirstName(String firstName) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<ActorTableSample> query = session.getNamedQuery("findActorTableSampleByFirstName");
        System.out.println("Got query");
        System.out.println("FIRST NAME IS: " + firstName);
        query.setParameter("firstName", firstName);
        ActorTableSample actorTableSample = query.getSingleResult();
        return actorTableSample;
    }

    @Override
    public List<ActorTableSample> findAllById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<ActorTableSample> query = session.getNamedQuery("findAllActorFirstNamesById");
        System.out.println("getting find all actors first name by id");
        query.setParameter("id", id);
        List<ActorTableSample> actorTableSample = query.getResultList();
        return actorTableSample;

    }

    @Override
    public int addNewActor(int id, String firstName, String lastName, Timestamp lastUpdated) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<ActorTableSample> query = session.getNamedQuery("createNewActor");
        query.setParameter("id", id);
        query.setParameter("firstName", firstName);
        query.setParameter("lastName", lastName);
        query.setParameter("lastUpdated", lastUpdated);
        int newEntry = query.executeUpdate();
        return newEntry;
    }
}
