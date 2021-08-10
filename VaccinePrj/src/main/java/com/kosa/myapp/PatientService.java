package com.kosa.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService implements IPatientService {
	
	@Autowired
	IPatientRepository patientRepository;
	
	@Transactional
	public void insertInfo(PatientVO patient) {
		patientRepository.insertPt(patient);
	}
	
	@Override
	public void updateInfo(PatientVO patient) {
		patientRepository.updatePt(patient);
	}
	
	@Transactional
	@Override
	public void deleteInfo(String name, String birthDate) {
		patientRepository.deletePt(name, birthDate);
	}
	
	@Override
	public int getPatientCount() {
		return patientRepository.getPatientCount();
	}

	@Override
	public PatientVO getInfo(String rotNum) {
		
		return patientRepository.selectInfo(rotNum);
	}
	
}
