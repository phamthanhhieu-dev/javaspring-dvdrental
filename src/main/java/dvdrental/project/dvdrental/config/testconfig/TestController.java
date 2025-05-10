package dvdrental.project.dvdrental.config.testconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api")
public class TestController {
    @GetMapping("test")
    public String test(){
        return "DvD rental test";
    }
}
