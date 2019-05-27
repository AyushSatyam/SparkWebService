package com.example.curd.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherRecordService {
	
	@Autowired
	private CSETeacherRepo cseTeacherRepo;
	@Autowired
	private ECTeacherRepo ecTeacherRepo;
	@Autowired
	private ITTeacherRepo itTeacherRepo;
	
	public List<CSETeacher> getAllCSETeacher(){
		List<CSETeacher> cseTeachers = new ArrayList<>();
		cseTeacherRepo.findAll().forEach(cseTeachers::add);
		return cseTeachers;
	}
	
	public CSETeacher getCSETeacherById(Integer iD) {
		CSETeacher c = cseTeacherRepo.findById(iD).get();
		return c;
	}

	public void addCSETeacher(CSETeacher cseTeacher) {
		// TODO Auto-generated method stub
		cseTeacherRepo.save(cseTeacher);
		
	}

	public void updateCSETeacher(int iD, CSETeacher cseTeacher) {
		// TODO Auto-generated method stub
		cseTeacherRepo.save(cseTeacher);
	}
	

	public void deleteCSETeacher(int iD) {
		// TODO Auto-generated method stub
		cseTeacherRepo.deleteById(iD);
	}

	public List<ECTeacher> getAllECTeacher() {
		// TODO Auto-generated method stub
		List<ECTeacher> ecTeachers = new ArrayList<>();
		ecTeacherRepo.findAll().forEach(ecTeachers::add);
		return ecTeachers;
	}

	public ECTeacher getECTeacherById(Integer iD) {
		// TODO Auto-generated method stub
		ECTeacher e = ecTeacherRepo.findById(iD).get();
		return e;
	}

	public void updateECTeacher(int iD, ECTeacher ecteacher) {
		// TODO Auto-generated method stub
		ecTeacherRepo.save(ecteacher);
		
	}

	public void deleteECTeacher(int iD) {
		// TODO Auto-generated method stub
		ecTeacherRepo.deleteById(iD);
		
	}

	public void addECTeacher(ECTeacher ecTeacher) {
		// TODO Auto-generated method stub
		ecTeacherRepo.save(ecTeacher);
		
	}

	public List<ITTeacher> getAllITTeacher() {
		// TODO Auto-generated method stub
		List<ITTeacher> itTeachers = new ArrayList<>();
		itTeacherRepo.findAll().forEach(itTeachers::add);
		return itTeachers;
	}

	public ITTeacher getITTeacherById(Integer iD) {
		// TODO Auto-generated method stub
		ITTeacher i = itTeacherRepo.findById(iD).get();
		return i;
	}

	public void addITTeacher(ITTeacher itTeacher) {
		// TODO Auto-generated method stub
		itTeacherRepo.save(itTeacher);
		
	}

	public void updateITTeacher(int iD, ITTeacher itteacher) {
		// TODO Auto-generated method stub
		itTeacherRepo.save(itteacher);
		
	}

	public void deleteITTeacher(int iD) {
		// TODO Auto-generated method stub
		itTeacherRepo.deleteById(iD);
		
	}
	
}
