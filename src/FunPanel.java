import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class FunPanel extends JPanel{

Funcion FunDeclaradas[]=new Funcion[20];
FunListener mouse = new FunListener();
ArrayList types= new ArrayList();
ArrayList argNames= new ArrayList();




    public FunPanel(){
        types.add("int");
        types.add("String");
        argNames.add("cosa");
        argNames.add("cosaPeroEnString");
    FunDeclaradas[0] = new Funcion(50,50,"nombre chingon","ENTERO",types,argNames);
        for(int i=1;i<4;i++){
            FunDeclaradas[i]=new Funcion(FunDeclaradas[i-1].x+2*FunDeclaradas[i-1].r+50,FunDeclaradas[i-1].y,"nombre medio chingon","ENTERO",types,argNames);

        }
        mouse.setFunDeclaradas2(FunDeclaradas);
    addMouseListener(mouse);
    }
    void addFuncion(){


    }
    void drawFuncion(Graphics g, int x, int y, int r, String id, String type){
        g.setColor(Color.BLACK);
        g.fillOval(x,y,2*r,2*r);
        g.setColor(Color.WHITE);
        g.fillOval(x+10,y+10,2*(r-10),2*(r-10));
        g.setColor(Color.BLACK);
        g.drawString(id,x+20,y+r);
        g.drawString(type,x+60,y+r-40);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int y=0;y<5;y++) {
            try{
                drawFuncion(g, FunDeclaradas[y].x, FunDeclaradas[y].y, FunDeclaradas[y].r, FunDeclaradas[y].name,FunDeclaradas[y].tipo);
            }
            catch (NullPointerException e){}
        }

    }
}

class FunDesPanel extends JPanel{

    String name,tipo;
    ArrayList types= new ArrayList();
    ArrayList argNames= new ArrayList();

    public FunDesPanel(Funcion objective) {
        name=objective.name;
        tipo=objective.tipo;
        types= (ArrayList) objective.argTypes;
        argNames= (ArrayList) objective.arguments;

    }
    void fillArguments(Graphics g){
        g.setFont(new Font("Arial",Font.BOLD,40));
        g.setColor(Color.black);
        int x= (getHeight()-name.length()*20)/2 ;
        g.drawString(name,x,50);

        g.drawString("ARGUMENTS",(getHeight()-"ARGUMENTS".length()*25)/2,130);
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString("TIPO DE DATO",(getHeight()/2)-("TIPO DE DATO".length()*12),180);
        g.drawString("|",getHeight()/2,180);
        g.drawString("NOMBRE",(getHeight()/2)+10,180);
        g.setFont(new Font("Arial",Font.ITALIC,20));

        for(int i=0; i<types.size();i++){
            String valor=(String) types.get(i);
            g.drawString(valor,(getHeight()/2)-(valor.length()*10),200+30*i);
            g.drawString(": ",getHeight()/2,200+30*i);
        }
        for(int i=0; i<argNames.size();i++){
            g.drawString((String) argNames.get(i),(getHeight()/2)+10,200+30*i);
        }
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString("TIPO DE RETORNO :"+tipo,((getHeight()-tipo.length()*20)/2)-90 ,500);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        fillArguments(g);
    }
}
