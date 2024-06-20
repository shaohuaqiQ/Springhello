package com.example.helloWorld.repository;

import com.example.helloWorld.entity.EventData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDataRepository extends JpaRepository<EventData, Long> {
}
