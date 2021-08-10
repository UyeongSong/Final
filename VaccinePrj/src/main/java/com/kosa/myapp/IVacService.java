package com.kosa.myapp;

public interface IVacService {
	
	void insertVacInfo(VacVO vac);
	void deleteVacInfo(String Rotnum);
	VacVO getVacInfo(String Rotnum);
}
