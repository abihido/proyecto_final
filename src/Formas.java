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
    String name;
    List <String> arguments[] = new List[2];

    public Funcion(int x_pos, int y_pos,String namex){
        arguments[0]= new ArrayList<>();
        arguments[1]= new ArrayList<>();
        name=namex;
        r=50+2*name.length();
        x=x_pos;
        y=y_pos;

    }
}




