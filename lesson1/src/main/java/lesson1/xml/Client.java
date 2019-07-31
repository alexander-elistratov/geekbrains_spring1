package lesson1.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        CameraImpl camera = context.getBean("camera", CameraImpl.class);
        camera.doPhotograph();
    }
}
