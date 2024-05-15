import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
class Details extends JFrame implements ActionListener
{
Container c;
JLabel lblName,lblGen,lblInt,lblFav,lblDet; 
JTextField txtName;
JTextArea txtDet; 
JRadioButton rbM,rbF; 
ButtonGroup bg; 
JCheckBox cbM,cbS; 
JComboBox ddPlace; 
JButton btnSub,btnExit;
 String gen,interest; 
 JPanel cb,checkbox;
String country[]=new String[]{"India","Bangladesh","SriLanka","Pakistan","China"};


Details()
{
c=getContentPane(); 
c.setLayout(null);

lblName=new JLabel("Name: ",JLabel.LEFT); 
lblName.setBounds(80,20,60,20); 
lblGen=new JLabel("Gender: ",JLabel.LEFT); 
lblGen.setBounds(80,60,60,20);
lblInt=new JLabel("Interest: "); 
lblInt.setBounds(80,100,60,20);
 lblFav=new JLabel("Favorite Place: "); 
 lblFav.setBounds(80,140,100,20); 
 lblDet=new JLabel("Details: "); 
 lblDet.setBounds(80,180,100,20);
txtName=new JTextField(10); 
txtName.setBounds(210,20,200,20);

txtDet=new JTextArea(); 
txtDet.setBounds(220,180,250,80); 
txtDet.setEditable(false);

rbM=new JRadioButton("Male"); 
rbM.setBounds(210,45,60,50); 
rbF=new JRadioButton("Female"); 
rbF.setBounds(270,45,100,50);

bg=new ButtonGroup(); 
bg.add(rbM);
bg.add(rbF);
/*if(rbM.isSelected() == true)
{
    gen = rbM.getText();
}
else{
    gen = rbF.getText();
}*/


cb=new JPanel(); 
cb.setBounds(160,90,250,30); 
cbM=new JCheckBox("Music"); 
cbS=new JCheckBox("Swimming"); cb.add(cbM);
cb.add(cbS);




btnSub=new JButton("Submit"); 
btnSub.setBounds(150,270,80,20); 
btnExit=new JButton("Exit"); 
btnExit.setBounds(250,270,80,20);

checkbox=new JPanel();
ddPlace=new JComboBox(country); 
checkbox.setBounds(140,130,250,30); 
checkbox.add(ddPlace);

c.add(lblName); 
c.add(txtName); 
c.add(lblGen); 
c.add(rbM);
c.add(rbF); 
c.add(lblInt); 
c.add(cb); c.add(lblFav); 
c.add(checkbox); c.add(lblDet);
 c.add(txtDet); c.add(btnSub);
  c.add(btnExit);

btnSub.addActionListener(this);
 btnExit.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==btnExit)
{
System.exit(0);
}
else if(ae.getSource()==btnSub)
{
    if(rbM.isSelected() ) gen = "Male";
    else 
    gen = "Female";
//gen=bg.getSelection().getActionCommand();
if(cbM.isSelected()&cbS.isSelected()) interest="Music & Swimming";
else if(cbM.isSelected()&!cbS.isSelected()) interest="Music";
else if(cbS.isSelected()&!cbM.isSelected()) interest="Swimming";
txtDet.setText("Name: "+txtName.getText()+"\nGender: "+gen+"\nInterest: "+interest+"\nFavourite Place: "+ddPlace.getSelectedItem());
}
}
public static void main(String z[])
{
Details obj=new Details(); obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
obj.setBounds(200,200,500,350);
obj.setVisible(true); obj.setTitle("");
}
}
