package com.kosa.myapp;

public interface IPatientService {
	
	void insertInfo(PatientVO patient);
	PatientVO getInfo(String rotNum);
	void updateInfo(PatientVO patient);
	void deleteInfo(String name, String birthDate);
	int getPatientCount();

}
