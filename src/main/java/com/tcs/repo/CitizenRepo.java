package com.tcs.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tcs.entity.CitizenEntity;


public interface CitizenRepo extends JpaRepository<CitizenEntity, Integer> {
	
	@Query("select distinct(plan_Name) from CitizenEntity")
	public List<String> getPlannName();
	
	@Query("select distinct (plan_Status) from CitizenEntity")
	public List<String>  getPlanStatus();
	
	//public List<CitizenEntity> search(SearchRequest request);
	

}
