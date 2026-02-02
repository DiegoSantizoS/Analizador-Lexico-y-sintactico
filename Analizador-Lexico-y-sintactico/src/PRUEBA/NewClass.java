package PRUEBA;

import generated.LenguajeLexer;
import generated.LenguajeParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class NewClass {

    // Listener de errores más claro
    static class ThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e) {
            throw new RuntimeException("Error de sintaxis en línea " + line + ":" + charPositionInLine + " -> " + msg);
        }
    }

    public static void main(String[] args) {

        // Código de prueba válido para la gramática en español
        String input = """
            entero x = 5;
            imprimir x;

            mientras (x > 0) {
                x = x - 1;
                imprimir x;
            }

            si (x == 0) {
                imprimir "termino";
            } sino {
                imprimir "no termino";
            }

            booleano ok = verdadero;
            imprimir ok;

            cadena nombre = leer();
            imprimir nombre;
            """;

        // 1) CharStream
        CharStream cs = CharStreams.fromString(input);

        // 2) Lexer
        LenguajeLexer lexer = new LenguajeLexer(cs);

        // Tokenizamos todo sin “romper” el lexer manualmente
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();

        System.out.println("TOKENS:");
        for (Token t : tokenStream.getTokens()) {
            if (t.getType() == Token.EOF) break;
            String type = lexer.getVocabulary().getSymbolicName(t.getType());
            System.out.println("'" + t.getText() + "' -> " + type);
        }

        // 3) Parser
        LenguajeParser parser = new LenguajeParser(tokenStream);

        // (Recomendado) Manejo de errores más estricto
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        // Regla inicial correcta (según la gramática mejorada):
        ParseTree tree = parser.programa();

        System.out.println("\nPARSE TREE:");
        System.out.println(tree.toStringTree(parser));
    }
}
