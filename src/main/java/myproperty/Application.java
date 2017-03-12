package myproperty;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by MOVER  on 2/27/2017.
 */

@SpringBootApplication
public class Application {
    public static  void main(String [] args){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
     }
}
