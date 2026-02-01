package PRUEBA;

import generated.LenguajeLexer;
import generated.LenguajeParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class NewClass {
    public static void main(String[] args) throws Exception {

        // Example input valid for your grammar:
        String input = """
            int x = 5;
            print x;
            while (x > 0) {
                x = x - 1;
                print x;
            }
            """;

        CharStream cs = CharStreams.fromString(input);

        // 1) Lexer
        LenguajeLexer lexer = new LenguajeLexer(cs);

        // (Optional) Token test
        System.out.println("TOKENS:");
        for (Token t = lexer.nextToken(); t.getType() != Token.EOF; t = lexer.nextToken()) {
            String type = lexer.getVocabulary().getSymbolicName(t.getType());
            System.out.println(t.getText() + " -> " + type);
        }

        // Reset the input for parsing (because we consumed tokens above)
        cs = CharStreams.fromString(input);
        lexer = new LenguajeLexer(cs);

        // 2) Parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LenguajeParser parser = new LenguajeParser(tokens);

        // Your start rule:
        ParseTree tree = parser.program();

        System.out.println("\nPARSE TREE:");
        System.out.println(tree.toStringTree(parser));
    }
}
