package com.example.helloWorld.repository;

import com.example.helloWorld.entity.EventDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDefinitionRepository extends JpaRepository<EventDefinition, Long> {
}
