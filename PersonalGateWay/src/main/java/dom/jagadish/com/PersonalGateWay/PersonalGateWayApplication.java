package dom.jagadish.com.PersonalGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringBootApplication
public class PersonalGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalGateWayApplication.class, args);
	}

}

