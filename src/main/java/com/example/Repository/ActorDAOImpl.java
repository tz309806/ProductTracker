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
}
