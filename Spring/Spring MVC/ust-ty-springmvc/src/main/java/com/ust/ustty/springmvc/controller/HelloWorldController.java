package com.ust.ustty.springmvc.controller;

import java.util.Date;

import java.text.SimpleDateFormat;

import javax.jws.WebParam.Mode;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;           
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.ustty.springmvc.dto.Employee;


@Controller // used to tell that this particular class is controller which is used to handle
			// request
@RequestMapping("/hello") // req.MApping specify path to controller
public class HelloWorldController {
	@RequestMapping(path = "/world", method = RequestMethod.GET) // to handle http get method we use this insted of get
																	// we can use post also if necessary
	public String hello(ModelMap map) { // all normal methods will have one annotation i.e. @RequestMapping which acts
										// as handler method,in every controller can have diff. controller but url
										// should be different
		map.addAttribute("msg", "Hello Beautiful!!!"); // map objext works like req. attribute
		return "index";
	}

	//passing value from client to server  using query
	@RequestMapping(path = "/query", method = RequestMethod.GET)
	public String getInfo(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap map) {
		map.addAttribute("id", id);		//url=http://localhost:8081/project-name/hello/query?id=123&name=aps
		map.addAttribute("name", name);
		return "info";
	}

	//passing value using form
	@RequestMapping(path = "/form-page", method = RequestMethod.GET)
	public String getForm() {
		return "form";
	}

	@RequestMapping(path = "/form", method = RequestMethod.POST)
	public String formData(Employee emp, ModelMap map) { // var name should be same as form names
		map.addAttribute("id", emp.getId());
		map.addAttribute("name", emp.getName());
		map.addAttribute("dob", emp.getDob());
		map.addAttribute("email", emp.getEmail());
		map.addAttribute("password", emp.getPassword());
		return "info";
	}

	//passing value using cookie
	@RequestMapping(path = "/add-cookie", method = RequestMethod.GET)
	public String addCookie(HttpServletResponse resp,ModelMap map) {
		Cookie cookie=new Cookie("name", "sweetiepie");				//first add cookie and then get it
		resp.addCookie(cookie);					//to add cookie to the browser
		map.addAttribute("msg","Cookie added successfully!!!");
		return "cookie";
	}
	
	@RequestMapping(path="/get-cookie",method=RequestMethod.GET)
	public String getCookie(@CookieValue(name="name",required = false)String name,ModelMap map) {		//required=false tells that if cookie is present in browser then return me otherwise return null
		if(name==null) {
			map.addAttribute("msg","  Cookie not present");
		}else {
			map.addAttribute("msg","  Cookie value=  "+name);
		}
		return "cookie";
	}
	
	//passing value using path param
	@RequestMapping(path="/path/{id}/{name}",method = RequestMethod.GET)
	public String getPathValues(@PathVariable("name")String name,@PathVariable("id")int id,ModelMap map) {			//same name should be passed to pathVariable as given in path
		map.addAttribute("id",id);
		map.addAttribute("name",name);															//url=http://localhost:8081/project-name/hello/path/123,aps			(for id and name)
		return "info";
	}
	
	@RequestMapping(path="/set-attribute",method = RequestMethod.GET)
	public String setSessionAttribute(HttpSession session,ModelMap map) {
		Employee employee=new Employee();
		employee.setId(11);
		employee.setName("Apeksha");
		
		employee.setEmail("aps123@gmail.com");
		employee.setPassword("aps123");
		session.setAttribute("emp", employee);
		map.addAttribute("msg","Session attribute added");
		return "index";
	}
	
	@RequestMapping(path="/get-attribute",method=RequestMethod.GET)
	public String getSessionAttribute(@SessionAttribute(name="emp",required=false)Employee employee,ModelMap map) {		//spring will create object and store it in eml
		
		if(employee==null) {
			map.addAttribute("msg","No attribute present");
		}else {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			map.addAttribute("msg","Got the attribute");
		}
		
		return "index";
		
	}
	
	@RequestMapping(path="/forward",method = RequestMethod.GET)
	public String forward() {
		return "forward:add-cookie";
	}
	@RequestMapping(path="/redirect",method = RequestMethod.GET)		//in spring we dont use include
	public String redirect() {
		return "redirect:http://www.google.com";
	}
	
	@InitBinder			//used for  customEditor i,e number,date
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		}
}
