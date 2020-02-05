import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class VarPanel extends JPanel {
    Variable[] Global = new Variable[20];
    Variable Local[] = new Variable[20];
    Variable Extra[][] = new Variable[20][20];
    int GActualIndex;
    int LActualIndex;
    int ExtraIndex=1;
    VarListener mouse = new VarListener();
    BufferedImage bg = ImageIO.read(new File("input/bg.jpg"));


    public VarPanel() throws IOException {

        addMouseListener(mouse);

    }

    void modifyExtra(int a,int b,String value){
        try{
            Extra[a][b].value=value;
        }
        catch(Exception ex){

        }
    }

    void addExtra(int index,String value,String t){
        int a;
        for(int i =0; i<Extra[index].length;i++){
            try {
              a=Extra[index][i].x;
            }
            catch (Exception ex){
                if(i==0){
                    Extra[index][i] = new Variable(200, 170, Integer.toString(i), value, false,t);
                }
                else {
                    Extra[index][i] = new Variable(Extra[index][i - 1].x + Extra[index][i - 1].x_final + 30, 70, Integer.toString(i), value, false,t);
                }
                break;
            }
        }
        mouse.setExtra(Extra);

    }


    void addVarG(String iden,String val,boolean vector,String t){
            if(GActualIndex==0){
                if(!vector) {
                    Global[GActualIndex] = new Variable(200, 70, iden, val, vector,t);
                }
                else {
                    Global[GActualIndex] = new Variable(200, 70, iden,"", vector,t);
                    Global[GActualIndex].index=ExtraIndex;
                    Extra[ExtraIndex]= new Variable[20];
                    ExtraIndex++;
                }
            }
            else {
                if(vector){
                    Global[GActualIndex] = new Variable(Global[GActualIndex - 1].x + Global[GActualIndex - 1].x_final + 30, 70, iden, "", vector,t);
                    Global[GActualIndex].index=ExtraIndex;
                    Extra[ExtraIndex]= new Variable[20];
                    ExtraIndex++;
                }
                else {
                    Global[GActualIndex] = new Variable(Global[GActualIndex - 1].x + Global[GActualIndex - 1].x_final + 30, 70, iden, val, vector,t);
                }
            }
            GActualIndex++;
            mouse.setGlobal(Global);
            mouse.setExtra(Extra);
       //     System.out.println("inicia"+Global[i].x+"   termina"+Global[i].x_final);
    }
    void addVarL(String iden,String val,boolean vector,String t){
        if(LActualIndex==0){
            if(!vector){
                Local[LActualIndex]= new Variable(200,350,iden,val,vector,t);

            }
            else{
                Local[LActualIndex]= new Variable(200,350,iden,"",vector,t);
                Local[LActualIndex].index=ExtraIndex;
                Extra[ExtraIndex]= new Variable[20];
                ExtraIndex++;
            }

        }
        else {
            if(!vector) {
                Local[LActualIndex] = new Variable(Local[LActualIndex - 1].x + Local[LActualIndex - 1].x_final + 30, 350, iden, val, vector,t);
            }
            else {
                Local[LActualIndex] = new Variable(Local[LActualIndex - 1].x + Local[LActualIndex - 1].x_final + 30, 350, iden, "", vector,t);
                Local[LActualIndex].index=ExtraIndex;
                Extra[ExtraIndex]= new Variable[20];
                ExtraIndex++;
            }
        }
        LActualIndex++;
        mouse.setLocal(Local);
        mouse.setExtra(Extra);
        //     System.out.println("inicia"+Global[i].x+"   termina"+Global[i].x_final);
    }
    String analizador(String actual,String llega,String t){

    if((!actual.matches("\\d+"))&& t.compareTo("int")==0){
        System.err.println("TIPOS INCOMPATIBLES");

    }
    else if (t.compareTo("String")==0||t.compareTo("char")==0){
        return actual+llega;
    } else if (actual.matches("(\\d+)('.'\\d+)")&& t.compareTo("double")==0) {
        return String.valueOf(Double.valueOf(actual)+Double.valueOf(llega));
    }
    else if(actual.matches("\\d+")&& t.compareTo("int")==0){
        return String.valueOf(Integer.valueOf(actual)+Integer.valueOf(llega));
    }
    else{
        return actual+llega;
    }
        return "lmm";
    }
    void  modVariable(String id, String valor){

        for(int i=0;i<20;i++){
            try {

                if (Local[i].name.compareTo(id) == 0) {
                    Local[i].value = analizador(Local[i].value,valor,Local[i].tipo);
                    break;
                }
            }catch (Exception er){

            }
            try{
            if(Global[i].name.compareTo(id)==0){
                Global[i].value=analizador(Global[i].value,valor,Global[i].tipo);
            }else if(i==20){
                System.err.println("no existe esa variable");
            }}
            catch (Exception ex){
            }
        }
        mouse.setLocal(Local);
        mouse.setGlobal(Global);
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
        for(int y=0;y<Global.length;y++) {
            try{
                crearVariable(g, Global[y].x, Global[y].y, Global[y].x_final, Global[y].name, Global[y].value);
            }
            catch (NullPointerException e){}
        }
        for(int y=0;y<Local.length;y++) {
            try{
                crearVariable(g, Local[y].x, Local[y].y, Local[y].x_final, Local[y].name, Local[y].value);
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
class showArreglo extends JPanel{

    Variable[] asoo;
    String Name;
    BufferedImage bg = ImageIO.read(new File("input/bg.jpg"));


    public showArreglo(Variable[] asoo,String name) throws IOException {
        this.asoo = asoo;
        Name=name;
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
        g.drawImage(bg,5,5,getWidth()-10,getHeight()-10,this);
        for(int y=0;y<asoo.length;y++) {
            try{
                crearVariable(g, asoo[y].x, asoo[y].y, asoo[y].x_final, asoo[y].name, asoo[y].value);

            }
            catch (NullPointerException e){}
        }

        g.setFont(new Font("Arial",Font.BOLD,20));
        g.setColor(Color.WHITE);
        g.drawString("NOMBRE : ",70,200);
        g.drawString("VALOR : ",70,280);
        g.setFont(new Font("Arial",Font.BOLD,40));
        g.drawString(Name,200,100);
        //(getWidth()-Name.length()*25)/2
    }


}


