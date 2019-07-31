package lesson1.java_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloManOnceSay implements HelloMan {
    @Value("Alex") // внедрение через сеттер?
    private String name;

    public HelloManOnceSay() {

    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public void helloSay() {
        System.out.println("Hello, " + this.name);
    }
}
