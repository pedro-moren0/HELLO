package ast;

import symbols.Identifier;
import java.util.List;

public class Declaration extends AbstractCommand {

	private List<Identifier> variables;
	
	public Declaration(List<Identifier> identifiers) {
		this.variables = identifiers;
	}
	
	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(variables.get(0).getType().getTargetType());
		strBuilder.append(" ");
		variables.stream().forEach(variable -> {
			strBuilder.append(variable.getText());
			strBuilder.append(
			  variables.indexOf(variable) != variables.size() - 1
			  ? "," : ";\n");
		});
		return strBuilder.toString();
	}

}
