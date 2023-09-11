package testingSpring.BasicForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping("/showFormError")
    public String showFormError(Model theModel)
    {
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer",theCustomer);
        return "customer-form-withErrors";
    }

    @RequestMapping("/processFormError")
    public String showFormError(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult)
    {
        if(theBindingResult.hasErrors())
        {
            return "customer-form-withErrors";
        }
        else {
            return "customer-confirmation-WithError";
        }

    }
}
