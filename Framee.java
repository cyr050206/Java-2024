import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Framee extends JFrame implements ActionListener {
JButton button = new JButton("Generate!");
JLabel label = new JLabel("Click to generate a random number:");
JTextField text = new JTextField();
ImageIcon icon = new ImageIcon("image.png");
    Framee(){
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.green);
        this.setVisible(true);
        this.setResizable(false);
        label.setBounds(150,100,400,100);
        label.setFont(new Font("Times new Roman",Font.BOLD,25));

        button.setBounds(250,200,110,50);
        button.setFocusable(false);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        
    
        this.add(label);
        this.add(button);
        
        button.addActionListener(this);


        this.setTitle("dumbo IDK");
    }




    public static void main(String[] args) {
        new Framee();
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        int x = (int) ((Math.random()*1)+1);
      System.out.println(x);
        JOptionPane.showMessageDialog(this,"Your answer is "+x,"Generation",JOptionPane.PLAIN_MESSAGE);
       // this.setSize(700,700);
      

    }
}
