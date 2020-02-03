import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.Arrays;

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

class VarListener implements MouseListener{
    Variable Global[] = new Variable[20];
    Variable Local[] = new Variable[20];
    Variable Extra[][] = new Variable[20][20];

    public void setGlobal(Variable[] global) {
        Global = global;
    }

    public void setLocal(Variable[] local) {
        Local = local;
    }

    public void setExtra(Variable[][] extra) {
        Extra = extra;
    }

    void CheckArrays(int x, int y){
        for(int i=0; i<Global.length;i++){
            try{
                if(x>Global[i].x&&x<Global[i].x+Global[i].x_final&&Global[i].vector){
                    if(y>Global[i].y&&y<Global[i].y+150){
                        JFrame windowFun = new JFrame(Global[i].name);
                        windowFun.setSize(600+Global[i].index*100, 400);
                        windowFun.add(new showArreglo(Extra[Global[i].index],Global[i].name));
                        windowFun.setLocationRelativeTo(null);
                        windowFun.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        windowFun.setVisible(true);
                        break;
                    }
                }
            }
            catch (Exception ex){
                break;
            }
        }
        for(int i=0; i<Local.length;i++){
            try{
                if(x>Local[i].x&&x<Local[i].x+Local[i].x_final&&Local[i].vector){
                    if(y>Local[i].y&&y<Local[i].y+150){
                        JFrame windowFun = new JFrame(Local[i].name);
                        windowFun.add(new showArreglo(Extra[Global[i].index],Global[i].name));
                        windowFun.setSize(Extra[Global[i].index].length*100, 600);
                        windowFun.setLocationRelativeTo(null);
                        windowFun.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        windowFun.setVisible(true);
                        break;
                    }
                }
            }
            catch (Exception ex){
                break;
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        CheckArrays(e.getX(),e.getY());
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