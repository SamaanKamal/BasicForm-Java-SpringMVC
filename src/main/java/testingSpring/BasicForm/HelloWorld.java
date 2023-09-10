package testingSpring.BasicForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {

    @GetMapping("/samaan")
    public String showSamaanPage(){
        return "samaanView";
    }
    @GetMapping("/")
    public String showHomePage(){
        return "hello-world";
    }
}
