package dom.jagadish.com.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swag {
	
			
		@Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("dom.jagadish.com"))
	               // .paths(regex("/.*"))
	               
	                .build()
	                .apiInfo(metaInfo());
	    }

	    private ApiInfo metaInfo() {

	        ApiInfo apiInfo = new ApiInfo(
	                "Spring Boot Swagger Example API",
	                "Spring Boot Swagger Example API for Youtube",
	                "1.0",
	                "Terms of Service",
	                new Contact("Jagadish", "https://www.youtube.com",
	                        "xyz@gmail.com"),
	                "Apache License Version 0.0",
	                "https://www.apache.org/licesen.html"
	        );

	        return apiInfo;
	    }

	}

