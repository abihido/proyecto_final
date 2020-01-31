import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VarPanel extends JPanel {
    Variable Global[] = new Variable[20];
    int actualIndex;
    BufferedImage bg = ImageIO.read(new File("input/bg.jpg"));
    public VarPanel() throws IOException {
        addVar("iden","val",actualIndex);
    }

    void addVar(String iden,String val,int i){
            if(i==0){
                Global[i]= new Variable(200,70,iden,val);
            }
            else {
                Global[i]=new Variable(Global[i-1].x+Global[i-1].x_final+30,70,iden,val);
            }
            actualIndex++;
       //     System.out.println("inicia"+Global[i].x+"   termina"+Global[i].x_final);
    }


    void crearVariable(Graphics g, int x, int y, int xfinal, String id, String Val){
        g.setColor(Color.decode("#0D36F5"));
        g.fillRect(x,y,xfinal,150);

        g.clearRect(x+5,y+5,xfinal-10,140);
        g.fillRect(x,y+70,xfinal,5);
        g.setColor(Color.BLACK);
        g.drawString(id,x+10,y+30);
        g.drawString(Val,x+10,y+100);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg,0,0,1500,600,this);
        for(int y=0;y<5;y++) {
            try{
                crearVariable(g, Global[y].x, Global[y].y, Global[y].x_final, Global[y].name, Global[y].value);
            }
            catch (NullPointerException e){}
        }
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.setColor(Color.WHITE);
        g.drawString("NOMBRE : ",70,80);
        g.drawString("VALOR : ",70,180);
        g.setFont(new Font("Arial",Font.BOLD,40));
        g.drawString("VARIABLES GLOBALES",600,40);
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString("NOMBRE : ",50,380);
        g.drawString("VALOR : ",50,480);
        g.setFont(new Font("Arial",Font.BOLD,40));
        g.drawString("VARIABLES LOCALES",600,340);
    }
}