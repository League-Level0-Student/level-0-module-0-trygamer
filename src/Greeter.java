import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String R= JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, "Hi "+R);
} 
}
