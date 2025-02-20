package tn.esprit.meeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mic5/meeting")
public class MeetingRestApi {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello I'm Microservice Meeting";
    }
}
