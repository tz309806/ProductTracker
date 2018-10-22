package com.example.Controllers;

import com.example.models.ActorTableSample;
import org.springframework.stereotype.Service;


@Service
public interface ActorSampleService {

    ActorTableSample findById(int id);
    ActorTableSample findByFirstName(String firstName);
}
