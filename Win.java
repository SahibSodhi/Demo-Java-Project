import javax.swing.*;
import java.awt.*;

class Win1 
{
public void init(){
JFrame p = new JFrame();
JLabel q ; 
JTextField text;

p.setLayout(null);
p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p.setVisible(true);
p.setSize(500,500);
p.setTitle("Hello World");// or we can write this statement in JFrame while declaring its object

q= new JLabel(" This is my first statement");
q.setLocation(20,20);
q.setSize(150,20);
text =new JTextField(20);
text.setLocation(20,60);
text.setSize(140,40);
p.add(text);

JButton button = new JButton("Click Me!!!!!");
button.setLocation(20,140);
button.setSize(100,100);
p.add(button);

/* or JLabel q= new JLabel();
q.setText("This is my first statement");
  */ 
p.add(q);

}}

class Win{
public static void main(String args[])
{
Win1 gui= new Win1();
gui.init();

}

}