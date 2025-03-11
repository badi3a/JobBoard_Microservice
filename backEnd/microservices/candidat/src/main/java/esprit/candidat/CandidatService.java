package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {


    @Autowired
    private JobClient jobClient;



    @Autowired
    private CandidatRepository candidatRepository;

    public String sayHello(){
        return jobClient.sayHello();
    }
    public List<Candidat> findAll() {
        return candidatRepository.findAll();
    }


}
