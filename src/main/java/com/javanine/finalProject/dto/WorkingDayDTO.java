package com.javanine.finalProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
/**
 * The {@link WorkingDayDTO} to read a {@link com.javanine.finalProject.model.WorkingDay} entity by controller.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkingDayDTO {
    private Long id;
    private Date date;
    private EventDTO event;
    private StatusDTO status;
    private EmployeeDTO employee;
    private int hours;
}
