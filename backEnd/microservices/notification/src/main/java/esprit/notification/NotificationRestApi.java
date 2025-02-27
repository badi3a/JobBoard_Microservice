package esprit.notification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mic5/notification")
public class NotificationRestApi {
    //simple web service for testing
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello I'm Microservice Notification";
    }

}
