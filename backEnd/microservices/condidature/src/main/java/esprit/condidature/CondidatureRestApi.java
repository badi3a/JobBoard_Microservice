package esprit.condidature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic3/condidatures")
public class CondidatureRestApi {
    @GetMapping("/hello")
    public String hello() {
        return "Hello micriservice3 : condidatures";
    }
}
