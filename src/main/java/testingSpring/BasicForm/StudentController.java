package testingSpring.BasicForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel)
    {
        Student theStudent = new Student();
        theModel.addAttribute("student",theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String showForm(@ModelAttribute("student") Student theStudent)
    {
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }

}
