import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyPress extends JFrame implements KeyListener {
    JLabel label = new JLabel("DUDE");
    //ImageIcon icon = new ImageIcon("rocket1.png");
    
       KeyPress(){
        this.getContentPane().setBackground(Color.WHITE);
        label.setLocation(0,0);
        label.setSize(150,150);
       // label.setIcon(icon);
       // this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.add(label);
    }

    @Override
    public void keyTyped(KeyEvent e) {/*getKeyCode(); doesnt WORK HERE OMG */
        
     //   System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37: {
                label.setBounds(label.getX()-10,label.getY(),150,150);
                break;
            }
            case 38: {
                label.setBounds(label.getX(),label.getY()-10,150,150);
                break;
            }
            case 40: {
                label.setBounds(label.getX(),label.getY()+10,150,150);
                break;
            }
            case 39: {
                label.setBounds(label.getX()+10,label.getY(),150,150);
                break;
            }
        }
     //System.out.println("Key Pressed is "+e.getKeyCode());
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // System.out.println("Key Pressed is "+e.getKeyCode());
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
    public static void main(String[] args) {
        new KeyPress();
    }
}
