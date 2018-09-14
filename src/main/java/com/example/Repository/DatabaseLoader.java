package com.example.Repository;

import com.example.models.ActorTableSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ActorTableSampleRepository repository;

    @Autowired
    public DatabaseLoader(ActorTableSampleRepository repository){this.repository=repository;
    }


    @Override
    public void run(String... strings) throws Exception {
    this.repository.save(new ActorTableSample( "Teng", "Zhang", "09/20/2018"));

    }
}
