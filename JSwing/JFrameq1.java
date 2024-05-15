package JSwing;
//package JSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JFrameq1 extends JFrame implements ActionListener{
            static JButton ok = new JButton("OK");
            static JButton reset = new JButton("Reset");
            static JFrame frame = new JFrame();
            static JTextField username = new JTextField();
            static JPasswordField password = new JPasswordField();
            static JLabel user = new JLabel("Username:");
            static JLabel pass = new JLabel("Password:");
    public static void main(String[] args) {
        //ActionListener a = null;

        
        {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setResizable(false);
        frame.setTitle("Login Form");
        frame.getContentPane().setBackground(Color.white);
        }
        {
        frame.add(ok);
        frame.add(reset);
        frame.setLayout(null);
        frame.add(pass);
        frame.add(user);
        frame.add(username);
        frame.add(password);
        }
        {
            username.setBounds(95,20,100,19);
            password.setBounds(315,20,100,19);
            pass.setFont(new Font("Times new Roman", Font.PLAIN,15));
            pass.setBounds(250,2,250,50);
            user.setBounds(30,2,250,50);
            user.setFont(new Font("Times new Roman", Font.PLAIN,15));
            ok.setBounds(95,60,60,30);
            ok.setFont(new Font("Times new Roman", Font.PLAIN, 15));
            ok.setFocusable(false);
            ok.setBackground(Color.white);
            reset.setBounds(315,60,100,30);
            reset.setFont(new Font("Times new Roman", Font.PLAIN, 15));
            reset.setFocusable(false);
            reset.setBackground(Color.WHITE);
            
        }
        {
            ImageIcon image = new ImageIcon("icon.jpg");
            frame.setIconImage(image.getImage());
        }
            frame.setVisible(true);
    }
    JFrameq1(){
        
         ok.addActionListener(this);       
            }

   // @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            System.out.println("HELLO WORLD");
        }
    }
}

