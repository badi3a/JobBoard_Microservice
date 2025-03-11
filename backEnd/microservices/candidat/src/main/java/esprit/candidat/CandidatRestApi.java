package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mic1/candidats")
@RefreshScope
public class CandidatRestApi {
    @Value("${welcome.message}")
    private String message;
    //simple web service for testing
    @GetMapping("/hello")
    public String sayHello() {

        return message;
    }






    @Autowired
    private CandidatService candidatService;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List <Candidat>> listCandidat(){
        return new ResponseEntity<>(candidatService.findAll(),
                HttpStatus.OK);

    }

    @RequestMapping("/hellojob")
    public String sayHelloJob(){
        return candidatService.sayHello();
    }



}
