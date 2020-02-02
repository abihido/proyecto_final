import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Listeners {
}

class FunListener  implements MouseListener {

    Funcion FunDeclaradas2[] ;

    public FunListener() {
        FunDeclaradas2= new Funcion[20];
    }

    public void setFunDeclaradas2(Funcion[] funDeclaradas2) {
        FunDeclaradas2 = funDeclaradas2;
    }

    void checkArguments(int x, int y) {
        for (int i = 0; i < FunDeclaradas2.length; i++) {
            try {


                int rad = 2 * FunDeclaradas2[i].r;
                int xx = FunDeclaradas2[i].x;
                int yy = FunDeclaradas2[i].y;
                if (x > xx && x < xx + rad) {
                    if (y > yy && y < yy + rad) {
                        JFrame windowFun = new JFrame(FunDeclaradas2[i].name);
                        windowFun.setSize(600, 600);
                        windowFun.add(new FunDesPanel(FunDeclaradas2[i]));
                        windowFun.setLocationRelativeTo(null);
                        windowFun.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        windowFun.setVisible(true);
                        break;
                    }
                }
            } catch (Exception ex) {
                break;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("ole x:"+ e.getX()+"Y"+e.getY());
        checkArguments(e.getX(),e.getY());

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