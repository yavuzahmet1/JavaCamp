package kodlama.io.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class NorthwindDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindDemoApplication.class, args);
	}
	/*@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("kodlama.io.northwind"))
				.build();
	}*/

}
