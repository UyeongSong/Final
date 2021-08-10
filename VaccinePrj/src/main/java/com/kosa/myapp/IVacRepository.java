package com.kosa.myapp;

import com.kosa.myapp.VacVO;

public interface IVacRepository {
	
	VacVO selectVacInfo(String rotNum);	
	void insertVacInfo(VacVO vac);	
	void deleteVacInfo(String rotNum);	

}
