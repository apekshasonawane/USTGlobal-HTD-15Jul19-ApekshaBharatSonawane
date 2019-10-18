package com.ust.usttyspringboot.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.usttyspringboot.dto.Employee;
import com.ust.usttyspringboot.dto.EmployeeResponse;
import com.ust.usttyspringboot.service.EmployeeService;

@RestController				//for rest instead of using @Controller @restcontroller is used we can strore this object in xml/json but json is preferred most
@RequestMapping("/employee")
//@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")   //or		* means accept anything,allowcredintial used to send cookie from spring boot to front end in angular give withcredentials=true
//@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*",allowCredentials = "true")		//it will allow only one port
public class EmployeeController {

	@Autowired
	@Qualifier("jpa")
	private EmployeeService service;
	
	@InitBinder			//used for  customEditor
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		}
	
	@GetMapping(path="/get",produces =MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody EmployeeResponse getEmployee(@RequestParam("id")int id) {		//@res.body tells that this is not view page it is itself resp.body i.e object
		
		Employee employee= service.getEmployee(id);
		EmployeeResponse response=new EmployeeResponse();
		if(employee==null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data found");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setEmployees(Arrays.asList(employee));
		}
		return response;
		
	}
	
	@GetMapping(path="/get-all",produces =MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse getAllEmployee(){
		List<Employee> employee=service.getAllEmployees();
		EmployeeResponse response=new EmployeeResponse();
		if(employee==null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data found");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setEmployees(employee);
		}
		return response;
		
	}
	@GetMapping(path="/get-all-name",produces =MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse getAllEmployeesByName(@RequestParam("name")String name){
		List<Employee> employee=service.getAllEmployeesByName(name);
		EmployeeResponse response=new EmployeeResponse();
		if(employee==null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data found");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setEmployees(employee);
		}
		return response;
		
	}
	@PostMapping(path="/add",produces =MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.addEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data added into DB");
			response.setEmployees(Arrays.asList(employee));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data is not added into DB");
			
		}
		return response;
	}
	@PutMapping(path="/modify",produces =MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {
		EmployeeResponse response=new EmployeeResponse();
		if( service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Updated into DB");
			response.setEmployees(Arrays.asList(employee));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data is not updated added into DB");
		}
		return response;
		
	}
	@DeleteMapping(path="/remove/{id}",produces =MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id")int id) {
		EmployeeResponse response=new EmployeeResponse();
		Employee employee= service.getEmployee(id);
		if(service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data deleted from DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data is not deleted from DB");
			response.setEmployees(Arrays.asList(employee));
		}
		return response; 
	}
	
	@GetMapping(path="/exception")
	public String throwException() throws Exception{
		throw new Exception();
	}
	
	

}
