import javax.swing.*;
import java.awt.event.*;

class Q2tt {
    public static void main(String args[]) {
        new MCQ();
    }
}

class MCQ extends JFrame implements ActionListener

{
    JFrame f;
    JLabel quest, a, b, c, d, e;
    JButton but;
    JCheckBox a1, b1, c1, d1, e1;

    MCQ() {
        f = new JFrame();
        quest = new JLabel();
        quest.setText("Which of the following primitive datatypes are not integer types?,...");
        quest.setBounds(10, 10, 400, 20);
        a = new JLabel();
        a.setText("A.boolean");
        a.setBounds(10, 30, 100, 20);
        b = new JLabel();
        b.setText("B.byte");
        b.setBounds(10, 50, 100, 20);

        c = new JLabel();
        c.setText("C.float");
        c.setBounds(10, 70, 100, 20);

        d = new JLabel();
        d.setText("D.short");
        d.setBounds(10, 90, 100, 20);

        e = new JLabel();
        e.setText("E.double");
        e.setBounds(10, 110, 100, 20);

        a1 = new JCheckBox("A");
        a1.setBounds(10, 130, 100, 20);
        b1 = new JCheckBox("B");
        b1.setBounds(10, 150, *100, 20);
        c1 = new JCheckBox("C");
        c1.setBounds(10, 170, 100, 20);
        d1 = new JCheckBox("D");
        d1.setBounds(10, 190, 100, 20);
        e1 = new JCheckBox("E");
        e1.setBounds(10, 210, 100, 20);
        but = new JButton("Submit");
        but.setBounds(100, 230, 110, 50);

        JButton dumies = new JButton();

        add(but);
        add(quest);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(a1);
        add(b1);
        add(c1);
        add(d1);
        add(e1);
        add(dumies);
        but.addActionListener(this);

        setVisible(true);
        setLayout(null);
        setSize(350, 350);

        setTitle("MCQ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.charAt(0) == 'S') {
            if (a1.isSelected() && !b1.isSelected() && c1.isSelected() && !d1.isSelected() && e1.isSelected()) {
                JOptionPane.showMessageDialog(f, "Correct answer", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            this.dispose();
        }
    }
}
