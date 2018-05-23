package com.javanine.finalProject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "working_day")
public class WorkingDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date")
    private Date date;

    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "status_id")
    private Long statusId;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "hours")
    private int hours;
}
