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
/*
        fortranLexer lexer;
        if (args.length>0)
            lexer = new fortranLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new fortranLexer(CharStreams.fromStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
        fortranParser parser = new fortranParser((TokenStream) tokens);
        ParseTree tree = parser.begin();

        LEX loader = new LEX();
        loader.visit(tree);*/
    }
}

