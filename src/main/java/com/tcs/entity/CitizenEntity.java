package com.tcs.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Citizen_info")
public class CitizenEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizen_Id;
    private String citizen_Name;
    private String gender;
    private String plan_Name;
    private String plan_Status;
    private LocalDate plan_start_Date;
    private LocalDate plan_end_Date;
    private Integer benefit_Amount;
    private String denial_Reason;
    private LocalDate terminated_Date;
    private String termination_Reason;
    

}
