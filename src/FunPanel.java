import javax.swing.*;
import java.awt.*;

public class FunPanel extends JPanel {

Funcion FunDeclaradas[]=new Funcion[20];

public FunPanel(){
    FunDeclaradas[0] = new Funcion(50,50,"nombre chingon");
        for(int i=1;i<3;i++){
            FunDeclaradas[i]=new Funcion(FunDeclaradas[i-1].x+2*FunDeclaradas[i-1].r+50,FunDeclaradas[i-1].y,"nombre medio chingon");
        }

    }
    void addFuncion(){


    }
    void crearFuncion(Graphics g, int x, int y, int r, String id){
        g.setColor(Color.BLACK);
        g.fillOval(x,y,2*r,2*r);
        g.setColor(Color.WHITE);
        g.fillOval(x+10,y+10,2*(r-10),2*(r-10));
        g.setColor(Color.BLACK);
        g.drawString(id,x+20,y+r);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int y=0;y<5;y++) {
            try{
                crearFuncion(g, FunDeclaradas[y].x, FunDeclaradas[y].y, FunDeclaradas[y].r, FunDeclaradas[y].name);
            }
            catch (NullPointerException e){}
        }

    }
}
