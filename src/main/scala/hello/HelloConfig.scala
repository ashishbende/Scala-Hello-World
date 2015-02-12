package hello;

import org.springframework.context.annotation.{Configuration, ComponentScan};
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody, RestController};
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMethod;
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

@RequestMapping(method=Array(RequestMethod.GET), value=Array("/"))
@ResponseBody
def greet(): String = "Hello World!"
}
