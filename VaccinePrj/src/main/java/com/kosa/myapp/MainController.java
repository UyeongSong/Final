package com.kosa.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@Autowired
	IPatientService patientService;
	
	@Autowired
	IVacService vacService;
	
	@RequestMapping(value = "/menu", method=RequestMethod.GET)
	public String menu() {
		return "menu";
	}
	
	@RequestMapping(value = "/patient/getInfo", method=RequestMethod.GET)
	public String getInfo() {
		return "patient/getInfo";
	}
	
	@RequestMapping(value = "/patient/getInfo", method=RequestMethod.POST)
	public String getInfo(String rotNum, Model model) {

		PatientVO patient = patientService.getInfo(rotNum);

		if(patient!=null) {
			model.addAttribute("patient", patient);
		} else {
			model.addAttribute("message", "해당 정보가 없습니다.");
			return "patient/info";
		}
		
		return "patient/info";
	}
	
	@RequestMapping(value ="/patient/insert", method=RequestMethod.GET)
	public String insertPatient() {
		return "patient/insert";
	}
	
	@RequestMapping(value ="/patient/insert", method=RequestMethod.POST)
	public String insertPatient(PatientVO patient, Model model) {
		patientService.insertInfo(patient);
		return "redirect:/menu";
	}
	
	@RequestMapping(value= "/patient/update", method=RequestMethod.GET)
	public String update(String rotNum, Model model) {

		model.addAttribute("patient", patientService.getInfo(rotNum));
		return "patient/update";
	}
	
	@RequestMapping(value= "/patient/update", method=RequestMethod.POST)
	public String update(PatientVO patient, Model model) {
		
		patientService.updateInfo(patient);
		return "redirect:/menu";
	}
	
	@RequestMapping(value = "/patient/delete", method=RequestMethod.GET)
	public String delete(String rotNum, Model model) {
		
		model.addAttribute("patient", patientService.getInfo(rotNum));

		return "patient/delete";
	}
	
	@RequestMapping(value = "/patient/delete", method=RequestMethod.POST)
	public String delete(String rotNum, String phoneNum) {

		patientService.deleteInfo(rotNum, phoneNum);
		return "redirect:/menu";
	}

	
	@RequestMapping(value="/patient/count", method=RequestMethod.GET)
	public String getPatientCount(String rotNum, String phoneNum, Model model) {
		
		int count;
		count= patientService.getPatientCount();
		model.addAttribute("count", count);
		
		return "patient/count";
	}
	
	public String insertVac() {
		return null;
	}
}


