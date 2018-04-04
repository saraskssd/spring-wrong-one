package com.springmvc.first.controller;
import java.util.ArrayList;
import java.util.List;



@Controller
public class EmployeeController {
	
	
	 List<Employee> list= new ArrayList<Employee>();  

	@RequestMapping("/EmployeeForm")
	public ModelAndView showform() {
		// command is a reserved request attribute name, now use <form> tag to show
		// object data
		return new ModelAndView("employeeform", "command", new Employee());
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee employee) {
		// write code to save emp object
		// here, we are displaying emp object to prove emp has data
		System.out.println(employee.getEmployeeName() + " " + employee.getEmployeeSalary() + " " + employee.getEmployeeDesignation());
		list.add(new Employee(1,"rahul",35000f,"S.Engineer"));  
        list.add(new Employee(2,"aditya",25000f,"IT Manager"));  
        list.add(new Employee(3,"sachin",55000f,"Care Taker"));  
		list.add(employee);
		
		return new ModelAndView("redirect:/ViewEmployee");// will redirect to viewemp request mapping
	}
	
	
	@RequestMapping("/ViewEmployee")  
    public ModelAndView viewemp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
       
        
        System.out.println(list.size()); 
        list.add(new Employee());
        return new ModelAndView("viewemployee","employeeList",list);  
    }  
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
	  return new ModelAndView("index");
	 }

}
