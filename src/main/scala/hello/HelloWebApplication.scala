package hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation._;

/*
* HelloWebApplication Object to bootstrap the Spring Boot web application
* 
* @author AshishB
* @since 1.0
*/

@EnableAutoConfiguration
object HelloWebApplication{
	
	def main(args: Array[String]){
		SpringApplication.run(classOf[HelloConfig]);
	}
}