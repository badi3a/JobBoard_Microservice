package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CandidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatApplication.class, args);
	}
    @Autowired
	private CandidatRepository candidatRepository;
	@Bean
	public ApplicationRunner init() {
		return (args) -> {
			candidatRepository.save(new Candidat("Badia","Bouhdid","badia@gmail.com"));
		};
}
}
