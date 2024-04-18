package mobility.pm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmApplication.class, args);
	}

}
