package com.example.Repository;

import com.example.models.ActorTableSample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ActorTableSampleRepository extends CrudRepository<ActorTableSample, Long> {
}
