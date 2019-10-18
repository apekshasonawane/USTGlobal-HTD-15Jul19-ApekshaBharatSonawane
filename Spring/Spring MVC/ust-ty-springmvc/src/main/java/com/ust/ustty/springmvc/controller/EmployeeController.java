package com.ust.ustty.springmvc.controller;

import java.text.SimpleDateFormat;



import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.ustty.springmvc.dto.Employee;
import com.ust.ustty.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public  EmployeeService service;
	//@RequestMapping(path="/login",method = RequestMethod.GET)		or

	@InitBinder			//used for  customEditor
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		}
	
	@GetMapping("/login")			//we can have same url for one get() and one Post(),it should not same for 2 get() or 2Post()
	public String loginPage(HttpServletRequest request) {
		if(request.getSession(false)==null) {
			return "login";
		}
		return "home";
	}
	@GetMapping("/register")						//we r just going to registerpage not inserting record
	public String registerPage() {
		return "register";
	}
	
	@PostMapping("/login")
	public String login(String email,String password,ModelMap map,HttpServletRequest req) {
		Employee employee=service.auth(email, password);
		if(employee==null) {
			map.addAttribute("msg", "Invalid Credintials");
			return "login";
		}
		req.getSession().setAttribute("emp", employee);
		return "home";
	}
	
	@PostMapping("/register")
	public String register(Employee employee,ModelMap map) {
		if(service.registerEmployee(employee)) {
			map.addAttribute("msg","  Employee Registered Successfully");
		}else {
			map.addAttribute("msg","Data is invalid");
		}
		return "login";
	}
	
	@GetMapping("/home")
	public String homePage(HttpServletRequest request) {
		if(request.getSession(false)==null) {
			return "login";
		}
		return "home";
	}
	
	@GetMapping("/update")
	public String updatePage(HttpServletRequest request) {
		if(request.getSession(false)==null) {
			return "login";
		}
		return "update";
	}
	@PostMapping("/update")
	public String update(Employee employee,@SessionAttribute("emp")Employee emp,ModelMap map,HttpSession session) {
		employee.setEmail(emp.getEmail());          //either make email readonly in jsp or connect with backend bcoz we r not  changing email
		if(service.updateEmployee(employee)) {
			map.addAttribute("msg","Updated Successfully");
			session.setAttribute("emp", employee);
			
		}else {
			map.addAttribute("msg","Invalid Data");
		}
		
		return "home";
	}
	
	@GetMapping("/show-all")
	public String showAll(ModelMap map,HttpServletRequest request) {
		if(request.getSession(false)==null) {
			return "login";
		}
		List<Employee> employees=service.getAllEmployee();
		map.addAttribute("list",employees);		//map.addAttribute acts same as req.getAttribute()
		return "show-all";
	}
	
	@GetMapping("/delete")			//clicking on hyperlink		,@deleteMapping is used for full web services
	public String delete(@RequestParam("id")int id,ModelMap map,HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
		service.deleteEmployee(id);
		map.addAttribute("msg",id+"  Profile deleted");
		session.invalidate();
		
		}
		return "redirect:./login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap map) {
		map.addAttribute("msg",session.getId()+"  logout successfully");
		return "login";
	}
	
	
}
