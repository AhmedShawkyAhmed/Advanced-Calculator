import javax.swing.*;

public class AdvancedCalculator {

    public static void main(String[] args) {
        
        try {UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        
        }
        Calculator f = new Calculator();
        f.setUndecorated(true);
        f.setVisible(true);
        f.setLocation(500, 140);
        f.setSize(350, 450);     
    }
}
