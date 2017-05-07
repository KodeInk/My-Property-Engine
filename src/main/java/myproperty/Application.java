package myproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author CODE MOVERS
 * @version 1.0
 * @since 2/27/2017
 * @email moverr@gmail.com
 *
 */
@SpringBootApplication
@ComponentScan
public class Application {
    public static  void main(String [] args){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
     }
}
