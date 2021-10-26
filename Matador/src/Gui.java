import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;
import java.lang.Object;

public class Gui {
    public static void main(String[] args) {

        GUI_Street street = new GUI_Street("Tower", "+250", "", "", Color.BLUE, Color.BLACK);
        GUI_Street[] s = new GUI_Street[]{street};
        GUI gui = new GUI(s);

    }

}