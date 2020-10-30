import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
    
    // Implements Objects from the Classes
    hover h;
    Container cont;
    Color c,c2;
    JPanel Buttonpanel,Textpanel,Exitpanel;
    JTextField textfield;
    JButton [] B;
    Font f,f1;
    JLabel l;
    int x = 0;
    double temp1,temp2,result,a,m1;
    char ch;
    
    // the Class Constractor
    public Calculator() {
            
        // Initialize the Objects
        h = new hover();
        Buttonpanel = new JPanel();
        Textpanel = new JPanel();
        Exitpanel = new JPanel();
        B = new JButton[100];
        f = new Font("seirf", Font.CENTER_BASELINE, 15);
        f1 = new Font("seirf", Font.CENTER_BASELINE, 20);
        c = new Color(255, 255, 255);
        c2 = new Color(0,0,128);
        l = new JLabel("Calculator");
        
        // setting the Container of the Panels
        cont = getContentPane();
        cont.setLayout(new BorderLayout(3,1));
        cont.add("North", Exitpanel);
        cont.add("Center", Textpanel);
        cont.add("South", Buttonpanel);
        
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
        textfield.setForeground(c);
        textfield.setFont(f1);
        
        // setting Layout and Background for the Panels
        Textpanel.add(textfield);
        Textpanel.setLayout(new GridLayout());
        Textpanel.setBackground(Color.BLACK);
        Buttonpanel.setLayout(new GridLayout(13, 4, 1, 1));
        Buttonpanel.setBackground(Color.BLACK);
        Exitpanel.setLayout(new GridLayout());
        Exitpanel.setBackground(Color.BLACK);
        
        // setting Font Color and Style to the Label
        l.setFont(f);
        l.setForeground(c);
        Exitpanel.add(l);
        
        // Buttons Initialization, Font Color, Font Style and Actions
        
        B[0] = new JButton("MC");
        B[0].setForeground(c);
        B[0].setFont(f);
        B[0].setContentAreaFilled( false );
        Buttonpanel.add(B[0]);
        B[0].addActionListener(this);
        B[0].addMouseListener(h);
        
        B[1] = new JButton("M+");
        B[1].setForeground(c);
        B[1].setFont(f);
        B[1].setContentAreaFilled( false );
        Buttonpanel.add(B[1]);
        B[1].addActionListener(this);
        B[1].addMouseListener(h);
        
        B[2] = new JButton("M-");
        B[2].setForeground(c);
        B[2].setFont(f);
        B[2].setContentAreaFilled( false );
        Buttonpanel.add(B[2]);
        B[2].addActionListener(this);
        B[2].addMouseListener(h);
                
        B[3] = new JButton("MR");
        B[3].setForeground(c);
        B[3].setFont(f);
        B[3].setContentAreaFilled( false );
        Buttonpanel.add(B[3]);
        B[3].addActionListener(this);
        B[3].addMouseListener(h);
        
        B[4] = new JButton("Sinh");
        B[4].setForeground(c);
        B[4].setFont(f);
        B[4].setContentAreaFilled( false );
        Buttonpanel.add(B[4]);
        B[4].addActionListener(this);
        B[4].addMouseListener(h);
        
        B[5] = new JButton("Cosh");
        B[5].setForeground(c);
        B[5].setFont(f);
        B[5].setContentAreaFilled( false );
        Buttonpanel.add(B[5]);
        B[5].addActionListener(this);
        B[5].addMouseListener(h);
        
        B[6] = new JButton("Tanh");
        B[6].setForeground(c);
        B[6].setFont(f);
        B[6].setContentAreaFilled( false );
        Buttonpanel.add(B[6]);
        B[6].addActionListener(this);
        B[6].addMouseListener(h);
                
        B[7] = new JButton("Exp");
        B[7].setForeground(c);
        B[7].setFont(f);
        B[7].setContentAreaFilled( false );
        Buttonpanel.add(B[7]);
        B[7].addActionListener(this);
        B[7].addMouseListener(h);
        
        B[8] = new JButton("Sin");
        B[8].setForeground(c);
        B[8].setFont(f);
        B[8].setContentAreaFilled( false );
        Buttonpanel.add(B[8]);
        B[8].addActionListener(this);
        B[8].addMouseListener(h);
        
        B[9] = new JButton("Cos");
        B[9].setForeground(c);
        B[9].setFont(f);
        B[9].setContentAreaFilled( false );
        Buttonpanel.add(B[9]);
        B[9].addActionListener(this);
        B[9].addMouseListener(h);
        
        B[10] = new JButton("Tan");
        B[10].setForeground(c);
        B[10].setFont(f);
        B[10].setContentAreaFilled( false );
        Buttonpanel.add(B[10]);
        B[10].addActionListener(this);
        B[10].addMouseListener(h);
        
        B[11] = new JButton("mod");
        B[11].setForeground(c);
        B[11].setFont(f);
        B[11].setContentAreaFilled( false );
        Buttonpanel.add(B[11]);
        B[11].addActionListener(this);
        B[11].addMouseListener(h);
         
        B[12] = new JButton("Rad");
        B[12].setForeground(c);
        B[12].setFont(f);
        B[12].setContentAreaFilled( false );
        Buttonpanel.add(B[12]);
        B[12].addActionListener(this);
        B[12].addMouseListener(h);
        
        B[13] = new JButton("Deg");
        B[13].setForeground(c);
        B[13].setFont(f);
        B[13].setContentAreaFilled( false );
        Buttonpanel.add(B[13]);
        B[13].addActionListener(this);
        B[13].addMouseListener(h);

        B[14] = new JButton("log");
        B[14].setForeground(c);
        B[14].setFont(f);
        B[14].setContentAreaFilled( false );
        Buttonpanel.add(B[14]);
        B[14].addActionListener(this);
        B[14].addMouseListener(h);

        B[15] = new JButton("n-logx");
        B[15].setForeground(c);
        B[15].setFont(f);
        B[15].setContentAreaFilled( false );
        Buttonpanel.add(B[15]);
        B[15].addActionListener(this);
        B[15].addMouseListener(h);
                        
        B[16] = new JButton("Ran#");
        B[16].setForeground(c);
        B[16].setFont(f);
        B[16].setContentAreaFilled( false );
        Buttonpanel.add(B[16]);
        B[16].addActionListener(this);
        B[16].addMouseListener(h);
        
        B[17] = new JButton("nPr");
        B[17].setForeground(c);
        B[17].setFont(f);
        B[17].setContentAreaFilled( false );
        Buttonpanel.add(B[17]);
        B[17].addActionListener(this);
        B[17].addMouseListener(h);
        
        B[18] = new JButton("nCr");
        B[18].setForeground(c);
        B[18].setFont(f);
        B[18].setContentAreaFilled( false );
        Buttonpanel.add(B[18]);
        B[18].addActionListener(this);
        B[18].addMouseListener(h);
        
        B[19] = new JButton("1/x");
        B[19].setForeground(c);
        B[19].setFont(f);
        B[19].setContentAreaFilled( false );
        Buttonpanel.add(B[19]);
        B[19].addActionListener(this);
        B[19].addMouseListener(h);
                
        B[20] = new JButton("2^x");
        B[20].setForeground(c);
        B[20].setFont(f);
        B[20].setContentAreaFilled( false );
        Buttonpanel.add(B[20]);
        B[20].addActionListener(this);
        B[20].addMouseListener(h);
        
        B[21] = new JButton("*10^x");
        B[21].setForeground(c);
        B[21].setFont(f);
        B[21].setContentAreaFilled( false );
        Buttonpanel.add(B[21]);
        B[21].addActionListener(this);
        B[21].addMouseListener(h);
        
        B[22]= new JButton("n^x");
        B[22].setForeground(c);
        B[22].setFont(f);
        B[22].setContentAreaFilled( false );
        Buttonpanel.add(B[22]);
        B[22].addActionListener(this);
        B[22].addMouseListener(h);
       
        B[23] = new JButton("n^2");
        B[23].setForeground(c);
        B[23].setFont(f);
        B[23].setContentAreaFilled( false );
        Buttonpanel.add(B[23]);
        B[23].addActionListener(this);
        B[23].addMouseListener(h);

        B[24] = new JButton("n√x");
        B[24].setForeground(c);
        B[24].setFont(f);
        B[24].setContentAreaFilled( false );
        Buttonpanel.add(B[24]);
        B[24].addActionListener(this);
        B[24].addMouseListener(h);
        
        B[25] = new JButton("2√x");
        B[25].setForeground(c);
        B[25].setFont(f);
        B[25].setContentAreaFilled( false );
        Buttonpanel.add(B[25]);
        B[25].addActionListener(this);
        B[25].addMouseListener(h);
        
        B[26] = new JButton("e");
        B[26].setForeground(c);
        B[26].setFont(f);
        B[26].setContentAreaFilled( false );
        Buttonpanel.add(B[26]);
        B[26].addActionListener(this);
        B[26].addMouseListener(h);
        
        B[27] = new JButton("e^x");
        B[27].setForeground(c);
        B[27].setFont(f);
        B[27].setContentAreaFilled( false );
        Buttonpanel.add(B[27]);
        B[27].addActionListener(this);
        B[27].addMouseListener(h);
        
        B[28] = new JButton("%");
        B[28].setForeground(c);
        B[28].setFont(f);
        B[28].setContentAreaFilled( false );
        Buttonpanel.add(B[28]);
        B[28].addActionListener(this);
        B[28].addMouseListener(h);
        
        B[29] = new JButton("n!");
        B[29].setForeground(c);
        B[29].setFont(f);
        B[29].setContentAreaFilled( false );
        Buttonpanel.add(B[29]);
        B[29].addActionListener(this);
        B[29].addMouseListener(h);
        
        B[30] = new JButton("C");
        B[30].setForeground(c);
        B[30].setFont(f);
        B[30].setContentAreaFilled( false );
        Buttonpanel.add(B[30]);
        B[30].addActionListener(this);
        B[30].addMouseListener(h);
        
        B[31] = new JButton("←");
        B[31].setForeground(c);
        B[31].setFont(f);
        B[31].setContentAreaFilled( false );
        Buttonpanel.add(B[31]);
        B[31].addActionListener(this);
        B[31].addMouseListener(h);
        
        B[32] = new JButton("|x|");
        B[32].setForeground(c);
        B[32].setFont(f);
        B[32].setContentAreaFilled( false );
        Buttonpanel.add(B[32]);
        B[32].addActionListener(this);
        B[32].addMouseListener(h);
        
        B[33] = new JButton("π");
        B[33].setForeground(c);
        B[33].setFont(f);
        B[33].setContentAreaFilled( false );
        Buttonpanel.add(B[33]);
        B[33].addActionListener(this);
        B[33].addMouseListener(h);
        
        B[34] = new JButton("( - )");
        B[34].setForeground(c);
        B[34].setFont(f);
        B[34].setContentAreaFilled( false );
        Buttonpanel.add(B[34]);
        B[34].addActionListener(this);
        B[34].addMouseListener(h);
        
        B[35] = new JButton("/");
        B[35].setForeground(c);
        B[35].setFont(f);
        B[35].setContentAreaFilled( false );
        Buttonpanel.add(B[35]);
        B[35].addActionListener(this);
        B[35].addMouseListener(h);
        
        B[36] = new JButton("7");
        B[36].setForeground(c);
        B[36].setFont(f);
        B[36].setContentAreaFilled( false );
        Buttonpanel.add(B[36]);
        B[36].addActionListener(this);
        B[36].addMouseListener(h);
        
        B[37] = new JButton("8");
        B[37].setForeground(c);
        B[37].setFont(f);
        B[37].setContentAreaFilled( false );
        Buttonpanel.add(B[37]);
        B[37].addActionListener(this);
        B[37].addMouseListener(h);
        
        B[38] = new JButton("9");
        B[38].setForeground(c);
        B[38].setFont(f);
        B[38].setContentAreaFilled( false );
        Buttonpanel.add(B[38]);
        B[38].addActionListener(this);
        B[38].addMouseListener(h);
        
        B[39] = new JButton("*");
        B[39].setForeground(c);
        B[39].setFont(f);
        B[39].setContentAreaFilled( false );
        Buttonpanel.add(B[39]);
        B[39].addActionListener(this);
        B[39].addMouseListener(h);
        
        B[40] = new JButton("4");
        B[40].setForeground(c);
        B[40].setFont(f);
        B[40].setContentAreaFilled( false );
        Buttonpanel.add(B[40]);
        B[40].addActionListener(this);
        B[40].addMouseListener(h);
        
        B[41] = new JButton("5");
        B[41].setForeground(c);
        B[41].setFont(f);
        B[41].setContentAreaFilled( false );
        Buttonpanel.add(B[41]);
        B[41].addActionListener(this);
        B[41].addMouseListener(h);
        
        B[42] = new JButton("6");
        B[42].setForeground(c);
        B[42].setFont(f);
        B[42].setContentAreaFilled( false );
        Buttonpanel.add(B[42]);
        B[42].addActionListener(this);
        B[42].addMouseListener(h);
        
        B[43] = new JButton("-");
        B[43].setForeground(c);
        B[43].setFont(f);
        B[43].setContentAreaFilled( false );
        Buttonpanel.add(B[43]);
        B[43].addActionListener(this);
        B[43].addMouseListener(h);
        
        B[44] = new JButton("1");
        B[44].setForeground(c);
        B[44].setFont(f);
        B[44].setContentAreaFilled( false );
        Buttonpanel.add(B[44]);
        B[44].addActionListener(this);
        B[44].addMouseListener(h);
        
        B[45] = new JButton("2");
        B[45].setForeground(c);
        B[45].setFont(f);
        B[45].setContentAreaFilled( false );
        Buttonpanel.add(B[45]);
        B[45].addActionListener(this);
        B[45].addMouseListener(h);
        
        B[46] = new JButton("3");
        B[46].setForeground(c);
        B[46].setFont(f);
        B[46].setContentAreaFilled( false );
        Buttonpanel.add(B[46]);
        B[46].addActionListener(this);
        B[46].addMouseListener(h);
        
        B[47] = new JButton("+");
        B[47].setForeground(c);
        B[47].setFont(f);
        B[47].setContentAreaFilled( false );
        Buttonpanel.add(B[47]);
        B[47].addActionListener(this);
        B[47].addMouseListener(h);
        
        B[48] = new JButton("+/-");
        B[48].setForeground(c);
        B[48].setFont(f);
        B[48].setContentAreaFilled( false );
        Buttonpanel.add(B[48]);
        B[48].addActionListener(this);
        B[48].addMouseListener(h);
        
        B[49] = new JButton("0");
        B[49].setForeground(c);
        B[49].setFont(f);
        B[49].setContentAreaFilled( false );
        Buttonpanel.add(B[49]);
        B[49].addActionListener(this);
        B[49].addMouseListener(h);
        
        B[50] = new JButton(".");
        B[50].setForeground(c);
        B[50].setFont(f);
        B[50].setContentAreaFilled( false );
        Buttonpanel.add(B[50]);
        B[50].addActionListener(this);
        B[50].addMouseListener(h);
        
        B[51] = new JButton("=");
        B[51].setForeground(c);
        B[51].setFont(f);
        B[51].setContentAreaFilled( false );
        Buttonpanel.add(B[51]);
        B[51].addActionListener(this);
        B[51].addMouseListener(h);
        
        B[52] = new JButton("  ---  ");
        B[52].setForeground(c);
        B[52].setFont(f);
        B[52].setContentAreaFilled( false );
        Exitpanel.add(B[52]);
        B[52].addActionListener(this);
        B[52].addMouseListener(h);
        
        B[53] = new JButton(" ⌫ ");
        B[53].setForeground(c);
        B[53].setFont(f1);
        B[53].setContentAreaFilled( false );
        Exitpanel.add(B[53]);
        B[53].addActionListener(this);
        B[53].addMouseListener(h);
        
        B[54] = new JButton(" X ");
        B[54].setForeground(c);
        B[54].setFont(f1);
        B[54].setContentAreaFilled( false );
        Exitpanel.add(B[54]);
        B[54].addMouseListener(h);
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
    private class hover implements MouseListener{
        
    // Mouse Click Event
    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == B[54]) {
            System.exit(0);
        }
    }
    
    // Mouse Press Event
    @Override
    public void mousePressed(MouseEvent me) {
       for (JButton B1 : B) {
            if (me.getSource() == B1) {
                B1.setBackground(Color.DARK_GRAY.brighter());
                B1.setOpaque(true);
            }
        }
        if (me.getSource() == B[51]) {
            B[51].setBorder(BorderFactory.createLineBorder(c2.brighter()));
            B[51].setBackground(c2.brighter());
            B[51].setOpaque(true);
        }
        if (me.getSource() == B[54]) {
            B[54].setBorder(BorderFactory.createLineBorder(Color.RED.brighter()));
            B[54].setBackground(Color.RED.brighter());
            B[54].setOpaque(true);
        }
    }
    
    // Mouse Release Event
    @Override
    public void mouseReleased(MouseEvent me) {
        for (JButton B1 : B) {
            if (me.getSource() == B1) {
                B1.setBorder(BorderFactory.createLineBorder(c));
                B1.setBackground(Color.DARK_GRAY.darker());
                B1.setOpaque(true);
            }
        }
        if (me.getSource() == B[51]) {
            B[51].setBorder(BorderFactory.createLineBorder(c2));
            B[51].setBackground(c2);
            B[51].setOpaque(true);
        }
        if (me.getSource() == B[54]) {
            B[54].setBorder(BorderFactory.createLineBorder(Color.RED));
            B[54].setBackground(Color.RED);
            B[54].setOpaque(true);
        }
    }
    
    // Mouse Entered Event
    @Override
    public void mouseEntered(MouseEvent me) {
        for (JButton B1 : B) {
            if (me.getSource() == B1) {
                B1.setBorder(BorderFactory.createLineBorder(c));
                B1.setBackground(Color.DARK_GRAY.darker());
                B1.setOpaque(true);
            }
        }
        if (me.getSource() == B[54]) {
            B[54].setBorder(BorderFactory.createLineBorder(Color.RED));
            B[54].setBackground(Color.RED);
            B[54].setOpaque(true);
        }
        if (me.getSource() == B[51]) {
            B[51].setBorder(BorderFactory.createLineBorder(c2));
            B[51].setBackground(c2);
            B[51].setOpaque(true);
        }
    }
    
    // Mouse Exit Event
    @Override
    public void mouseExited(MouseEvent me) {
        for (JButton B1 : B) {
            if (me.getSource() == B1) {
                B1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                B1.setBackground(Color.BLACK);
                B1.setOpaque(true);
            }
        }
    }
    }
}