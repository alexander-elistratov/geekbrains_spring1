package lesson1.xml;

import org.springframework.stereotype.Component;

@Component("cameraRoll")
public class ColoredCameraRoll implements CameraRoll {
    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}
