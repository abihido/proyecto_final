import grammar.lengBasicLexer;
import grammar.lengBasicParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;
import java.io.IOException;
public class traductor {

    Printer dibujo = new Printer();

    public traductor() throws IOException {

    }


    public static void main(String[] args) throws IOException{

        lengBasicLexer lexer;
        if (args.length>0)
            lexer = new lengBasicLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new lengBasicLexer(CharStreams.fromStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lengBasicParser parser = new lengBasicParser( tokens);
        ParseTree tree = parser.begin();

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new Short_to_unicode(), tree);
        System.out.println(); // print a \n after translation
        System.out.println(tree.toStringTree(parser));
    }
}
