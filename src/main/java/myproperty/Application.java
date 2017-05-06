package myproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author CODE MOVERS
 * @version 1.0
 * @since 2/27/2017
 * @email moverr@gmail.com
 *
 */
@SpringBootApplication
@ComponentScan("myproperty._controller")
@EntityScan("myproperty._entities")
@EnableJpaRepositories("myproperty._dao")


public class Application {
    public static  void main(String [] args){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
     }
}
