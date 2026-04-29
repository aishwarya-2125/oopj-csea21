import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    String msg = "", msg2 = "";
    int x = 150, y = 100, x1 = 150, y1 = 120;

    MouseEventDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
        msg2 = "Mouse Dragged";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
        msg2 = "Mouse Moved";
        repaint();
    }

    public static void main(String args[]) {
        MouseEventDemo me = new MouseEventDemo();
        me.setSize(400, 450);
        me.setTitle("Handling Mouse Event");
        me.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
        g.drawString(msg2, x1, y1);
    }
}


