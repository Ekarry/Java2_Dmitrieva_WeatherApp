package HWLesson_7;

import HWLesson_7.view.IUserInterface;
import HWLesson_7.view.UserInterface;
import java.io.IOException;

public class WeatherAppInterface {
    public static void main(String[] args) throws IOException {
        IUserInterface userInterface = new UserInterface();
        userInterface.showUI();
    }
}
