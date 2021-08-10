package com.kosa.myapp;


import org.apache.ibatis.annotations.Param;

import com.kosa.myapp.PatientVO;

public interface IPatientRepository {

//	List<PatientVO> getPtList();		//모든 환자의 정보 조회
	int getPatientCount();
	PatientVO selectInfo(String rotNum);	//지정한 환자의 모든 정보 조회
	void updatePt(PatientVO patient);						//지정한 환자의 정보 수정		
	void insertPt(PatientVO patient);						//새로운 환자의 정보 입력
	void deletePt(@Param("rotNum") String rotNum, @Param("phoneNum") String phoneNum);	// 환자 정보 삭제
//	List<Map<String, Object>> getAllDeptId();	//모든 부서아이디와 이름 조회
//	List<Map<String, Object>> getAllJobId();	//모든 직무아이디와 타이틀 조회
//	List<Map<String, Object>> getAllManagerId();//모든 매니저아이디와 이름 조회
}
