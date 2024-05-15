


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
    double num1,num2,result=0;
    char operator;
    JButton[] number = new JButton[100];
    // JButton zero = new JButton("0");
    JButton[] function = new JButton[8];
    static JTextArea calc = new JTextArea();
    JPanel buttons = new JPanel();
    ImageIcon icon = new ImageIcon("image.png");
    Calculator() {
        {
            this.setTitle("Calculator");
            this.setIconImage(icon.getImage());
            this.setLayout(null);
            this.add(calc);
          //buttons.addKeyListener(this);
            //this.addKeyListener(this);
          // this.getContentPane().setBackground(Color.blue);
            this.setSize(700, 750);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(buttons);
            buttons.setBackground(Color.GRAY);
            function[0] = new JButton("+");
            function[1] = new JButton("-");
            function[2] = new JButton("*");
            function[3] = new JButton("/");
            function[4] = new JButton("AC");
            function[5] = new JButton("=");
            function[6] = new JButton(".");
            function[7] = new JButton("Del");

            {
                for (int i = 9; i >= 0; i--) {
                    number[i] = new JButton("" + i);
                    number[i].setSize(2, 10);
                    // this.add(number[i]);
                    number[i].setFocusable(false);
                    number[i].setBackground(Color.BLACK);
                    number[i].setFont(new Font("Times new Roman", Font.PLAIN, 18));
                    number[i].setForeground(Color.WHITE);
                    number[i].addActionListener(this);
                  //  number[i].addKeyListener(this);
                    // buttons.add(number[i]);
                }
                buttons.add(number[9]);
                buttons.add(number[8]);
                buttons.add(number[7]);
                buttons.add(function[2]);
                buttons.add(number[6]);
                buttons.add(number[5]);
                buttons.add(number[4]);
                buttons.add(function[1]);
                buttons.add(number[3]);       
                buttons.add(number[2]);
                buttons.add(number[1]);
                buttons.add(function[0]);     
                buttons.add(function[7]);   
                buttons.add(number[0]);
                buttons.add(function[6]);
                buttons.add(function[5]);
                // buttons.setLayout(new GridLayout());
                // this.add(zero);
                for (int i = 0; i < 8; i++) {
                    function[i].setFocusable(false);
                    function[i].setBackground(Color.BLACK);
                    function[i].setFont(new Font("Times new Roman", Font.BOLD, 18));
                    function[i].setForeground(Color.WHITE);
                    function[i].addActionListener(this);
                    function[i].setSize(110, 50);
                }

                // number[0] = new JButton("0");
                // buttons.add(zero);

                // zero.setLocation(140, 415);
                //this.add(function[4]);
            //    function[4].setLocation(15, 465);
                //this.add(function[7]);
              //  function[7].setLocation(140, 465);
            }
            this.add(function[4]); 
            function[4].setBounds(15,140,80,50);
            this.add(function[3]);
            function[3].setBounds(285,140,80,50);
            calc.setBounds(50, 45, 300, 50);
            calc.setFont(new Font("Times new Roman", Font.CENTER_BASELINE, 20));
            calc.setEditable(false);
            buttons.setBounds(15, 200, 350, 250);
            GridLayout grid = new GridLayout(4, 4, 10, 10);

            buttons.setLayout(grid);

        }
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<=10;i++){
            if(e.getSource() == number[i]){
                calc.setText(calc.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == function[6]){
            calc.setText(calc.getText().concat("."));
        }
        if(e.getSource() == function[4]){
            calc.setText("");
        }
        if(e.getSource() == function[3] ){
            //calc.setText(calc.getText().concat("/"));
            num1 = Double.parseDouble(calc.getText());
            operator = '/';
            calc.setText("");
        }
        if(e.getSource() == function[2]){
          //  calc.setText(calc.getText().concat("*"));
            num1 = Double.parseDouble(calc.getText());
            operator = '*';
            calc.setText("");
        }
        if(e.getSource() == function[1]){
           // calc.setText(calc.getText().concat("-"));
            num1 = Double.parseDouble(calc.getText());
            operator = '-';
            calc.setText("");
        }
        if(e.getSource() == function[0]){
            //calc.setText(calc.getText().concat("+"));
            num1 = Double.parseDouble(calc.getText());
            operator = '+';
            calc.setText("");
        }
        if(e.getSource() == function[7]){
            String string = calc.getText();
            calc.setText("");
            for(int i=0;i<string.length()-1;i++){
                calc.setText(calc.getText()+string.charAt(i));
            }
        }
        if(e.getSource() == function[5]){
            num2 = Double.parseDouble(calc.getText());
            switch(operator){
                case '+':
                result = num1+num2;
                break;
                case '-':
                result = num1 - num2;
                break;
                case '*':
                result = num1*num2;
                break;
                case '/':
                result = num1/num2;
                if(num2 ==0){
                    calc.setText("Bruhh");
                }
                try{
                    check0(num2);
                }
                catch(Exception ex){
                  //  calc.setText("Bruhhh");
                    //calc.setText("Cant divide by 0 bruhh");
                }
                break;
            }
                            calc.setText(String.valueOf(result));
                num1 = result;
            }
            
            }
        static void check0(double n) throws ZeroException{
            if(n==0){
                texter();
                throw new ZeroException("Can't divide by 0 bruhh");
            
            }
            
        }
        static void texter(){
            calc.setText("Bruhh");
        }
        public static void main(String[] args) {
            new Calculator();
        
        }
        
        
    }  
    class ZeroException extends Exception{
        ZeroException(String message){
            //System.out.println(message);   
        }
    }