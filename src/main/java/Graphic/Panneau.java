import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  public void paintComponent(Graphics g){
    //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
    System.out.println("Je suis ex�cut�e !"); 
    int x1 = this.getWidth()/4;
    int y1 = this.getHeight()/4;
    //On pr�vient notre JFrame que notre JPanel sera son content pane
    g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
  }               
}