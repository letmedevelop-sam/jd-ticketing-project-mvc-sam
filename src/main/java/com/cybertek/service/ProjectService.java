package com.cybertek.service;

import com.cybertek.dto.ProjectDTO;

import java.util.List;

public interface ProjectService extends CrudService<ProjectDTO, String>  {

   // List<ProjectDTO> findProjects();

    void complete(ProjectDTO project);
}
