import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;
import java.lang.Object;

public class Gui {
    public static void main(String[] args) {
//vandrette felter//
        GUI_Street Tower = new GUI_Street("Tower", "+250", "You have arrived at the Tower", " ", Color.PINK, Color.BLACK);
        GUI_Street Crater = new GUI_Street("Crater", "-100", "You stumbled into the Crater", " ", Color.PINK, Color.BLACK);
        GUI_Street PlaceGate = new GUI_Street("Place Gate", "+100", "You approach the Palace gates", " ", Color.PINK, Color.BLACK);
        GUI_Street ColdDesert = new GUI_Street("Cold Desert", "-20", "You landed in the Cold Desert", " ", Color.PINK, Color.BLACK);
        GUI_Street WalledCity = new GUI_Street("Walled City", "+180", "You visited the Walled city", " ", Color.PINK, Color.BLACK);
        GUI_Street[] s = new GUI_Street[]{Tower,Crater,PlaceGate,ColdDesert,WalledCity};
        GUI gui = new GUI(s);
    }

    }

