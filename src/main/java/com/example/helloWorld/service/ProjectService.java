package com.example.helloWorld.service;

import com.example.helloWorld.entity.Project;
import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<Project> getAllProjects();
    Optional<Project> getProjectById(Long id);
    Project createProject(Project project);
    void deleteProject(Long id);
}
