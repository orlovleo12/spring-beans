package main.java.app.config;

import main.java.app.model.Animal;
import main.java.app.model.Dog;
import main.java.app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main.java.app")
public class AppConfig {

    @Bean(name="dog")
    public Dog getDog() {
        Dog dog = new Dog();
        return dog;
    }
    @Bean(name="timer")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }

}
