package com.cybertek.dto;

import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectDTO {

    private String projectName;
    private String projectCode;
    private UserDTO assignedManager; //Type is UserDTO

    @DateTimeFormat(pattern = "yyyy-MM-dd") // FORMAT MUST MATCH
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")    //This annotation will
    private LocalDate endDate;          //In table date is in OBJECT format. When we call it to Project Create we need String

    private String projectDetail;
    private Status projectStatus;

    private int completeTaskCounts;
    private int unfinishedTaskCounts;

    public ProjectDTO(String projectName, String projectCode, UserDTO assignedManager,
                      LocalDate startDate, LocalDate endDate,
                      String projectDetail, Status projectStatus) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectDetail = projectDetail;
        this.projectStatus = projectStatus;
    }

}

