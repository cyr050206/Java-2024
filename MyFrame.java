import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    JPanel newP=null;
    JButton ok = new JButton("OK");
    static JButton reset = new JButton("Reset");
    // static JFrame this = new JFrame();
    static JTextField username = new JTextField();
    static JPasswordField password = new JPasswordField();
    static JLabel user = new JLabel("Username:");
    static JLabel pass = new JLabel("Password:");
    JFrame after_click = new JFrame();
    MyFrame() {

        this.add(ok);
        
        this.add(reset);
        this.setLayout(null);
        this.add(pass);
        this.add(user);
        this.add(username);
        this.add(password);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 200);
        this.setResizable(false);
        this.setTitle("Login Form");
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        username.setBounds(95, 20, 100, 19);
        password.setBounds(315, 20, 100, 19);
        pass.setFont(new Font("Times new Roman", Font.PLAIN, 15));
        pass.setBounds(250, 2, 250, 50);
        user.setBounds(30, 2, 250, 50);
        user.setFont(new Font("Times new Roman", Font.PLAIN, 15));
        ok.setBounds(95, 60, 60, 30);
        ok.setFont(new Font("Times new Roman", Font.PLAIN, 15));
        ok.setFocusable(false);
        ok.setBackground(Color.white);
        ok.addActionListener(this);
        reset.setBounds(315, 60, 100, 30);
        reset.setFont(new Font("Times new Roman", Font.PLAIN, 15));
        reset.setFocusable(false);
        reset.setBackground(Color.WHITE);
        reset.addActionListener(this);
        ImageIcon image = new ImageIcon("icon.jpg");
        this.setIconImage(image.getImage());
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = username.getText();
        String code = String.valueOf(password.getPassword());
        if(e.getSource() == ok){
            if(name.equals("cyrus")&&(code.equals("cyrus@054")))
            {
            JOptionPane.showConfirmDialog(this, "Login Successful!","Done!",JOptionPane.PLAIN_MESSAGE );
            username.setText("");
            password.setText("");
        }
        else{
            JOptionPane.showConfirmDialog(this, "Unsuccessful! Login","NOT Done!",JOptionPane.PLAIN_MESSAGE );
            //System.out.println(code);
        }
    }
        if(e.getSource() == reset){
            username.setText("");
            password.setText("");
        }
        }
    public static void main(String[] args) {
       new MyFrame();
        }
    }

