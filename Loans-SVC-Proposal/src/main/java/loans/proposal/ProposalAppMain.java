package loans.proposal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProposalAppMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ProposalAppMain.class);

		app.run(args);
	}
}
