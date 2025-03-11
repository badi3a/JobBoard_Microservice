package esprit.candidat;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="Job")
public interface JobClient {


    @RequestMapping("/mic2/jobs/hello")
    public String sayHello();

}
