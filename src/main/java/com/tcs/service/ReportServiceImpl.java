package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.tcs.entity.CitizenEntity;
import com.tcs.repo.CitizenRepo;
import com.tcs.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

     @Autowired
	private CitizenRepo planRepo;

	@Override
	public List<String> getPlaneName() {
		return planRepo.getPlannName();
				
		}

	@Override
	public List<String> getPlaneStatus() {
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenEntity> search(SearchRequest request) {
		
		CitizenEntity citizen = new CitizenEntity();
    	
		if(null!=request.getPlaneName() && !"".equals(request.getPlaneName())) {
			citizen.setPlan_Name(request.getPlaneName());
		}

		if(null!=request.getPlaneStatus() && !"".equals(request.getPlaneStatus())) {
			citizen.setPlan_Status(request.getPlaneStatus());
		}

		if(null!=request.getGender() && !"".equals(request.getGender())) {
			citizen.setGender(request.getGender());
		}
		
		return planRepo.findAll(Example.of(citizen));
		
	}
		
		
			
		/*
		 * 
	    	CitizenEntity citizen = new CitizenEntity();
	    		citizen.setPlan_Name(request.getPlaneName());
	    		citizen.setPlan_Status(request.getPlaneStatus());
	    		citizen.setGender(request.getGender());
	    //		citizen.setPlan_start_Date(request.getStartDate());
	    	//	citizen.setPlan_end_Date(request.getEnddate());
	    		
	    		Example<CitizenEntity> example = Example.of(citizen);
	    		
	    		return planRepo.findAll(example);
	}
		 * 
		 * 
		if(request!=null) {
			BeanUtils.copyProperties(request, citizen);
			return planRepo.findAll(Example.of(citizen));
		}
		return planRepo.findAll();
	    	}
*/
	    	
	    	
	    	
	    	
	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public boolean exportpdf() {
		// TODO Auto-generated method stub
		return false;
	}


}
