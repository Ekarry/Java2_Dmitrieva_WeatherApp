package HWLesson_8;

import HWLesson_8.view.IUserInterface;
import HWLesson_8.view.UserInterface;

public class WeatherApp {
    public static void main(String[] args) {

        IUserInterface ui = new UserInterface();

        ui.showMenu();


    }
}
