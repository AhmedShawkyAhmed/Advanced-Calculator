// the calculator class
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
    
    // Implements Objects from the Classes
    Hover hover;
    Container container;
    Color color1,color2;
    JPanel Buttonpanel,Textpanel,Exitpanel;
    JTextField textfield;
    JButton [] button;
    Font font1,font2;
    JLabel label;
    int x = 0;
    double temp1,temp2,result,a,m1;
    char ch;
    
    // the Class Constractor
    public Calculator() {
            
        // Initialize the Objects
        hover = new Hover();
        Buttonpanel = new JPanel();
        Textpanel = new JPanel();
        Exitpanel = new JPanel();
        button = new JButton[100];
        font1 = new Font("seirf", Font.CENTER_BASELINE, 15);
        font2 = new Font("seirf", Font.CENTER_BASELINE, 20);
        color1 = new Color(255, 255, 255);
        color2 = new Color(0,0,128);
        label = new JLabel("Calculator");
        
        // setting the Container of the Panels
        container = getContentPane();
        container.setLayout(new BorderLayout(3,1));
        container.add("North", Exitpanel);
        container.add("Center", Textpanel);
        container.add("South", Buttonpanel);
        
        // Initialize the TextField Object, setting Actions, setting Background, Font Color and Style
        textfield = new JTextField();
        textfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
        textfield.setBackground(Color.DARK_GRAY.darker());
        textfield.setForeground(color1);
        textfield.setFont(font2);
        
        // setting Layout and Background for the Panels
        Textpanel.add(textfield);
        Textpanel.setLayout(new GridLayout());
        Textpanel.setBackground(Color.BLACK);
        Buttonpanel.setLayout(new GridLayout(13, 4, 1, 1));
        Buttonpanel.setBackground(Color.BLACK);
        Exitpanel.setLayout(new GridLayout());
        Exitpanel.setBackground(Color.BLACK);
        
        // setting Font Color and Style to the Label
        label.setFont(font1);
        label.setForeground(color1);
        Exitpanel.add(label);
        
        // Buttons Initialization, Font Color, Font Style and Actions
        
        button[0] = new JButton("MC");
        button[0].setForeground(color1);
        button[0].setFont(font1);
        button[0].setContentAreaFilled( false );
        Buttonpanel.add(button[0]);
        button[0].addActionListener(this);
        button[0].addMouseListener(hover);
        
        button[1] = new JButton("M+");
        button[1].setForeground(color1);
        button[1].setFont(font1);
        button[1].setContentAreaFilled( false );
        Buttonpanel.add(button[1]);
        button[1].addActionListener(this);
        button[1].addMouseListener(hover);
        
        button[2] = new JButton("M-");
        button[2].setForeground(color1);
        button[2].setFont(font1);
        button[2].setContentAreaFilled( false );
        Buttonpanel.add(button[2]);
        button[2].addActionListener(this);
        button[2].addMouseListener(hover);
                
        button[3] = new JButton("MR");
        button[3].setForeground(color1);
        button[3].setFont(font1);
        button[3].setContentAreaFilled( false );
        Buttonpanel.add(button[3]);
        button[3].addActionListener(this);
        button[3].addMouseListener(hover);
        
        button[4] = new JButton("Sinh");
        button[4].setForeground(color1);
        button[4].setFont(font1);
        button[4].setContentAreaFilled( false );
        Buttonpanel.add(button[4]);
        button[4].addActionListener(this);
        button[4].addMouseListener(hover);
        
        button[5] = new JButton("Cosh");
        button[5].setForeground(color1);
        button[5].setFont(font1);
        button[5].setContentAreaFilled( false );
        Buttonpanel.add(button[5]);
        button[5].addActionListener(this);
        button[5].addMouseListener(hover);
        
        button[6] = new JButton("Tanh");
        button[6].setForeground(color1);
        button[6].setFont(font1);
        button[6].setContentAreaFilled( false );
        Buttonpanel.add(button[6]);
        button[6].addActionListener(this);
        button[6].addMouseListener(hover);
                
        button[7] = new JButton("Exp");
        button[7].setForeground(color1);
        button[7].setFont(font1);
        button[7].setContentAreaFilled( false );
        Buttonpanel.add(button[7]);
        button[7].addActionListener(this);
        button[7].addMouseListener(hover);
        
        button[8] = new JButton("Sin");
        button[8].setForeground(color1);
        button[8].setFont(font1);
        button[8].setContentAreaFilled( false );
        Buttonpanel.add(button[8]);
        button[8].addActionListener(this);
        button[8].addMouseListener(hover);
        
        button[9] = new JButton("Cos");
        button[9].setForeground(color1);
        button[9].setFont(font1);
        button[9].setContentAreaFilled( false );
        Buttonpanel.add(button[9]);
        button[9].addActionListener(this);
        button[9].addMouseListener(hover);
        
        button[10] = new JButton("Tan");
        button[10].setForeground(color1);
        button[10].setFont(font1);
        button[10].setContentAreaFilled( false );
        Buttonpanel.add(button[10]);
        button[10].addActionListener(this);
        button[10].addMouseListener(hover);
        
        button[11] = new JButton("mod");
        button[11].setForeground(color1);
        button[11].setFont(font1);
        button[11].setContentAreaFilled( false );
        Buttonpanel.add(button[11]);
        button[11].addActionListener(this);
        button[11].addMouseListener(hover);
         
        button[12] = new JButton("Rad");
        button[12].setForeground(color1);
        button[12].setFont(font1);
        button[12].setContentAreaFilled( false );
        Buttonpanel.add(button[12]);
        button[12].addActionListener(this);
        button[12].addMouseListener(hover);
        
        button[13] = new JButton("Deg");
        button[13].setForeground(color1);
        button[13].setFont(font1);
        button[13].setContentAreaFilled( false );
        Buttonpanel.add(button[13]);
        button[13].addActionListener(this);
        button[13].addMouseListener(hover);

        button[14] = new JButton("log");
        button[14].setForeground(color1);
        button[14].setFont(font1);
        button[14].setContentAreaFilled( false );
        Buttonpanel.add(button[14]);
        button[14].addActionListener(this);
        button[14].addMouseListener(hover);

        button[15] = new JButton("n-logx");
        button[15].setForeground(color1);
        button[15].setFont(font1);
        button[15].setContentAreaFilled( false );
        Buttonpanel.add(button[15]);
        button[15].addActionListener(this);
        button[15].addMouseListener(hover);
                        
        button[16] = new JButton("Ran#");
        button[16].setForeground(color1);
        button[16].setFont(font1);
        button[16].setContentAreaFilled( false );
        Buttonpanel.add(button[16]);
        button[16].addActionListener(this);
        button[16].addMouseListener(hover);
        
        button[17] = new JButton("nPr");
        button[17].setForeground(color1);
        button[17].setFont(font1);
        button[17].setContentAreaFilled( false );
        Buttonpanel.add(button[17]);
        button[17].addActionListener(this);
        button[17].addMouseListener(hover);
        
        button[18] = new JButton("nCr");
        button[18].setForeground(color1);
        button[18].setFont(font1);
        button[18].setContentAreaFilled( false );
        Buttonpanel.add(button[18]);
        button[18].addActionListener(this);
        button[18].addMouseListener(hover);
        
        button[19] = new JButton("1/x");
        button[19].setForeground(color1);
        button[19].setFont(font1);
        button[19].setContentAreaFilled( false );
        Buttonpanel.add(button[19]);
        button[19].addActionListener(this);
        button[19].addMouseListener(hover);
                
        button[20] = new JButton("2^x");
        button[20].setForeground(color1);
        button[20].setFont(font1);
        button[20].setContentAreaFilled( false );
        Buttonpanel.add(button[20]);
        button[20].addActionListener(this);
        button[20].addMouseListener(hover);
        
        button[21] = new JButton("*10^x");
        button[21].setForeground(color1);
        button[21].setFont(font1);
        button[21].setContentAreaFilled( false );
        Buttonpanel.add(button[21]);
        button[21].addActionListener(this);
        button[21].addMouseListener(hover);
        
        button[22]= new JButton("n^x");
        button[22].setForeground(color1);
        button[22].setFont(font1);
        button[22].setContentAreaFilled( false );
        Buttonpanel.add(button[22]);
        button[22].addActionListener(this);
        button[22].addMouseListener(hover);
       
        button[23] = new JButton("n^2");
        button[23].setForeground(color1);
        button[23].setFont(font1);
        button[23].setContentAreaFilled( false );
        Buttonpanel.add(button[23]);
        button[23].addActionListener(this);
        button[23].addMouseListener(hover);

        button[24] = new JButton("n√x");
        button[24].setForeground(color1);
        button[24].setFont(font1);
        button[24].setContentAreaFilled( false );
        Buttonpanel.add(button[24]);
        button[24].addActionListener(this);
        button[24].addMouseListener(hover);
        
        button[25] = new JButton("2√x");
        button[25].setForeground(color1);
        button[25].setFont(font1);
        button[25].setContentAreaFilled( false );
        Buttonpanel.add(button[25]);
        button[25].addActionListener(this);
        button[25].addMouseListener(hover);
        
        button[26] = new JButton("e");
        button[26].setForeground(color1);
        button[26].setFont(font1);
        button[26].setContentAreaFilled( false );
        Buttonpanel.add(button[26]);
        button[26].addActionListener(this);
        button[26].addMouseListener(hover);
        
        button[27] = new JButton("e^x");
        button[27].setForeground(color1);
        button[27].setFont(font1);
        button[27].setContentAreaFilled( false );
        Buttonpanel.add(button[27]);
        button[27].addActionListener(this);
        button[27].addMouseListener(hover);
        
        button[28] = new JButton("%");
        button[28].setForeground(color1);
        button[28].setFont(font1);
        button[28].setContentAreaFilled( false );
        Buttonpanel.add(button[28]);
        button[28].addActionListener(this);
        button[28].addMouseListener(hover);
        
        button[29] = new JButton("n!");
        button[29].setForeground(color1);
        button[29].setFont(font1);
        button[29].setContentAreaFilled( false );
        Buttonpanel.add(button[29]);
        button[29].addActionListener(this);
        button[29].addMouseListener(hover);
        
        button[30] = new JButton("C");
        button[30].setForeground(color1);
        button[30].setFont(font1);
        button[30].setContentAreaFilled( false );
        Buttonpanel.add(button[30]);
        button[30].addActionListener(this);
        button[30].addMouseListener(hover);
        
        button[31] = new JButton("←");
        button[31].setForeground(color1);
        button[31].setFont(font1);
        button[31].setContentAreaFilled( false );
        Buttonpanel.add(button[31]);
        button[31].addActionListener(this);
        button[31].addMouseListener(hover);
        
        button[32] = new JButton("|x|");
        button[32].setForeground(color1);
        button[32].setFont(font1);
        button[32].setContentAreaFilled( false );
        Buttonpanel.add(button[32]);
        button[32].addActionListener(this);
        button[32].addMouseListener(hover);
        
        button[33] = new JButton("π");
        button[33].setForeground(color1);
        button[33].setFont(font1);
        button[33].setContentAreaFilled( false );
        Buttonpanel.add(button[33]);
        button[33].addActionListener(this);
        button[33].addMouseListener(hover);
        
        button[34] = new JButton("( - )");
        button[34].setForeground(color1);
        button[34].setFont(font1);
        button[34].setContentAreaFilled( false );
        Buttonpanel.add(button[34]);
        button[34].addActionListener(this);
        button[34].addMouseListener(hover);
        
        button[35] = new JButton("/");
        button[35].setForeground(color1);
        button[35].setFont(font1);
        button[35].setContentAreaFilled( false );
        Buttonpanel.add(button[35]);
        button[35].addActionListener(this);
        button[35].addMouseListener(hover);
        
        button[36] = new JButton("7");
        button[36].setForeground(color1);
        button[36].setFont(font1);
        button[36].setContentAreaFilled( false );
        Buttonpanel.add(button[36]);
        button[36].addActionListener(this);
        button[36].addMouseListener(hover);
        
        button[37] = new JButton("8");
        button[37].setForeground(color1);
        button[37].setFont(font1);
        button[37].setContentAreaFilled( false );
        Buttonpanel.add(button[37]);
        button[37].addActionListener(this);
        button[37].addMouseListener(hover);
        
        button[38] = new JButton("9");
        button[38].setForeground(color1);
        button[38].setFont(font1);
        button[38].setContentAreaFilled( false );
        Buttonpanel.add(button[38]);
        button[38].addActionListener(this);
        button[38].addMouseListener(hover);
        
        button[39] = new JButton("*");
        button[39].setForeground(color1);
        button[39].setFont(font1);
        button[39].setContentAreaFilled( false );
        Buttonpanel.add(button[39]);
        button[39].addActionListener(this);
        button[39].addMouseListener(hover);
        
        button[40] = new JButton("4");
        button[40].setForeground(color1);
        button[40].setFont(font1);
        button[40].setContentAreaFilled( false );
        Buttonpanel.add(button[40]);
        button[40].addActionListener(this);
        button[40].addMouseListener(hover);
        
        button[41] = new JButton("5");
        button[41].setForeground(color1);
        button[41].setFont(font1);
        button[41].setContentAreaFilled( false );
        Buttonpanel.add(button[41]);
        button[41].addActionListener(this);
        button[41].addMouseListener(hover);
        
        button[42] = new JButton("6");
        button[42].setForeground(color1);
        button[42].setFont(font1);
        button[42].setContentAreaFilled( false );
        Buttonpanel.add(button[42]);
        button[42].addActionListener(this);
        button[42].addMouseListener(hover);
        
        button[43] = new JButton("-");
        button[43].setForeground(color1);
        button[43].setFont(font1);
        button[43].setContentAreaFilled( false );
        Buttonpanel.add(button[43]);
        button[43].addActionListener(this);
        button[43].addMouseListener(hover);
        
        button[44] = new JButton("1");
        button[44].setForeground(color1);
        button[44].setFont(font1);
        button[44].setContentAreaFilled( false );
        Buttonpanel.add(button[44]);
        button[44].addActionListener(this);
        button[44].addMouseListener(hover);
        
        button[45] = new JButton("2");
        button[45].setForeground(color1);
        button[45].setFont(font1);
        button[45].setContentAreaFilled( false );
        Buttonpanel.add(button[45]);
        button[45].addActionListener(this);
        button[45].addMouseListener(hover);
        
        button[46] = new JButton("3");
        button[46].setForeground(color1);
        button[46].setFont(font1);
        button[46].setContentAreaFilled( false );
        Buttonpanel.add(button[46]);
        button[46].addActionListener(this);
        button[46].addMouseListener(hover);
        
        button[47] = new JButton("+");
        button[47].setForeground(color1);
        button[47].setFont(font1);
        button[47].setContentAreaFilled( false );
        Buttonpanel.add(button[47]);
        button[47].addActionListener(this);
        button[47].addMouseListener(hover);
        
        button[48] = new JButton("+/-");
        button[48].setForeground(color1);
        button[48].setFont(font1);
        button[48].setContentAreaFilled( false );
        Buttonpanel.add(button[48]);
        button[48].addActionListener(this);
        button[48].addMouseListener(hover);
        
        button[49] = new JButton("0");
        button[49].setForeground(color1);
        button[49].setFont(font1);
        button[49].setContentAreaFilled( false );
        Buttonpanel.add(button[49]);
        button[49].addActionListener(this);
        button[49].addMouseListener(hover);
        
        button[50] = new JButton(".");
        button[50].setForeground(color1);
        button[50].setFont(font1);
        button[50].setContentAreaFilled( false );
        Buttonpanel.add(button[50]);
        button[50].addActionListener(this);
        button[50].addMouseListener(hover);
        
        button[51] = new JButton("=");
        button[51].setForeground(color1);
        button[51].setFont(font1);
        button[51].setContentAreaFilled( false );
        Buttonpanel.add(button[51]);
        button[51].addActionListener(this);
        button[51].addMouseListener(hover);
        
        button[52] = new JButton("  ---  ");
        button[52].setForeground(color1);
        button[52].setFont(font1);
        button[52].setContentAreaFilled( false );
        Exitpanel.add(button[52]);
        button[52].addActionListener(this);
        button[52].addMouseListener(hover);
        
        button[53] = new JButton(" ⌫ ");
        button[53].setForeground(color1);
        button[53].setFont(font2);
        button[53].setContentAreaFilled( false );
        Exitpanel.add(button[53]);
        button[53].addActionListener(this);
        button[53].addMouseListener(hover);
        
        button[54] = new JButton(" X ");
        button[54].setForeground(color1);
        button[54].setFont(font2);
        button[54].setContentAreaFilled( false );
        Exitpanel.add(button[54]);
        button[54].addMouseListener(hover);
    }
    // Buttons Actions
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String s = e.getActionCommand();
            if (s.equals("0")) {
                textfield.setText(textfield.getText() + "0");
            }
            if (s.equals("1")) {
                textfield.setText(textfield.getText() + "1");
            }
            if (s.equals("2")) {
                textfield.setText(textfield.getText() + "2");
            }
            if (s.equals("3")) {
                textfield.setText(textfield.getText() + "3");
            }
            if (s.equals("4")) {
                textfield.setText(textfield.getText() + "4");
            }
            if (s.equals("5")) {
                textfield.setText(textfield.getText() + "5");
            }
            if (s.equals("6")) {
                textfield.setText(textfield.getText() + "6");
            }
            if (s.equals("7")) {
                textfield.setText(textfield.getText() + "7");
            }
            if (s.equals("8")) {
                textfield.setText(textfield.getText() + "8");
            }
            if (s.equals("9")) {
                textfield.setText(textfield.getText() + "9");
            }
            if (s.equals("C")) {
                textfield.setText("");
                x = 0;
            }
            if (s.equals("( - )")) {
                textfield.setText("-");
            }
            if (s.equals("←")) {
                x = textfield.getText().length();
                textfield.setText(textfield.getText().substring(0, x-1));
            }
            if (s.equals("log")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.log10(a));
                m1 = a;
            }
            if (s.equals("1/x")) {
                a = 1 / Double.parseDouble(textfield.getText());    
                textfield.setText(""+ a); 
                m1 = a;
            }
            if (s.equals("Exp")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.exp(a));
                m1 = a;
            }
            if (s.equals("n^2")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.pow(a,2));
                m1 = a;
            }
            if (s.equals("%")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+a/100);
                m1 = a;
            }
            if (s.equals("Rad")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.toRadians(a));
                m1 = a;
            }
            if (s.equals("Deg")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.toDegrees(a));
                m1 = a;
            }
            if (s.equals("|x|")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.abs(a));
                m1 = a;
            }
            if (s.equals("2√x")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.sqrt(a));
                m1 = a;
            }
            if (s.equals("Sinh")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.sinh(Math.toRadians(a)));
                m1 = a;
            }
            if (s.equals("Cosh")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.cosh(Math.toRadians(a)));
                m1 = a;
            }
            if (s.equals("Tanh")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.tanh(Math.toRadians(a)));
                m1 = a;
            }
            if (s.equals("Sin")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.sin( Math.toRadians(a)));
                m1 = a;
            }
            if (s.equals("Cos")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.cos(Math.toRadians(a)));
                m1 = a;
            }
            if (s.equals("Tan")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.tan(Math.toRadians(a)));
                m1 = a;
            }
             if (s.equals("Ran#")) {
                 a = Math.random();
                textfield.setText(""+a);
                m1 = a;
            }
            if (s.equals("2^x")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+Math.pow(2, a));
                m1 = a;
            }
            if (s.equals("n!")) {
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+fact(a));
                m1 = a;
            }
            if (s.equals("MC")) {
                m1 = 0;
                textfield.setText("");
            }
            if (s.equals("MR")) {
                textfield.setText("");
                textfield.setText(textfield.getText() + m1);
            }
            if (s.equals("M+")) {
                x = 1;
                if (x == 1) {
                    m1 = Double.parseDouble(textfield.getText());
                    m1 += m1;
                    textfield.setText(""+m1);
                }
            }
            if (s.equals("M-")) {
                x = 1;
                if (x == 1) {
                    m1 = Double.parseDouble(textfield.getText());
                    m1 -= m1;
                    textfield.setText(""+m1);
                }
            }
            if (s.equals("π")) {
                if (textfield.getText().equals("")) {
                    textfield.setText(""+Math.PI);
                }else{
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+a*Math.PI);
                }
                m1 = a;
            }
            if (s.equals("e")) {
                if (textfield.getText().equals("")) {
                    textfield.setText(""+e(a));
                }else{
                a = Double.parseDouble(textfield.getText());
                textfield.setText(""+a*e(a));
                }
                m1 = a;
            }
            if (s.equals(".")) {
                if (x == 0) {
                    textfield.setText(textfield.getText() + ".");
                    x = 1;
                } else {
                    textfield.setText(textfield.getText());
                }
            }
            if (s.equals("+/-")) {
                a = Double.parseDouble(textfield.getText());
                if (a > 0) {
                    textfield.setText("-"+Math.abs(a));
                }else if (a < 0) {
                    textfield.setText(""+Math.abs(a));
                }
            }
            if (s.equals("+")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 0;
                    ch = '+';
                } else {
                    temp1 = Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    ch = '+';
                    x = 0;
                }
                textfield.requestFocus();
            }
            if (s.equals("-")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 0;
                    ch = '-';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    ch = '-';
                }
                textfield.requestFocus();
            }
            if (s.equals("*")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = '*';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = '*';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("/")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = '/';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = '/';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("n^x")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = '^';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = '^';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("mod")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = '%';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = '%';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("*10^x")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = '$';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = '$';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("n√x")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = '√';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = '√';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("nCr")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = 'C';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = 'C';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("nPr")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = 'P';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = 'P';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("n-logx")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = 'L';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = 'L';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("e^x")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                    temp1 = 1;
                    ch = 'e';
                } else {
                    x = 0;
                    temp1 = Double.parseDouble(textfield.getText());
                    ch = 'e';
                    textfield.setText("");
                }
                textfield.requestFocus();
            }
            if (s.equals("=")) {
                if (textfield.getText().equals("")) {
                    textfield.setText("");
                }else {
                    temp2 = Double.parseDouble(textfield.getText());
                    switch (ch) {
                        case '+':
                            result = temp1 + temp2;
                            break;
                        case '-':
                            result = temp1 - temp2;
                            break;
                        case '*':
                            result = temp1 * temp2;
                            break;
                        case '/':
                            result = temp1 / temp2;
                            break;
                        case '^':
                            result = Math.pow(temp1, temp2);
                            break;
                        case '%':
                            result = temp1 % temp2;
                            break;
                        case '$':
                            temp2 = Math.pow(10, temp2);
                            result = temp1 * temp2;
                            break;
                        case '√':
                            result = Math.pow(temp1, 1/temp2);
                            break;
                        case 'C':
                            result = C(temp1, temp2);
                            break;
                        case 'P':
                            result = P(temp1, temp2);
                            break;
                        case 'L':
                            result = Math.log10(temp1) / Math.log10(temp2);
                            break;
                        case 'e':
                            temp2 = Math.pow(e(1), temp2);
                            result = temp1 * temp2;
                            break;
                        }
                        textfield.setText("");
                        textfield.setText(textfield.getText() + result);
                        x = 1;
                        m1 = result;
                    }
            }
            if (s.equals("  ---  ")) {
                this.setState(JFrame.ICONIFIED);
            }
            if (s.equals(" ⌫ ")) {
                if (x == 0) {
                    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    x=1;
                }else if (x == 1) {
                    this.setExtendedState(JFrame.NORMAL);
                    x=0;
                }
            }
            textfield.requestFocus();       
    }
    
    // Function to Calculate the Factorial (n!)
    double fact(double x) {
        double u = 1;
        for (double i = 1; i <= x; i++) {
             u *=i;
        }
    return u;
    }
    
    // Function to Calculate the equation of Combinations (nCr)
    double C(double n, double r){
        return fact(n) / (fact(r) * fact(n - r));
    }
    
    // nPr and P Functions are used to Calculate the equation of Permutations (nPr)
    double nPr(double p){
        if (p <= 1) {
            return 1;
        }
        return p * nPr(p - 1);
    }
    
    double P(double n, double r){
        return nPr(n) / nPr(n - r);
    }
    
    // Function to Calculate (e)
    double e(double ex){
        ex = 1.0e-15;
        long fact = 1;
        double e = 2.0;
        int n = 2;
        double e0;
        do {
            e0 = e;
            fact *= n++;
            e += 1.0 / fact;
        } while (Math.abs(e - e0) >= ex);
        return e;
    }
    
    // Event on Mouse Class
    private class Hover implements MouseListener{
        
    // Mouse Click Event
    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == button[54]) {
            System.exit(0);
        }
    }
    
    // Mouse Press Event
    @Override
    public void mousePressed(MouseEvent me) {
       for (JButton B1 : button) {
            if (me.getSource() == B1) {
                B1.setBackground(Color.DARK_GRAY.brighter());
                B1.setOpaque(true);
            }
        }
        if (me.getSource() == button[51]) {
            button[51].setBorder(BorderFactory.createLineBorder(color2.brighter()));
            button[51].setBackground(color2.brighter());
            button[51].setOpaque(true);
        }
        if (me.getSource() == button[54]) {
            button[54].setBorder(BorderFactory.createLineBorder(Color.RED.brighter()));
            button[54].setBackground(Color.RED.brighter());
            button[54].setOpaque(true);
        }
    }
    
    // Mouse Release Event
    @Override
    public void mouseReleased(MouseEvent me) {
        for (JButton B1 : button) {
            if (me.getSource() == B1) {
                B1.setBorder(BorderFactory.createLineBorder(color1));
                B1.setBackground(Color.DARK_GRAY.darker());
                B1.setOpaque(true);
            }
        }
        if (me.getSource() == button[51]) {
            button[51].setBorder(BorderFactory.createLineBorder(color2));
            button[51].setBackground(color2);
            button[51].setOpaque(true);
        }
        if (me.getSource() == button[54]) {
            button[54].setBorder(BorderFactory.createLineBorder(Color.RED));
            button[54].setBackground(Color.RED);
            button[54].setOpaque(true);
        }
    }
    
    // Mouse Entered Event
    @Override
    public void mouseEntered(MouseEvent me) {
        for (JButton B1 : button) {
            if (me.getSource() == B1) {
                B1.setBorder(BorderFactory.createLineBorder(color1));
                B1.setBackground(Color.DARK_GRAY.darker());
                B1.setOpaque(true);
            }
        }
        if (me.getSource() == button[54]) {
            button[54].setBorder(BorderFactory.createLineBorder(Color.RED));
            button[54].setBackground(Color.RED);
            button[54].setOpaque(true);
        }
        if (me.getSource() == button[51]) {
            button[51].setBorder(BorderFactory.createLineBorder(color2));
            button[51].setBackground(color2);
            button[51].setOpaque(true);
        }
    }
    
    // Mouse Exit Event
    @Override
    public void mouseExited(MouseEvent me) {
        for (JButton B1 : button) {
            if (me.getSource() == B1) {
                B1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                B1.setBackground(Color.BLACK);
                B1.setOpaque(true);
            }
        }
    }
    }
}
