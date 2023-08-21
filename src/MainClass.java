import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainClass {
	public static void main(String[] args) {
		try {
			HelloLexer lexer = new HelloLexer(CharStreams.fromFileName("input.isi"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			HelloParser parser = new HelloParser(tokenStream);
			parser.init();
			System.out.println("Starting Expression Analysis\n");
			parser.programa();
			System.out.println("Compilation Successful! Good Job\n");
			System.out.println("---------- TARGET -----------");
			parser.generateObjectCode();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
