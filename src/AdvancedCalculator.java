// the main class
import javax.swing.*;

public class AdvancedCalculator {

    public static void main(String[] args) {
        
        try {UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        
        }
        Calculator calculator = new Calculator();
        calculator.setUndecorated(true);
        calculator.setVisible(true);
        calculator.setLocation(500, 140);
        calculator.setSize(350, 450);     
    }
}
