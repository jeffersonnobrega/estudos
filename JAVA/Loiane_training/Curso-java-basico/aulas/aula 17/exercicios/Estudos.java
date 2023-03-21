import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;
  
 
public class Estudos extends JFrame{
  public Estudos() {
    super("Minha primeira aplicação GUI");
    setSize(350, 250);
    setVisible(true);
  }
    
  public static void main(String args[]){
    Estudos app = new Estudos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container janela = getContentPane();
    setLayout(null);

    JLabel labelCep = new JLabel("CEP: ");
    janela.add(labelCep);
    labelCep.setBounds(50,40,100,20);
  }
}