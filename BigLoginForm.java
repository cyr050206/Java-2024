import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BigLoginForm extends JFrame implements ActionListener {
    Container c;
    JPanel buttons = new JPanel();
    JLabel name = new JLabel("Name:");
    JLabel gender= new JLabel("Gender:");
    JLabel intrest = new JLabel("Intrest:");
    JLabel favPlace = new JLabel("Favourite Place:");
    JLabel details = new JLabel("Details:");
    JTextField name1 = new JTextField();
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("female");
    JRadioButton cricket = new JRadioButton("Cricket");
    JRadioButton football = new JRadioButton("FoodBall");
    JTextArea details1 = new JTextArea();
    JMenuBar favPlace1 = new JMenuBar();
    
    BigLoginForm(){
        c=getContentPane();
        c.setLayout(null);
       // c.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        ButtonGroup group = new ButtonGroup();
        buttons.add(male);
        buttons.add(female);
        buttons.setLayout(new FlowLayout());
        buttons.setBounds(200,102,100,20);
        
       c.add(buttons);
        // c.setResizable(false);
        group.add(male);
        group.add(female);
        c.add(name);
        name.setBounds(80,40,100,20);
        c.add(name1);
        name1.setBounds(125,41,250,20);
       c.add(gender);
        gender.setBounds(80,102,100,20);
        c.add(intrest);
        intrest.setBounds(80,162,100,20);
       c.add(favPlace);
        favPlace.setBounds(80,222,100,20);
        c.add(male);
        c.add(female);
        buttons.setVisible(true);
        c.add(buttons);
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new BigLoginForm();
    }
}
