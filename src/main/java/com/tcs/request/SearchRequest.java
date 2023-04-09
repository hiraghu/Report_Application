package com.tcs.request;

import java.time.LocalDate;

import lombok.Data;


@Data
public class SearchRequest {
	
	private String planeName;
	private String planeStatus;
	private String gender;
	private String startDate;
	private String enddate;

}
