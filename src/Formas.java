import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Formas {
}

class Variable{
    int x,y,x_final;
    String name,value;
    boolean vector;

    public Variable(int x_pos,int y_pos,String nombre,Object valor,boolean vector){
        x=x_pos;
        y=y_pos;
        name=nombre;
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
    String name,tipo;
    List  arguments = new ArrayList();
    List  argTypes = new ArrayList();

    public Funcion(int x_pos, int y_pos,String namex,String tipox,ArrayList types,ArrayList argNames ){
        argTypes=types;
        arguments=argNames;
        name=namex;
        tipo=tipox;
        if(name.length()>tipo.length()){
            r=50+2*name.length();
        }
        else{
            r=50+2*tipo.length();
        }

        x=x_pos;
        y=y_pos;

    }
}




