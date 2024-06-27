import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Specify the full path to the input file
            String filePath = "D:\\meow\\programm\\Interpreter\\src\\input.txt";

            // Read input from a file
            Input reader = new Input(filePath);
            String input = reader.getContent();

            // Create the CharStream
            CharStream charStream = CharStreams.fromString(input);

            // Create the lexer
            GrammarNSCLexer lexer = new GrammarNSCLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create the parser
            GrammarNSCParser parser = new GrammarNSCParser(tokens);
            ParseTree tree = parser.program();

            // Create and visit with your visitor
            Visitor visitor = new Visitor();
            visitor.visit(tree);

        } catch (IOException e) {
            System.err.println("Error reading the input file: " + e.getMessage());
        }
    }
}
