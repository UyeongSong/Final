package com.kosa.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacService implements IVacService {

		@Autowired
		IVacRepository vacRepository;
		
		@Override
		public void insertVacInfo(VacVO vac) {
			vacRepository.insertVacInfo(vac);
		}	
		@Override
		public VacVO getVacInfo(String rotNum) {
			return vacRepository.selectVacInfo(rotNum);
		}
		
		@Override
		public void deleteVacInfo(String rotNum) {
			vacRepository.deleteVacInfo(rotNum); 
		}

}


