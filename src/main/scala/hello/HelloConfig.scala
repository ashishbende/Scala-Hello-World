package hello;

import org.springframework.context.annotation.{Configuration, ComponentScan};
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody, RestController};
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot;

/*
* This config class will trigger Spring @annotation scanning and auto configure Spring context.
*
* @author AshishB
* @since 1.0
*/

@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
class HelloConfig {
@RequestMapping(Array("/"))
@ResponseBody
def greet(): String = "Hello World!"
}
