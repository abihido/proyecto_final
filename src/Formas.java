import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Formas {
}

class Variable{
    int x,y,x_final,index;
    String name,value;
    boolean vector;

    public Variable(int x_pos,int y_pos,String nombre,Object valor,boolean Vector){
        x=x_pos;
        y=y_pos;
        name=nombre;
        vector=Vector;
        value=valor.toString();
        if(name.length()>value.length()){
            x_final=5*name.length()+50;
        }
        else{
            x_final=5*value.length()+50;
        }
    }
}

class Funcion{
    int x,y,r;
    String name,tipo,text;
    List  arguments = new ArrayList();
    List  argTypes = new ArrayList();

    public Funcion(int x_pos, int y_pos,String namex,String tipox,ArrayList types,ArrayList argNames,String Text){
        argTypes=types;
        text=Text;
        arguments=argNames;
        name=namex;
        tipo=tipox;
        if(name.length()>tipo.length()){
            r=50+5*name.length();
        }
        else{
            r=50+5*tipo.length();
        }

        x=x_pos;
        y=y_pos;

    }
}




