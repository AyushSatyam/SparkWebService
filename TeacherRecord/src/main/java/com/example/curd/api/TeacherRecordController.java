package com.example.curd.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherRecordController {
	@Autowired
	private TeacherRecordService teacherRecordService1;
	@Autowired
	private TeacherRecordService teacherRecordService2;
	@Autowired
	private TeacherRecordService teacherRecordService3;
	
	@RequestMapping(path="/teachersrecord/cseteacher")
	public List<CSETeacher> getAllCSETeacher(){
		return (List<CSETeacher>) teacherRecordService1.getAllCSETeacher();
	}
	
	@RequestMapping(path="/teachersrecord/cseteacher/{ID}")
	public CSETeacher getCSETeacherById(@PathVariable Integer ID) {
		return (CSETeacher) teacherRecordService1.getCSETeacherById(ID);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/teachersrecord/cseteacher")
	public void AddCSETeacher(@RequestBody CSETeacher cseTeacher)
	{
		teacherRecordService1.addCSETeacher(cseTeacher);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/teachersrecord/cseteacher/{ID}")
	public void updateCSETeacher(@PathVariable int ID,@RequestBody CSETeacher cseTeacher)
	{
		teacherRecordService1.updateCSETeacher(ID,cseTeacher);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/teachersrecord/cseteacher/{ID}")
	public void deleteCSETeacher(@PathVariable int ID)
	{
		teacherRecordService1.deleteCSETeacher(ID);
	}
	
	@RequestMapping(path="/teachersrecord/ecteacher")
	public List<ECTeacher> getAllECTeacher(){
		return (List<ECTeacher>) teacherRecordService2.getAllECTeacher();
	}
	
	@RequestMapping(path="/teachersrecord/ecteacher/{ID}")
	public ECTeacher getECTeacherById(@PathVariable Integer ID)
	{
		return (ECTeacher) teacherRecordService2.getECTeacherById(ID);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/teachersrecord/ecteacher")
	public void AddECTeacher(@RequestBody ECTeacher ecTeacher)
	{
		teacherRecordService2.addECTeacher(ecTeacher);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/teachersrecord/ecteacher/{ID}")
	public void updateECTeacher(@PathVariable int ID,@RequestBody ECTeacher ecteacher)
	{
		teacherRecordService2.updateECTeacher(ID,ecteacher);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/teachersrecord/ecteacher/{ID}")
	public void deleteECTEacher(@PathVariable int ID)
	{
		teacherRecordService2.deleteECTeacher(ID);
	}
	

	@RequestMapping(path="/teachersrecord/itteacher")
	public List<ITTeacher> getAllITTeacher(){
		return (List<ITTeacher>) teacherRecordService3.getAllITTeacher();
	}
	
	@RequestMapping(path="/teachersrecord/itteacher/{ID}")
	public ITTeacher getITTeacherById(@PathVariable Integer ID)
	{
		return (ITTeacher) teacherRecordService3.getITTeacherById(ID);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/teachersrecord/itteacher")
	public void AddITTeacher(@RequestBody ITTeacher itTeacher)
	{
		teacherRecordService3.addITTeacher(itTeacher);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/teachersrecord/itteacher/{ID}")
	public void updateITTeacher(@PathVariable int ID,@RequestBody ITTeacher itteacher)
	{
		teacherRecordService3.updateITTeacher(ID,itteacher);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/teachersrecord/itteacher/{ID}")
	public void deleteITTEacher(@PathVariable int ID)
	{
		teacherRecordService3.deleteITTeacher(ID);
	}

}
