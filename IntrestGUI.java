import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class IntrestGUI extends JFrame implements ActionListener{
    JLabel principal = new JLabel("principal:");
    JLabel rate = new JLabel("Rate:");
    JLabel time = new JLabel("Time:");
    JButton si = new JButton("Simple Intrest");
    JButton ci = new JButton("Compound Intrest");
    JTextArea result = new JTextArea();
    JTextField p = new JTextField();
    JTextField r = new JTextField();
    JTextField  t = new JTextField();

    IntrestGUI(){
        this.setSize(700,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        
        this.add(rate);
        this.add(time);
        this.add(p);
       this.add(r);
        this.add(t);
        this.add(principal);
       this.add(result);
        this.add(ci);
        this.add(si);
        this.add(result);
        this.setTitle("Intrest Calc!");
        
        principal.setBounds(50,20,100,20);
      //  principal.setFont(new Font(null,20,Font.BOLD));
        p.setBounds(120,20,100,20);
        rate.setBounds(50,60,100,20);
        r.setBounds(120,60,100,20);
        time.setBounds(50,100,80,20);
        t.setBounds(120,100,100,20);
        result.setBounds(100,200,300,200);
        result.setEditable(false);
        si.setBounds(50,150,120,40);
        si.setFocusable(false);
        ci.setFocusable(false);
        ci.setBounds(200,150,150,40);
        si.addActionListener(this);
        ci.addActionListener(this);
        
    }
    public static void main(String[] args){
        new IntrestGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //double p1,r1,t1;
double intrest=0;
double amount=0;
        double p1 = Double.parseDouble(p.getText());
        double r1 = Double.parseDouble(r.getText());
        double t1 = Double.parseDouble(t.getText());
        if(e.getSource() == si){
            intrest = p1*r1*t1/100;
            amount = p1+intrest;
        }
        if(e.getSource() == ci){
            intrest = p1*(Math.pow((1+(r1/100)),t1));
            amount  = p1+intrest;
        }
        result.setText("Intrest: "+intrest+"\nAmount: "+amount);

    }    
}