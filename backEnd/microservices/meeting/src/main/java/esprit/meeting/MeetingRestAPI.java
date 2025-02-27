package esprit.meeting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mic4/meeting")
@RestController
public class MeetingRestAPI {

    @GetMapping("/hello")
    public String sayHello() {

        return "Hello Microservice 4 !";
    }
}
