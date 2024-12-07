package Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "greeting";
    }

    @GetMapping("/test")
    public String renderTest() {
        return "test";
    }

    @GetMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "info";
    }

    @GetMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "sum";
    }

    @GetMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 + num2);
        return "addResult";
    }

    @GetMapping("/combine")
    public String combine(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("combined", str1 + " " + str2);
        return "combineResult";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("multiplication", num1 * num2);
        return "calculationResult";
    }
}
