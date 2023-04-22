import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Q2 extends Applet implements ItemListener {
    Choice colorChoice;
    
    public void init() {
        
        colorChoice = new Choice();
        colorChoice.add("Red");
        colorChoice.add("Green");
        colorChoice.add("Blue");
        colorChoice.add("Black");
        colorChoice.add("Orange");
        colorChoice.add("Magenta");
        colorChoice.add("Yellow");
        
        add(new Label("Choose a color:"));
        add(colorChoice);
        
        
        colorChoice.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent e) {
        
        String colorName = colorChoice.getSelectedItem();
        switch (colorName) {
            case "Red":
                setBackground(Color.RED);
                break;
            case "Green":
                setBackground(Color.GREEN);
                break;
            case "Blue":
                setBackground(Color.BLUE);
                break;
            case "Black":
                setBackground(Color.BLACK);
                break;
            case "Orange":
                setBackground(Color.ORANGE);
                break;
            case "Magenta":
                setBackground(Color.MAGENTA);
                break;
            case "Yellow":
                setBackground(Color.YELLOW);
                break;    
            default:
                setBackground(Color.WHITE);
        }
    }
}