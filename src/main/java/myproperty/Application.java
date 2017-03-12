package myproperty;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author CODE MOVERS
 * @version 1.0
 * @since 2/27/2017
 * @email moverr@gmail.com
 *
 */
@SpringBootApplication
public class Application {
    public static  void main(String [] args){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
     }
}
