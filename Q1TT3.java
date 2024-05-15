import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q1TT3 {
    public static void main(String args[]) {
        try {
            Login form = new Login();
            form.setSize(250, 250);

            form.setVisible(true);
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
        }
    }
}

class Login extends JFrame implements ActionListener, java.awt.event.ActionListener {
    JPanel newP;
    JTextField text1, text2;
    JLabel user, pass;
    JButton b1, b2, b3;

    Login() {
        newP = new JPanel();
        user = new JLabel();
        user.setText("username:");

        text1 = new JTextField(15);

        pass = new JLabel();
        pass.setText("password:");

        text2 = new JTextField(15);

        b1 = new JButton("Submit");
        b2 = new JButton("Clear");
        b3 = new JButton("Exit");
        newP.add(user);
        newP.add(text1);
        newP.add(pass);
        newP.add(text2);
        newP.add(b1);
        newP.add(b2);
        newP.add(b3);

        add(newP, BorderLayout.CENTER);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.charAt(0) == 'S') {
            String userValue = text1.getText();
            String passValue = text2.getText();
            if (userValue.equals("admin") && passValue.equals("pass@123")) {
                JOptionPane.showMessageDialog(newP, "Successful login", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(newP, "Unsuccessful login", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (s.charAt(0) == 'E') {
            this.dispose();
        }

        else {
            text1.setText("");
            text2.setText("");
        }
    }
}
