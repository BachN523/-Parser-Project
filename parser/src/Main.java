import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import main.antlr.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Hardcoded file path
        String filePath = "C:\\Users\\DJ\\IdeaProjects\\-Parser-Project\\parser\\src\\project_deliverable_1.py";

        // Create lexer and parser instances
        PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(filePath));
        PythonParser parser = new PythonParser(new CommonTokenStream(lexer));

        // Parse the input using the 'assignment' rule (since no 'program' rule exists)
        ParseTree tree = parser.program();

        // Print the parse tree (for debugging/validation purposes)
        System.out.println(tree.toStringTree(parser));
    }
}
