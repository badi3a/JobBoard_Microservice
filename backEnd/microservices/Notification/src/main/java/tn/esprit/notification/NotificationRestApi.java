package tn.esprit.notification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mic4/notification")
public class NotificationRestApi {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello I'm Microservice Notification";
    }
}
