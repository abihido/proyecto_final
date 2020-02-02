import grammar.lengBasicLexer;
import grammar.lengBasicParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;
import java.io.IOException;

public class Main extends JFrame{
    public Main() throws IOException {
        add(new VarPanel());
    }
    public static void main(String[] args) throws Exception{
        Printer dibujo = new Printer();

        dibujo.Variables();
        dibujo.Funciones();
        dibujo.MenuPrincipal();

    }
}

