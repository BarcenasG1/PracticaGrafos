package Modelo;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author GhostBarcenas (Pintar nodos y enlazar)
 */
public class Lienzo extends JPanel implements MouseListener{
    private Vector<Nodo> vectorNodo;
    
    public Lienzo(){
        this.vectorNodo = new Vector<>();
        this.addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        for(Nodo nodos : vectorNodo){
            nodos.pintar(g);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){            
            this.vectorNodo.add(new Nodo(e.getX(), e.getY()));
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
