import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Formas {
}

class Variable{
    int x,y,x_final;
    String name,value;

    public Variable(int x_pos,int y_pos,String nombre,Object valor){
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
    List <String> arguments[] = new List[2];

    public Funcion(int x_pos, int y_pos,String namex,String tipox){
        arguments[0]= new ArrayList<>();
        arguments[1]= new ArrayList<>();
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




