package com.tcs.service;

import java.util.List;

import com.tcs.entity.CitizenEntity;
import com.tcs.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlaneName();
	
	public List<String> getPlaneStatus();
	
	public List<CitizenEntity> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean  exportpdf();
	

}
