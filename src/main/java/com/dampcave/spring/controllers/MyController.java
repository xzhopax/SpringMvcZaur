package com.dampcave.spring.controllers;

import com.dampcave.spring.employees.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
//@RequestMapping("/employee")
public class MyController {

//    @RequestMapping("/")
//    public String showFirstView(){
//        return "first-view";
//    }
//
//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails(){
//        return "ask-emp-detail";
//    }

    //    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(){
//        return "employee-detail";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model){
//        String nameAtr = request.getParameter("employeeName");
//        nameAtr = "Mr." + nameAtr;
//
//        model.addAttribute("nameAttribute", nameAtr);
//        model.addAttribute("description", " - really man");
//
//        return "employee-detail";
//    }


//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model){
//
//        empName = "Mr." + empName;
//
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - really man");
//
//        return "employee-detail";
//    }

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
//        Employee employee = new Employee();
//        employee.setName("Ivan");
//        employee.setSurname("Petrov");
//        employee.setSalary(500);
//        model.addAttribute("employee", employee);

        model.addAttribute("employee", new Employee());

        return "ask-emp-detail";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp
                                        , BindingResult bindingResult){
//            String name = emp.getName();
//            name = "Mr. " + name;
//            emp.setName(name);
//
//            String surname = emp.getSurname();
//            surname = surname + "!!!";
//            emp.setSurname(surname);
//
//            int salary = emp.getSalary();
//            emp.setSalary(salary*10);
        if (bindingResult.hasErrors()){
            return "ask-emp-detail";
        }else {
            return "employee-detail";
        }
    }
}
