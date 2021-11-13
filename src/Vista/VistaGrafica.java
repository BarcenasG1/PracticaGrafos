package Vista;
import Modelo.Lienzo;
import javax.swing.JFrame;
/**
 * @author GhostBarcenas (Pintar nodos y enlazar)
 */
public class VistaGrafica {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("GRAFO");
        ventana.add(new Lienzo());
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
