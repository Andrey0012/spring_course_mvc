package com.zaurtregulov.spring.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView () {
        return "first-view";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails (Model model) {
        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }
//    @RequestMapping ("/showDetails")
//    public String showEmployeeDetails () {
//        return "show-emp-details-view";
//    }

//    @RequestMapping ("/showDetails")
//    public String showEmployeeDetails (HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("empNameAttribute", empName);
//        model.addAttribute("destription", " -employee");
//
//        return "show-emp-details-view";
//    }

    @RequestMapping ("/showDetails")
    public String showEmployeeDetails (@Valid @ModelAttribute ("employee") Employee emp, BindingResult bindingResult) {
//        String name = emp.getName();
//        emp.setName("Mr. "+ name);
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!!!");
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
        return "show-emp-details-view";}
    }
}
