import javax.swing.JOptionPane;

class Window
{
public static void main(String args[])
{
String a = JOptionPane.showInputDialog("Enter first number");
String b = JOptionPane.showInputDialog("Enter second number");


int num1 = Integer.parseInt(a);
int num2 = Integer.parseInt(b);
int sum = num1 + num2;

JOptionPane.showMessageDialog(null, "The sum is "+sum, "Addition Only Calculator", JOptionPane.PLAIN_MESSAGE );
} 
}