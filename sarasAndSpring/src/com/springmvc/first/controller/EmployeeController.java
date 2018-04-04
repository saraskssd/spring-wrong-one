package com.springmvc.first.controller;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import com.javatpoint.beans.Emp;  
@Controller  
public class EmployeeController {  
  
    @RequestMapping("/empform")  
    public ModelAndView showform(){  
        
        return new ModelAndView("empform","command",new Employee());  
    }  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") Employee emp){  
       
        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
          
      
        return new ModelAndView("redirect:/viewemp"); 
    }  
      
    @RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
        List<Employee> list=new ArrayList<Employee>();  
        list.add(new Employee(1,"rahul",35000f,"S.Engineer"));  
        list.add(new Employee(2,"aditya",25000f,"IT Manager"));  
        list.add(new Employee(3,"sachin",55000f,"Care Taker"));  
          
        return new ModelAndView("viewemp","list",list);  
    }  
}  