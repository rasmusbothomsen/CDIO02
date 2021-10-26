import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;
import java.lang.Object;

public class Gui {
    public static void main(String[] args) {

        GUI_Street Tower = new GUI_Street("Tower", "+250", "", " ", Color.BLUE, Color.BLACK);
        GUI_Street Crater = new GUI_Street("Crater", "-100", "", " ", Color.BLUE, Color.BLACK);
        GUI_Street PlaceGate = new GUI_Street("Place Gate", "+100", "", " ", Color.BLUE, Color.BLACK);
        GUI_Street ColdDesert = new GUI_Street("Cold Desert", "-20", "", " ", Color.BLUE, Color.BLACK);
        GUI_Street[] s = new GUI_Street[]{Tower,Crater,PlaceGate,ColdDesert};
        GUI gui = new GUI(s);
    }

    }

